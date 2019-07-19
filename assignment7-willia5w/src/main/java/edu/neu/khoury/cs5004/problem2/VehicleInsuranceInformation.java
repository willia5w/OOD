package edu.neu.khoury.cs5004.problem2;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Represents information regarding the official owner of the vehicle.
 * Contains additional information regarding other drivers also covered under the policy.
 */
public class VehicleInsuranceInformation {
  private Name officialOwner;
  private ArrayList<Name> otherDrivers;

  /**
   * Constructor for VehicleInsuranceInformation.
   * @param officialOwner the official owner of the vehicle
   * @param otherDrivers other drivers also covered under the policy
   */
  public VehicleInsuranceInformation(Name officialOwner, ArrayList <Name> otherDrivers) {
    this.officialOwner = officialOwner;
    this.otherDrivers = otherDrivers;
  }

  /**
   * Get the name of the official owner of the vehicle.
   * @return the name of the official owner of the vehicle
   */
  public Name getOfficialOwner() {
    return officialOwner;
  }

  /**
   * Get a list of other drivers also covered under the policy.
   * @return a list of other drivers also covered under the policy
   */
  public ArrayList <Name> getOtherDrivers() {
    return otherDrivers;
  }

  /**
   * String representation of the violation.
   * @return String with components of the violation
   */
  @Override
  public String toString() {
    return "VehicleInsuranceInformation{" +
        "officialOwner=" + officialOwner +
        ", otherDrivers=" + otherDrivers +
        '}';
  }

  /**
   * Comapares two insurance to check for equality.
   * @param o another vehicle's insurance information for comparison
   * @return true if equal, false otherwise.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof VehicleInsuranceInformation)) return false;
    VehicleInsuranceInformation that = (VehicleInsuranceInformation) o;
    return getOfficialOwner().equals(that.getOfficialOwner()) &&
        getOtherDrivers().equals(that.getOtherDrivers());
  }

  /**
   * Generates the HashCode for the vehicle insurance information.
   * @return an int representation of the vehicle insurance information
   */
  @Override
  public int hashCode() {
    return Objects.hash(getOfficialOwner(), getOtherDrivers());
  }
}
