package edu.neu.khoury.cs5004.problem2;

import java.util.Date;
import java.util.Objects;

/**
 * Vehicle Information is composed of the vehicle's make, model, year, owner, and history.
 */
public class VehicleInformation {
  private String vehicleMake;
  private String vehicleModel;
  private Integer modelYear;
  private Name officialOwner;
  private VehicleHistory vehicleHistory;

  /**
   * Constructor for VehicleInformation:
   *
   * @param vehicleMake the make of the vehicle
   * @param vehicleModel the model of the vehicle
   * @param modelYear the model year of the vehicle
   * @param officialOwner the name of the vehicle's official owner
   * @param vehicleHistory the history of the violations committed with the vehicle
   */
  public VehicleInformation(String vehicleMake, String vehicleModel, Integer modelYear,
                            Name officialOwner, VehicleHistory vehicleHistory) {
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.modelYear = modelYear;
    this.officialOwner = officialOwner;
    this.vehicleHistory = vehicleHistory;
  }

  /**
   * Get the make of the vehicle.
   * @return the make of the vehicle
   */
  public String getVehicleMake() {
    return vehicleMake;
  }

  /**
   * Get the model of the vehicle.
   * @return the model of the vehicle
   */
  public String getVehicleModel() {
    return vehicleModel;
  }

  /**
   * Get the model year of the vehicle.
   * @return the model year of the vehicle
   */
  public Integer getModelYear() {
    return modelYear;
  }

  /**
   * Get the name of the vehicle's official owner.
   * @return the name of the vehicle's official owner
   */
  public Name getOfficialOwner() {
    return officialOwner;
  }

  /**
   * Get the history of the violations committed with the vehicle.
   * @return the history of the violations committed with the vehicle
   */
  public VehicleHistory getVehicleHistory() {
    return vehicleHistory;
  }

  /**
   * String representation of the vehicle information.
   * @return String with components of the vehicle information
   */
  @Override
  public String toString() {
    return "VehicleInformation{" +
        "vehicleMake='" + vehicleMake + '\'' +
        ", vehicleModel='" + vehicleModel + '\'' +
        ", modelYear=" + modelYear +
        ", officialOwner=" + officialOwner +
        ", vehicleHistory=" + vehicleHistory +
        '}';
  }

  /**
   * Comapares two sets of vehicle information to check for equality.
   * @param o another vehicle's information for comparison
   * @return true if equal, false otherwise.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof VehicleInformation)) return false;
    VehicleInformation that = (VehicleInformation) o;
    return getVehicleMake().equals(that.getVehicleMake()) &&
        getVehicleModel().equals(that.getVehicleModel()) &&
        getModelYear().equals(that.getModelYear()) &&
        getOfficialOwner().equals(that.getOfficialOwner()) &&
        Objects.equals(getVehicleHistory(), that.getVehicleHistory());
  }

  /**
   * Generates the HashCode for the vehicle information.
   * @return an int representation of the vehicle information
   */
  @Override
  public int hashCode() {
    return Objects.hash(getVehicleMake(), getVehicleModel(), getModelYear(), getOfficialOwner(), getVehicleHistory());
  }
}
