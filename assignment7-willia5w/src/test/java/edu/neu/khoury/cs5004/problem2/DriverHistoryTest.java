package edu.neu.khoury.cs5004.problem2;

import edu.neu.khoury.cs5004.problem2.ViolationType.DUI;
import edu.neu.khoury.cs5004.problem2.ViolationType.ViolationType;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class DriverHistoryTest {
  private DriverHistory driverHistory;

  @Before
  public void setUp() throws Exception {
    Name driverName1 = new Name("Bilbo", "Baggins");
    LocalDateTime violationDate1 = LocalDateTime.of(2019, 7, 4, 0, 0);
    ViolationType violationType1 = new DUI();
    Violation violation1 = new Violation(driverName1, violationDate1, violationType1);

    Name driverName2 = new Name("Bilbo", "Baggins");
    LocalDateTime violationDate2 = LocalDateTime.of(2089, 7, 4, 0, 0);
    ViolationType violationType2 = new DUI();
    Violation violation2 = new Violation(driverName2, violationDate2, violationType2);

    ArrayList<Violation> violations = new ArrayList <>();
    violations.add(violation1);
    violations.add(violation2);

    driverHistory = new DriverHistory(violations);
  }

  @Test
  public void getTrafficViolations() {
    Name driverName1 = new Name("Bilbo", "Baggins");
    LocalDateTime violationDate1 = LocalDateTime.of(2019, 7, 4, 0, 0);
    ViolationType violationType1 = new DUI();
    Violation violation1 = new Violation(driverName1, violationDate1, violationType1);

    Name driverName2 = new Name("Bilbo", "Baggins");
    LocalDateTime violationDate2 = LocalDateTime.of(2018, 7, 4, 0, 0);
    ViolationType violationType2 = new DUI();
    Violation violation2 = new Violation(driverName2, violationDate2, violationType2);

    ArrayList<Violation> violations = new ArrayList <>();
    violations.add(violation1);
    violations.add(violation2);

    assertEquals(violations, driverHistory.getTrafficViolations());
  }

  @Test
  public void toString1() {
    assertEquals("DriverHistory{trafficViolations=[edu.neu.khoury.cs5004.problem2.Violation@51521cc1, " +
        "edu.neu.khoury.cs5004.problem2.Violation@1b4fb997]}", driverHistory.toString());
  }

  @Test
  public void equals1() {
    int noEquals = 1;
    assertFalse(driverHistory.equals(noEquals));
  }

  @Test
  public void hashCode1() {
    int noEquals = 1;
    assertFalse(driverHistory.hashCode() == noEquals);
  }
}