package edu.neu.khoury.cs5004.problem2;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Represents a vehicle's history as a list of violations committed.
 */
public class VehicleHistory extends History {

  /**
   * Constructor for a vehicle's history.
   * @param violations a list of violations committed with the vehicle.
   */
  public VehicleHistory(ArrayList <Violation> violations) {
    super(violations);
  }

  public ArrayList <Violation> getVehicleViolations() {
    return super.getViolations();
  }

  /**
   * A String representation of a vehicle's history.
   * @return a String representation of a vehicle's history
   */
  @Override
  public String toString() {
    return "VehicleHistory{" +
        "vehicleViolations=" + getVehicleViolations() +
        '}';
  }

  /**
   * Compares this vehicle's history against another to check for equality.
   * @param o another vehicle's history
   * @return true if equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof VehicleHistory)) return false;
    VehicleHistory that = (VehicleHistory) o;
    return Objects.equals(getVehicleViolations(), that.getVehicleViolations());
  }

  /**
   * Generates the HashCode for the vehicle history.
   * @return an int representation of the vehicle's history
   */
  @Override
  public int hashCode() {
    return Objects.hash(getVehicleViolations());
  }
}
