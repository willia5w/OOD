package edu.neu.khoury.cs5004.problem2;

import edu.neu.khoury.cs5004.problem2.ViolationType.FenderBender;
import edu.neu.khoury.cs5004.problem2.ViolationType.PaperworkIssue;
import edu.neu.khoury.cs5004.problem2.ViolationType.ViolationType;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class VehicleInformationTest {
  private VehicleInformation vehicleInformation;

  @Before
  public void setUp() throws Exception {
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

    vehicleInformation = new VehicleInformation(vehicleMake, vehicleModel, modelYear,
        officialOwner, vehicleHistory);
  }

  @Test
  public void getVehicleMake() {
    assertEquals("Pontiac", vehicleInformation.getVehicleMake());
  }

  @Test
  public void getVehicleModel() {
    assertEquals("Aztec", vehicleInformation.getVehicleModel());
  }

  @Test
  public void getModelYear() {
    assertEquals(2003, vehicleInformation.getModelYear(), 0);
  }

  @Test
  public void getOfficialOwner() {
    assertEquals("Bilbo Baggins", vehicleInformation.getOfficialOwner().getFullName());
  }

  @Test
  public void getVehicleHistory() {

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

    VehicleHistory expectedVehicleHistory = new VehicleHistory(violations);

    assertEquals(expectedVehicleHistory, vehicleInformation.getVehicleHistory());
  }

  @Test
  public void toString1() {
    assertEquals("VehicleInformation{vehicleMake='Pontiac', vehicleModel='Aztec'," +
        " modelYear=2003, officialOwner=Name{firstName='Bilbo', lastName='Baggins'}, vehicleH" +
        "istory=VehicleHistory{vehicleViolations=[edu.neu.khoury.cs5004.problem2.Violation@515" +
        "21cc1, edu.neu.khoury.cs5004.problem2.Violation@1b4fb997]}}", vehicleInformation.toString());
  }

  @Test
  public void equals1() {
    int noEquals = 1;
    assertFalse(vehicleInformation.equals(noEquals));
  }

  @Test
  public void hashCode1() {
    assertEquals(823201209, vehicleInformation.hashCode(), 0);
  }
}