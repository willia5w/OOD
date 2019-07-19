package edu.neu.khoury.cs5004.problem2;

/**
 * Interface for the Registration Validator which is resposible for accepting or rejecting new driver applications.
 */
public interface IRegistrationValidator {

  /**
   * Checks whether a driver meets the minimum age requirement
   * @return True if driver is 21 years or older. False otherwise.
   */
  Boolean checkDriverAge();

  /**
   * Checks whether the prospective driver's vehicle age is within the company's limits.
   *
   * - Name on application must match the name on the license
   * - Birth date on application must match birth date on license
   * - License must be issued in the US
   * - Issue date must be 6 months or prior from date of application
   * - License may not be expired
   *
   * @return True car age is 20 or under. False otherwise.
   */
  Boolean checkVehicleAge();

  /**
   * Checks whether a driver's license meets multiple requirements.
   * @return True if license is satisfactory. False otherwise.
   */
  Boolean checkDriverLicenseInfo();

  /**
   * Checks whether a driver is the official owner or an insured driver on the vehicle's policy.
   * @return True if criteria met. False otherwise.
   */
  Boolean checkInsuranceInfo();

  /**
   * Checks whether a driver's history is satisfactory.
   *
   * Moving Violations must not include:
   * - Reckless Driving
   * - DUI
   * - Driving without valid License or Insurance
   *
   * @return True if the driver's record is free of moving violations. False otherwise.
   */
  Boolean checkDriverHistory();

  /**
   * Checks whether the driver's vehicle history is satisfactory.
   * @return True if there are no moving violations or or crashes within the past 6 months. False otherwise.
   */
  Boolean checkVehicleHistory();

  /**
   * Sequentially executes each check of a driver's application.
   * Adds the driver's application to the list of approved applications if
   * @throws UnhirableDriverException if any of the validation checks fail
   */
  void validateDriver() throws UnhirableDriverException;
}
