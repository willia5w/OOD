package edu.neu.khoury.cs5004.problem2;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * A driver's application to become an employee of the ride-share service.
 */
public class DriverApplication {
  private Name driverName;
  private LocalDateTime driverBirthDate;
  private LicenseInformation driverLicenseInfo;
  private VehicleInformation vehicleInformation;
  private VehicleInsuranceInformation vehicleInsuranceInformation;
  private DriverHistory driverHistory;


  /**
   * Constructor for the Driver Application.
   *
   * @param driverName the applicant's name
   * @param driverBirthDate the applicant's birth date
   * @param driverLicenseInfo the applicant's license information
   * @param vehicleInformation the applicant's vehicle information
   * @param vehicleInsuranceInformation the applicant's insurance information
   * @param driverHistory the applicant's driver history
   */
  public DriverApplication(Name driverName, LocalDateTime driverBirthDate, LicenseInformation driverLicenseInfo,
                           VehicleInformation vehicleInformation,
                           VehicleInsuranceInformation vehicleInsuranceInformation, DriverHistory driverHistory) {
    this.driverName = driverName;
    this.driverBirthDate = driverBirthDate;
    this.driverLicenseInfo = driverLicenseInfo;
    this.vehicleInformation = vehicleInformation;
    this.vehicleInsuranceInformation = vehicleInsuranceInformation;
    this.driverHistory = driverHistory;
  }

  /**
   * Get the applicant's name.
   * @return the applicant's name
   */
  public Name getDriverName() {
    return driverName;
  }

  /**
   * Get the applicant's birth date.
   * @return the applicant's birth date
   */
  public LocalDateTime getDriverBirthDate() {
    return driverBirthDate;
  }

  /**
   * Get the applicant's license information.
   * @return the applicant's license information
   */
  public LicenseInformation getDriverLicenseInfo() {
    return driverLicenseInfo;
  }

  /**
   * Get the applicant's vehicle information.
   * @return the applicant's vehicle information
   */
  public VehicleInformation getVehicleInformation() {
    return vehicleInformation;
  }

  /**
   * Get the applicant's insurance information.
   * @return the applicant's insurance information
   */
  public VehicleInsuranceInformation getVehicleInsuranceInformation() {
    return vehicleInsuranceInformation;
  }

  /**
   * Get the applicant's driver history.
   * @return the applicant's driver history
   */
  public DriverHistory getDriverHistory() {
    return driverHistory;
  }

  /**
   * A String representation of a driver's application.
   * @return a String representation of a driver's application
   */
  @Override
  public String toString() {
    return "DriverApplication{" +
        "driverName=" + driverName +
        ", driverBirthDate=" + driverBirthDate +
        ", driverLicenseInfo=" + driverLicenseInfo +
        ", vehicleInformation=" + vehicleInformation +
        ", vehicleInsuranceInformation=" + vehicleInsuranceInformation +
        ", driverHistory=" + driverHistory +
        '}';
  }

  /**
   * Compares this driver's application against another driver's application to check for equality.
   * @param o another driver's application
   * @return true if equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof DriverApplication)) return false;
    DriverApplication that = (DriverApplication) o;
    return getDriverName().equals(that.getDriverName()) &&
        getDriverBirthDate().equals(that.getDriverBirthDate()) &&
        getDriverLicenseInfo().equals(that.getDriverLicenseInfo()) &&
        getVehicleInformation().equals(that.getVehicleInformation()) &&
        getVehicleInsuranceInformation().equals(that.getVehicleInsuranceInformation()) &&
        getDriverHistory().equals(that.getDriverHistory());
  }

  /**
   * Generates the HashCode for the driver's application.
   * @return an int representation of the driver's application
   */
  @Override
  public int hashCode() {
    return Objects.hash(getDriverName(), getDriverBirthDate(), getDriverLicenseInfo(), getVehicleInformation(), getVehicleInsuranceInformation(), getDriverHistory());
  }
}
