package edu.neu.khoury.cs5004.problem2;

import edu.neu.khoury.cs5004.problem2.ViolationType.CrashTypeViolationType;
import edu.neu.khoury.cs5004.problem2.ViolationType.FenderBender;
import edu.neu.khoury.cs5004.problem2.ViolationType.PaperworkIssue;
import edu.neu.khoury.cs5004.problem2.ViolationType.CrashWithInjury;
import edu.neu.khoury.cs5004.problem2.ViolationType.CrashWithoutInjury;
import edu.neu.khoury.cs5004.problem2.ViolationType.DistractedDriving;
import edu.neu.khoury.cs5004.problem2.ViolationType.DrivingWithoutValidLicenseInsurance;
import edu.neu.khoury.cs5004.problem2.ViolationType.DUI;
import edu.neu.khoury.cs5004.problem2.ViolationType.FailureToRespectSign;
import edu.neu.khoury.cs5004.problem2.ViolationType.ProblemsWithVehicle;
import edu.neu.khoury.cs5004.problem2.ViolationType.RecklessDriving;
import edu.neu.khoury.cs5004.problem2.ViolationType.Speeding;


import edu.neu.khoury.cs5004.problem2.ViolationType.ViolationType;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class DriverApplicationTest {
  private DriverApplication driverApplication;

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
    LocalDateTime expirationDate = LocalDateTime.of(1700, 5, 1, 0, 0);

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
    ViolationType violationType1 = new FenderBender();
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
    ViolationType driverViolationType1 = new DUI();
    Violation driverViolation1 = new Violation(driverViolationName1, driverViolationDate1, driverViolationType1);

    Name driverViolationName2 = new Name("Bilbo", "Baggins");
    LocalDateTime driverViolationDate2 = LocalDateTime.of(1700, 5, 1, 0, 0);
    ViolationType driverViolationType2 = new DUI();
    Violation driverViolation2 = new Violation(driverViolationName2, driverViolationDate2, driverViolationType2);

    ArrayList<Violation> driverViolations = new ArrayList <>();
    driverViolations.add(driverViolation1);
    driverViolations.add(driverViolation2);

    DriverHistory driverHistory = new DriverHistory(driverViolations);

    driverApplication = new DriverApplication(driverName, driverBirthDate, licenseInformation,
        vehicleInformation, vehicleInsuranceInformation, driverHistory);
  }

  @Test
  public void getDriverName() {
    assertEquals("Bilbo", driverApplication.getDriverName().getFirstName());
  }

  @Test
  public void getDriverBirthDate() {
    LocalDateTime expectedDriverBirthDate = LocalDateTime.of(1700, 5, 1, 0, 0);
    assertEquals(expectedDriverBirthDate, driverApplication.getDriverBirthDate());
  }

  @Test
  public void getDriverLicenseInfo() {
    Integer licenseNumber = 12345;
    Name driverLicenseName = new Name("Bilbo", "Baggins");
    Address driverAddress = new Address(
        "1", "Dirt Lane", "Shire",
        "ME", "88888", "New Zealand");
    LocalDateTime driverLicenseBirthDate = LocalDateTime.of(1700, 5, 1, 0, 0);
    String driverCountry = "New Zealand";
    String driverState= "Middle Earth";
    LocalDateTime issuanceDate = LocalDateTime.of(1700, 5, 1, 0, 0);
    LocalDateTime expirationDate = LocalDateTime.of(1700, 5, 1, 0, 0);

    LicenseInformation expectedLicenseInformation = new LicenseInformation(licenseNumber, driverLicenseName, driverAddress,
        driverLicenseBirthDate, driverCountry, driverState,
        issuanceDate, expirationDate);

    assertTrue(licenseNumber.equals(driverApplication.getDriverLicenseInfo().getLicenseNumber()));
  }

  @Test
  public void getVehicleInformation() {
    String vehicleMake = "Pontiac";
    String vehicleModel = "Aztec";
    Integer modelYear = 2003;
    Name officialOwner = new Name("Bilbo", "Baggins");

    Name driverName1 = new Name("Bilbo", "Baggins");
    LocalDateTime violationDate1 = LocalDateTime.of(1700, 5, 1, 0, 0);
    ViolationType violationType1 = new FenderBender();
    Violation violation1 = new Violation(driverName1, violationDate1, violationType1);

    Name driverName2 = new Name("Frodo", "Baggins");
    LocalDateTime violationDate2 = LocalDateTime.of(1700, 5, 1, 0, 0);
    ViolationType violationType2 = new PaperworkIssue();
    Violation violation2 = new Violation(driverName2, violationDate2, violationType2);

    ArrayList <Violation> violations = new ArrayList <>();
    violations.add(violation1);
    violations.add(violation2);

    VehicleHistory vehicleHistory = new VehicleHistory(violations);

    VehicleInformation expectedVehicleInformation = new VehicleInformation(vehicleMake, vehicleModel, modelYear,
        officialOwner, vehicleHistory);

    assertTrue(expectedVehicleInformation.equals(driverApplication.getVehicleInformation()));
  }

  @Test
  public void getVehicleInsuranceInformation() {
    Name officialInsuredOwner = new Name("Bilbo", "Baggins");
    Name otherDriver1 = new Name("Frodo", "Baggins");
    Name otherDriver2 = new Name("Samwise", "Gangee");

    ArrayList <Name> otherDrivers = new ArrayList <>();
    otherDrivers.add(otherDriver1);
    otherDrivers.add(otherDriver2);

    VehicleInsuranceInformation expectedVehicleInsuranceInformation
        = new VehicleInsuranceInformation(officialInsuredOwner, otherDrivers);

    assertTrue(expectedVehicleInsuranceInformation.equals(driverApplication.getVehicleInsuranceInformation()));
  }

  @Test
  public void getDriverHistory() {
    Name driverViolationName1 = new Name("Bilbo", "Baggins");
    LocalDateTime driverViolationDate1 = LocalDateTime.of(1700, 5, 1, 0, 0);
    ViolationType driverViolationType1 = new DUI();
    Violation driverViolation1 = new Violation(driverViolationName1, driverViolationDate1, driverViolationType1);

    Name driverViolationName2 = new Name("Bilbo", "Baggins");
    LocalDateTime driverViolationDate2 = LocalDateTime.of(1700, 5, 1, 0, 0);
    ViolationType driverViolationType2 = new DUI();
    Violation driverViolation2 = new Violation(driverViolationName2, driverViolationDate2, driverViolationType2);

    ArrayList<Violation> driverViolations = new ArrayList <>();
    driverViolations.add(driverViolation1);
    driverViolations.add(driverViolation2);

    DriverHistory expectedDriverHistory = new DriverHistory(driverViolations);

    assertTrue(expectedDriverHistory.equals(driverApplication.getDriverHistory()));
  }

  @Test
  public void toString1() {
    assertEquals("DriverApplication{driverName=Name{firstName='Bilbo', lastName='Baggins'}, " +
        "driverBirthDate=1700-05-01T00:00, driverLicenseInfo=LicenseInformation{licenseNumber=12345, " +
        "driverName=Name{firstName='Bilbo', lastName='Baggins'}, driverAddress=Address{streetNumber='1'" +
        ", streetName='Dirt Lane', cityName='Shire', stateAcronym='ME', zipCode='88888', countryName='Ne" +
        "w Zealand'}, driverBirthDate=1700-05-01T00:00, driverCountry='New Zealand', driverState='Middle " +
        "Earth', issuanceDate=1700-05-01T00:00, expirationDate=1700-05-01T00:00}, vehicleInformation=Vehic" +
        "leInformation{vehicleMake='Pontiac', vehicleModel='Aztec', modelYear=2003, officialOwner=Name{fir" +
        "stName='Bilbo', lastName='Baggins'}, vehicleHistory=VehicleHistory{vehicleViolations=[edu.neu.khour" +
        "y.cs5004.problem2.Violation@51521cc1, edu.neu.khoury.cs5004.problem2.Violation@1b4fb997]}}, vehicle" +
        "InsuranceInformation=VehicleInsuranceInformation{officialOwner=Name{firstName='Bilbo', lastName='Ba" +
        "ggins'}, otherDrivers=[Name{firstName='Frodo', lastName='Baggins'}, Name{firstName='Samwise', lastN" +
        "ame='Gangee'}]}, driverHistory=DriverHistory{trafficViolations=[edu.neu.khoury.cs5004.problem2.Viol" +
        "ation@deb6432, edu.neu.khoury.cs5004.problem2.Violation@28ba21f3]}}", driverApplication.toString());
  }

  @Test
  public void equals1() {
    int noEquals = 1;
    assertFalse(driverApplication.equals(noEquals));
  }

  @Test
  public void hashCode1() {
    int noEquals = 1;
    assertFalse(driverApplication.hashCode() == noEquals);
  }
}