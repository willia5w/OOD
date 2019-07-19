package edu.neu.khoury.cs5004.problem2;

import edu.neu.khoury.cs5004.problem2.ViolationType.PaperworkIssue;
import edu.neu.khoury.cs5004.problem2.ViolationType.ParkingViolation;
import edu.neu.khoury.cs5004.problem2.ViolationType.ProblemsWithVehicle;
import edu.neu.khoury.cs5004.problem2.ViolationType.ViolationType;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class RegistrationValidatorTest {
  private RegistrationValidator registrationValidator;
  // SETUP TO PASS ALL CHECKS
  @Before
  public void setUp() throws Exception {
    Name driverName = new Name("Bilbo", "Baggins");
    LocalDateTime driverBirthDate = LocalDateTime.of(1700, 5, 1, 0, 0);

    // Construct LicenseInformation
    Integer licenseNumber = 12345;
    Name driverLicenseName = new Name("Bilbo", "Baggins");
    Address driverAddress = new Address(
        "1", "Dirt Lane", "Shire",
        "ME", "88888", "New Zealand");
    LocalDateTime driverLicenseBirthDate = LocalDateTime.of(1700, 5, 1, 0, 0);
    String driverCountry = "New Zealand";
    String driverState= "Middle Earth";
    LocalDateTime issuanceDate = LocalDateTime.of(1700, 5, 1, 0, 0);
    LocalDateTime expirationDate = LocalDateTime.of(1700, 6, 1, 0, 0);

    LicenseInformation licenseInformation = new LicenseInformation(licenseNumber, driverLicenseName, driverAddress,
        driverLicenseBirthDate, driverCountry, driverState,
        issuanceDate, expirationDate);

    // Construct VehicleInformation
    String vehicleMake = "Pontiac";
    String vehicleModel = "Aztec";
    Integer modelYear = 2003;
    Name officialOwner = new Name("Bilbo", "Baggins");

    Name driverName1 = new Name("Bilbo", "Baggins");
    LocalDateTime violationDate1 = LocalDateTime.of(1700, 5, 1, 0, 0);
    ViolationType violationType1 = new ParkingViolation();
    Violation violation1 = new Violation(driverName1, violationDate1, violationType1);

    Name driverName2 = new Name("Frodo", "Baggins");
    LocalDateTime violationDate2 = LocalDateTime.of(1700, 5, 1, 0, 0);
    ViolationType violationType2 = new PaperworkIssue();
    Violation violation2 = new Violation(driverName2, violationDate2, violationType2);

    ArrayList <Violation> violations = new ArrayList <>();
    violations.add(violation1);
    violations.add(violation2);

    VehicleHistory vehicleHistory = new VehicleHistory(violations);

    VehicleInformation vehicleInformation = new VehicleInformation(vehicleMake, vehicleModel, modelYear,
        officialOwner, vehicleHistory);

    // Construct VehicleInsuranceInformation
    Name officialInsuredOwner = new Name("Bilbo", "Baggins");
    Name otherDriver1 = new Name("Frodo", "Baggins");
    Name otherDriver2 = new Name("Samwise", "Gangee");

    ArrayList <Name> otherDrivers = new ArrayList <>();
    otherDrivers.add(otherDriver1);
    otherDrivers.add(otherDriver2);

    VehicleInsuranceInformation vehicleInsuranceInformation
        = new VehicleInsuranceInformation(officialInsuredOwner, otherDrivers);

    // Construct DriverHistory
    Name driverViolationName1 = new Name("Bilbo", "Baggins");
    LocalDateTime driverViolationDate1 = LocalDateTime.of(1700, 5, 1, 0, 0);
    ViolationType driverViolationType1 = new PaperworkIssue();
    Violation driverViolation1 = new Violation(driverViolationName1, driverViolationDate1, driverViolationType1);

    Name driverViolationName2 = new Name("Bilbo", "Baggins");
    LocalDateTime driverViolationDate2 = LocalDateTime.of(1700, 5, 1, 0, 0);
    ViolationType driverViolationType2 = new ProblemsWithVehicle();
    Violation driverViolation2 = new Violation(driverViolationName2, driverViolationDate2, driverViolationType2);

    ArrayList<Violation> driverViolations = new ArrayList <>();
    driverViolations.add(driverViolation1);
    driverViolations.add(driverViolation2);

    DriverHistory driverHistory = new DriverHistory(driverViolations);

    DriverApplication acceptedDriverApplication = new DriverApplication(driverName, driverBirthDate, licenseInformation,
        vehicleInformation, vehicleInsuranceInformation, driverHistory);

    ArrayList<DriverApplication> acceptedApplications = new ArrayList <>();
    acceptedApplications.add(acceptedDriverApplication);

    // Creating duplicate to test accepted list add error
    DriverApplication prospectiveApplication = new DriverApplication(driverName, driverBirthDate, licenseInformation,
        vehicleInformation, vehicleInsuranceInformation, driverHistory);

    registrationValidator = new RegistrationValidator(acceptedApplications, prospectiveApplication);
  }

  @Test
  public void checkDriverAgePass() {
    assertTrue(registrationValidator.checkDriverAge());
  }

  @Test
  public void checkDriverAgeFail() {
    // Create instance of RegistrationValidator with DriverAge < 21
  }

  @Test
  public void checkVehicleAgePass() {
    assertTrue(registrationValidator.checkVehicleAge());
  }

  @Test
  public void checkVehicleAgeFail() {
    // Create instance of RegistrationValidator with VehicleAge > 20
  }

  @Test
  public void checkDriverLicenseInfoPass() {
    assertTrue(registrationValidator.checkDriverLicenseInfo());
  }

  @Test
  public void checkDriverLicenseInfoFail() {
    // Create instance of RegistrationValidator with driver BirthDate mismatched
  }

  @Test
  public void checkInsuranceInfoPass() {
    assertTrue(registrationValidator.checkInsuranceInfo());
  }

  @Test
  public void checkInsuranceInfoFail() {
    // Create instance of RegistrationValidator without DriverName in InsuranceInfo
  }

  @Test
  public void checkDriverHistoryPass() {
    assertTrue(registrationValidator.checkDriverHistory());
  }

  @Test
  public void checkDriverHistoryFail() {
    // Create instance of RegistrationValidator with multiple MovingViolations
  }

  @Test
  public void checkVehicleHistoryPass() {
    assertTrue(registrationValidator.checkVehicleHistory());
  }

  @Test
  public void checkVehicleHistoryFail() {
    // Create instance of RegistrationValidator with recent MovingViolations in VehicleHistory
  }

  @Test (expected = UnhirableDriverException.class)
  public void validateDriver() throws UnhirableDriverException {
    registrationValidator.validateDriver();
  }

  @Test
  public void toString1() {
    assertEquals("RegistrationValidator{acceptedDrivers=[DriverApplication{" +
        "driverName=Name{firstName='Bilbo', lastName='Baggins'}, driverBirthDate=1700-05-01T00:00, " +
        "driverLicenseInfo=LicenseInformation{licenseNumber=12345, driverName=Name{firstName='Bilbo', l" +
        "astName='Baggins'}, driverAddress=Address{streetNumber='1', streetName='Dirt Lane', cityName='Shire'," +
        " stateAcronym='ME', zipCode='88888', countryName='New Zealand'}, driverBirthDate=1700-05-01T00:00, " +
        "driverCountry='New Zealand', driverState='Middle Earth', issuanceDate=1700-05-01T00:00, " +
        "expirationDate=1700-05-01T00:00}, vehicleInformation=VehicleInformation{vehicleMake='Pontiac', " +
        "vehicleModel='Aztec', modelYear=2003, officialOwner=Name{firstName='Bilbo', lastName='Baggins'}, " +
        "vehicleHistory=VehicleHistory{vehicleViolations=[edu.neu.khoury.cs5004.problem2.Violation@1b4fb997, " +
        "edu.neu.khoury.cs5004.problem2.Violation@deb6432]}}, " +
        "vehicleInsuranceInformation=VehicleInsuranceInformation{officialOwner=Name{firstName='Bilbo', " +
        "lastName='Baggins'}, otherDrivers=[Name{firstName='Frodo', lastName='Baggins'}, Name{firstName=" +
        "'Samwise', lastName='Gangee'}]}, driverHistory=DriverHistory{trafficViolations=[edu.neu.khoury.cs5004." +
        "problem2.Violation@28ba21f3, edu.neu.khoury.cs5004.problem2.Violation@694f9431]}}], driverApplication=" +
        "DriverApplication{driverName=Name{firstName='Bilbo', lastName='Baggins'}, driverBirthDate=1700-05-01T00:00," +
        " driverLicenseInfo=LicenseInformation{licenseNumber=12345, driverName=Name{firstName='Bilbo', lastName='" +
        "Baggins'}, driverAddress=Address{streetNumber='1', streetName='Dirt Lane', cityName='Shire', " +
        "stateAcronym='ME', zipCode='88888', countryName='New Zealand'}, driverBirthDate=1700-05-01T00:00, " +
        "driverCountry='New Zealand', driverState='Middle Earth', issuanceDate=1700-05-01T00:00, " +
        "expirationDate=1700-05-01T00:00}, vehicleInformation=VehicleInformation{vehicleMake='Pontiac'," +
        " vehicleModel='Aztec', modelYear=2003, officialOwner=Name{firstName='Bilbo', lastName='Baggins'}," +
        " vehicleHistory=VehicleHistory{vehicleViolations=[edu.neu.khoury.cs5004.problem2.Violation@1b4fb997," +
        " edu.neu.khoury.cs5004.problem2.Violation@deb6432]}}, vehicleInsuranceInformation=VehicleInsurance" +
        "Information{officialOwner=Name{firstName='Bilbo', lastName='Baggins'}, otherDrivers=[Name{firstName=" +
        "'Frodo', lastName='Baggins'}, Name{firstName='Samwise', lastName='Gangee'}]}, driverHistory=" +
        "DriverHistory{trafficViolations=[edu.neu.khoury.cs5004.problem2.Violation@28ba21f3, edu.neu.khoury" +
        ".cs5004.problem2.Violation@694f9431]}}}", registrationValidator.toString());

  }

  @Test
  public void equals1() {
    int noEquals = 1;
    assertFalse(registrationValidator.equals(noEquals));
  }

  @Test
  public void hashCode1() {
    int noEquals = 1;
    assertFalse(registrationValidator.hashCode() == noEquals);
  }
}