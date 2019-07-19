package edu.neu.khoury.cs5004.problem2;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Represents a driver's history as a list of violations committed.
 */
public class DriverHistory extends History {

  /**
   * Constructor for DriverHistory.
   * @param violations a list of traffic violations committed by a driver
   */
  public DriverHistory(ArrayList <Violation> violations) {
    super(violations);
  }

  /**
   * Get the traffic violations for this vehicle.
   * @return a list of traffic violations for this vehicle
   */
  public ArrayList <Violation> getTrafficViolations() {
    return super.getViolations();
  }


  /**
   * A String representation of a driver's history.
   * @return a String representation of a driver's history
   */
  @Override
  public String toString() {
    return "DriverHistory{" +
        "trafficViolations=" + getTrafficViolations() +
        '}';
  }

  /**
   * Compares this driver's history against another driver's history to check for equality.
   * @param o another driver's history
   * @return true if equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof DriverHistory)) return false;
    DriverHistory that = (DriverHistory) o;
    return Objects.equals(getTrafficViolations(), that.getTrafficViolations());
  }

  /**
   * Generates the HashCode for the driver's history.
   * @return an int representation of the driver's history
   */
  @Override
  public int hashCode() {
    return Objects.hash(getTrafficViolations());
  }
}
