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

// Maybe we should create a Violations abstract class extended to Driver and Vehicle
// with validate() methods to check for unacceptable infractions?
public class VehicleHistoryTest {
  private VehicleHistory vehicleHistory;

  @Before
  public void setUp() throws Exception {
    Name driverName1 = new Name("Bilbo", "Baggins");
    LocalDateTime violationDate1 = LocalDateTime.of(1700, 5, 1, 0, 0);
    ViolationType violationType1 = new FenderBender();
    Violation violation1 = new Violation(driverName1, violationDate1, violationType1);

    Name driverName2 = new Name("Frodo", "Baggins");
    LocalDateTime violationDate2 = LocalDateTime.of(1700, 5, 1, 0, 0);
    ViolationType violationType2 = new PaperworkIssue();
    Violation violation2 = new Violation(driverName2, violationDate2, violationType2);

    ArrayList<Violation> violations = new ArrayList <>();
    violations.add(violation1);
    violations.add(violation2);

    vehicleHistory = new VehicleHistory(violations);
  }

  @Test
  public void getTrafficViolations() {
    Name driverName1 = new Name("Bilbo", "Baggins");
    LocalDateTime violationDate1 = LocalDateTime.of(1700, 5, 1, 0, 0);
    ViolationType violationType1 = new FenderBender();
    Violation violation1 = new Violation(driverName1, violationDate1, violationType1);

    Name driverName2 = new Name("Frodo", "Baggins");
    LocalDateTime violationDate2 = LocalDateTime.of(1700, 5, 1, 0, 0);
    ViolationType violationType2 = new PaperworkIssue();
    Violation violation2 = new Violation(driverName2, violationDate2, violationType2);

    ArrayList<Violation> violations = new ArrayList <>();
    violations.add(violation1);
    violations.add(violation2);

    assertEquals(violations, vehicleHistory.getVehicleViolations());
  }

  @Test
  public void toString1() {
    assertEquals("VehicleHistory{vehicleViolations=[edu.neu.khour" +
        "y.cs5004.problem2.Violation@51521cc1, edu.neu.khoury.cs5004.problem2." +
        "Violation@1b4fb997]}", vehicleHistory.toString());
  }

  @Test
  public void equals1() {
    int noEquals = 1;
    assertFalse(vehicleHistory.equals(noEquals));
  }

  @Test
  public void hashCode1() {
    assertEquals(-1.97052202E8, vehicleHistory.hashCode(), 0);
  }
}