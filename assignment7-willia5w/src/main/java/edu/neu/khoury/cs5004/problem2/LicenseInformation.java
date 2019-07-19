package edu.neu.khoury.cs5004.problem2;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * LicenseInformation stores all information related to a driver's license.
 */
public class LicenseInformation {
  private Integer licenseNumber;
  private Name driverName;
  private Address driverAddress;
  private LocalDateTime driverBirthDate;
  private String driverCountry;
  private String driverState;
  private LocalDateTime issuanceDate;
  private LocalDateTime expirationDate;

  /**
   * Constructor for the LicenseInformation class
   *
   * @param licenseNumber the unique driver's license number
   * @param driverName the name of the driver
   * @param driverAddress the driver's address
   * @param driverBirthDate the driver's birth date
   * @param driverCountry the driver's country
   * @param driverState the driver's state
   * @param issuanceDate the license issuance date
   * @param expirationDate the license expiration date
   */
  public LicenseInformation(Integer licenseNumber, Name driverName, Address driverAddress,
                            LocalDateTime driverBirthDate, String driverCountry, String driverState,
                            LocalDateTime issuanceDate, LocalDateTime expirationDate) {
    this.licenseNumber = licenseNumber;
    this.driverName = driverName;
    this.driverAddress = driverAddress;
    this.driverBirthDate = driverBirthDate;
    this.driverCountry = driverCountry;
    this.driverState = driverState;
    this.issuanceDate = issuanceDate;
    this.expirationDate = expirationDate;
  }

  /**
   * Get the unique driver's license number.
   * @return the unique driver's license number
   */
  public Integer getLicenseNumber() {
    return licenseNumber;
  }

  /**
   * Get the name of the driver.
   * @return the name of the driver
   */
  public Name getDriverName() {
    return driverName;
  }
  /**
   * Get the driver's address.
   * @return the driver's address
   */
  public Address getDriverAddress() {
    return driverAddress;
  }

  /**
   * Get the driver's birth date.
   * @return the driver's birth date
   */
  public LocalDateTime getDriverBirthDate() {
    return driverBirthDate;
  }

  /**
   * Get the driver's country.
   * @return the driver's country
   */
  public String getDriverCountry() {
    return driverCountry;
  }

  /**
   * Get the driver's state.
   * @return the driver's state
   */
  public String getDriverState() {
    return driverState;
  }

  /**
   * Get the license issuance date.
   * @return the license issuance date
   */
  public LocalDateTime getIssuanceDate() {
    return issuanceDate;
  }

  /**
   * Get the license expiration date.
   * @return the license expiration date
   */
  public LocalDateTime getExpirationDate() {
    return expirationDate;
  }

  /**
   * Get the String representation of the LicenseInformation.
   * @return the String representation of the LicenseInformation
   */
  @Override
  public String toString() {
    return "LicenseInformation{" +
        "licenseNumber=" + licenseNumber +
        ", driverName=" + driverName +
        ", driverAddress=" + driverAddress +
        ", driverBirthDate=" + driverBirthDate +
        ", driverCountry='" + driverCountry + '\'' +
        ", driverState='" + driverState + '\'' +
        ", issuanceDate=" + issuanceDate +
        ", expirationDate=" + expirationDate +
        '}';
  }

  /**
   * Compare this LicenseInformation against another for equality.
   * @param o another LicenseInformation for comparison
   * @return true if equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof LicenseInformation)) return false;
    LicenseInformation that = (LicenseInformation) o;
    return getLicenseNumber().equals(that.getLicenseNumber()) &&
        getDriverName().equals(that.getDriverName()) &&
        getDriverAddress().equals(that.getDriverAddress()) &&
        getDriverBirthDate().equals(that.getDriverBirthDate()) &&
        getDriverCountry().equals(that.getDriverCountry()) &&
        getDriverState().equals(that.getDriverState()) &&
        getIssuanceDate().equals(that.getIssuanceDate()) &&
        getExpirationDate().equals(that.getExpirationDate());
  }

  /**
   * Get the int representation of this LicenseInformation.
   * @return int representation of this LicenseInformation
   */
  @Override
  public int hashCode() {
    return Objects.hash(getLicenseNumber(), getDriverName(), getDriverAddress(), getDriverBirthDate(), getDriverCountry(), getDriverState(), getIssuanceDate(), getExpirationDate());
  }
}
