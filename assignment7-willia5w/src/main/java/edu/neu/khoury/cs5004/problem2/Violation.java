package edu.neu.khoury.cs5004.problem2;

import edu.neu.khoury.cs5004.problem2.ViolationType.ViolationType;

import java.time.LocalDateTime;

/**
 * Represents a Violation given a driver's name and the date of occurrence.
 */
public class Violation {
  private Name driverName;
  private LocalDateTime violationDate;
  private ViolationType violationType;

  /**
   * Constructor for a violation.
   * @param driverName the offending driver's name
   * @param violationDate date of occurrence
   */
  public Violation(Name driverName, LocalDateTime violationDate, ViolationType violationType) {
    this.driverName = driverName;
    this.violationDate = violationDate;
    this.violationType = violationType;
  }

  /**
   * Get the offending driver's name.
   * @return the offending driver's name
   */
  public Name getDriverName() {
    return driverName;
  }

  /**
   * Get the date of occurrence.
   * @return the date of occurrence
   */
  public LocalDateTime getViolationDate() {
    return violationDate;
  }

  /**
   * Get the violation type.
   * @return the violation type
   */
  public ViolationType getViolationType() {
    return violationType;
  }
}
