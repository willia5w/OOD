package edu.neu.khoury.cs5004.problem2;

import edu.neu.khoury.cs5004.problem2.ViolationType.DUI;
import edu.neu.khoury.cs5004.problem2.ViolationType.MovingViolationType;
import edu.neu.khoury.cs5004.problem2.ViolationType.ViolationType;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.Assert.*;

public class ViolationTest {
  private Violation violation;

  @Before
  public void setUp() throws Exception {
    Name driverName = new Name("Bilbo", "Baggins");
    LocalDateTime violationDate = LocalDateTime.of(1700, 5, 1, 0, 0);
    ViolationType violationType = new DUI();
    violation = new Violation(driverName, violationDate, violationType);
  }

  @Test
  public void getDriverName() {
    assertEquals("Bilbo Baggins", violation.getDriverName().getFullName());
  }

  @Test
  public void getViolationDate() {
    LocalDateTime expectedViolationDate = LocalDateTime.of(1700, 5, 1, 0, 0);
    assertEquals(violation.getViolationDate(), expectedViolationDate);
  }

  @Test
  public void getViolationType() {
    assertEquals(MovingViolationType.class, violation.getViolationType());
  }

  @Test
  public void toString1() {
    assertEquals("edu.neu.khoury.cs5004.problem2.Violation@51521cc1", violation.toString());
  }

  @Test
  public void equals1() {
    int noEquals = 1;
    assertFalse(violation.equals(noEquals));
  }

  @Test
  public void hashCode1() {
    assertEquals(1.364335809E9, violation.hashCode(), 0);
  }
}