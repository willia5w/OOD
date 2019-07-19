package edu.neu.khoury.cs5004.problem2;

import java.util.ArrayList;

/**
 * History represents a list of violations committed.
 */
public abstract class History {
  private ArrayList <Violation> violations;

  /**
   * Constructor for History.
   * @param violations a list of violations committed
   */
  public History(ArrayList <Violation> violations) {
    this.violations = violations;
  }

  /**
   * Get the list of violations committed.
   * @return the list of violations committed
   */
  public ArrayList <Violation> getViolations() {
    return violations;
  }
}
