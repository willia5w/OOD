package edu.neu.khoury.cs5004.problem2;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Objects;

import static edu.neu.khoury.cs5004.problem2.MovingViolationType.*;

/**
 * Given a DriverApplication, the RegistrationValidator checks all components for validity.
 * Adds application to list of approved applications if all checks pass.
 * Throws an exception if any of the checks fail.
 */
public class RegistrationValidator implements IRegistrationValidator {
  // Make HashMap to handle duplicate entry of same license # as key??? (Would have to be its own class containing DriverApplications
  private ArrayList <DriverApplication> acceptedDrivers;
  private DriverApplication driverApplication;

  /**
   * Constructor for the RegistrationValidator
   *
   * @param acceptedDrivers
   * @param driverApplication
   */
  public RegistrationValidator(ArrayList <DriverApplication> acceptedDrivers, DriverApplication driverApplication) {
    this.acceptedDrivers = acceptedDrivers;
    this.driverApplication = driverApplication;
  }

  // Create IValidatable interface for each component accessed below?
  // HIDE implementation and call isValid() mandatory method on each which THROWS exception?

  /**
   * Checks whether a driver meets the minimum age requirement
   *
   * @return True if driver is 21 years or older. False otherwise.
   */
  @Override
  public Boolean checkDriverAge() {
    // Get current date
    LocalDateTime applicationDate = LocalDateTime.now();

    // Get driver's age
    LocalDateTime applicantBirthDate = driverApplication.getDriverBirthDate();

    long driverAge = ChronoUnit.YEARS.between(applicationDate, applicantBirthDate);

    if (driverAge >= 21) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Checks whether the prospective driver's vehicle age is within the company's limits.
   *
   * @return True car age is 20 or under. False otherwise.
   */
  @Override
  public Boolean checkVehicleAge() {
    // Get current date
    LocalDateTime applicationDate = LocalDateTime.now();
    Integer applicantVehicleYear = driverApplication.getVehicleInformation().getModelYear();

    if (applicationDate.getYear() - applicantVehicleYear <= 20) {
      return true;
    } else {
      return false;
    }
  }

  // Check for driver's unique license number (key) in list of accepted applications to avoid duplicates

  /**
   * Checks whether a driver's license meets multiple requirements:
   * <p>
   * - Name on application must match the name on the license
   * - Birth date on application must match birth date on license
   * - License must be issued in the US
   * - Issue date must be 6 months or prior from date of application
   * - License may not be expired
   *
   * @return True if license is satisfactory. False otherwise.
   */
  @Override
  public Boolean checkDriverLicenseInfo() {
    Name applicantName = driverApplication.getDriverName();
    Name applicantLicenseName = driverApplication.getDriverLicenseInfo().getDriverName();

    LocalDateTime applicantBirthDate = driverApplication.getDriverBirthDate();
    LocalDateTime applicantLicenseBirthDate = driverApplication.getDriverLicenseInfo().getDriverBirthDate();

    String applicantLicenseCountryIssued = driverApplication.getDriverLicenseInfo().getDriverCountry();

    // Get current date
    LocalDateTime applicationDate = LocalDateTime.now();

    // Get violation date
    LocalDateTime issuanceDate = driverApplication.getDriverLicenseInfo().getIssuanceDate();

    // Calculate months passed since issuance
    long monthsFromIssuance = ChronoUnit.MONTHS.between(applicationDate, issuanceDate);

    // Get expiration date information from applicant license
    LocalDateTime expirationDate = driverApplication.getDriverLicenseInfo().getExpirationDate();

    // Calculate time passed since expiration
    long timeSinceExpiration = ChronoUnit.DAYS.between(applicationDate, issuanceDate);

    if (
        applicantName.equals(applicantLicenseName) &&
            applicantBirthDate.equals(applicantLicenseBirthDate) &&
            applicantLicenseCountryIssued.equals("US") &&
            monthsFromIssuance >= 6 &&
            timeSinceExpiration < 0) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Checks whether a driver is the official owner or an insured driver on the vehicle's policy.
   *
   * @return True if criteria met. False otherwise.
   */
  @Override
  public Boolean checkInsuranceInfo() {
    Name driverName = driverApplication.getDriverName();
    Name vehicleOfficialOwner = driverApplication.getVehicleInsuranceInformation().getOfficialOwner();
    ArrayList <Name> vehicleOtherDrivers = driverApplication.getVehicleInsuranceInformation().getOtherDrivers();

    if (driverName.equals(vehicleOfficialOwner)) {
      return true;
    } else if (vehicleOtherDrivers.contains(driverName)) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Checks whether a driver's history is satisfactory.
   * <p>
   * Moving Violations must not include:
   * - Reckless Driving
   * - DUI
   * - Driving without valid License or Insurance
   *
   * @return true if the driver's record is free of moving violations, false otherwise
   */
  @Override
  public Boolean checkDriverHistory() {
    ArrayList <Violation> applicantViolations = driverApplication.getDriverHistory().getTrafficViolations();

    for (int i = 0; i < applicantViolations.size(); i++) {
      Violation violation = applicantViolations.get(i);
      if (violation.getViolationType()
          violation.getViolationType().equals(Speeding) ||
          violation.getViolationType().equals(DUI) ||
          violation.getViolationType().equals(DrivingWithoutLicenceRegistration)) {
        return false;
      }
    }
    return true;
  }

  /**
   * Checks whether the driver's vehicle history is satisfactory.
   *
   * @return True if there are no moving violations or or crashes within the past 6 months. False otherwise.
   */
  @Override
  public Boolean checkVehicleHistory() {
    ArrayList <Violation> vehicleViolations =
        driverApplication.getVehicleInformation().getVehicleHistory().getVehicleViolations();

    // Iterate through Moving Violations
    for (int i = 0; i < vehicleViolations.size(); i++) {
      Violation violation = vehicleViolations.get(i);

      for (MovingViolationType type : MovingViolationType.values()) {
        if (violation.getViolationType().equals(type)) {

          // Get current date
          LocalDateTime applicationDate = LocalDateTime.now();

          // Get violation date
          LocalDateTime violationDate = violation.getViolationDate();

          // Calculate months passed since violation
          long violationMonthsElapsed = ChronoUnit.MONTHS.between(applicationDate, violationDate);

          if (violationMonthsElapsed <= 6) {
            return false;
          }
        }
      }

      // Iterate through Moving Violations
      for (CrashType type : CrashType.values()) {
        if (violation.getViolationType().equals(type)) {
          if (violation.getViolationType().equals(type)) {
            // Get current date
            LocalDateTime applicationDate = LocalDateTime.now();

            // Get violation date
            LocalDateTime violationDate = violation.getViolationDate();

            // Calculate months passed since violation
            long violationMonthsElapsed = ChronoUnit.MONTHS.between(applicationDate, violationDate);

            if (violationMonthsElapsed <= 6) {
              return false;
            }
          }
        }
      }
    }
    return true;
  }

  /**
   * Sequentially executes each check of a driver's application.
   * Adds the driver's application to the list of approved applications if
   *
   * @throws UnhirableDriverException if any of the validation checks fail
   */
  public void validateDriver() throws UnhirableDriverException {
    if (!checkDriverAge()) {
      throw new UnhirableDriverException("Applicant age below limit, application denied!");
    } else if (!checkVehicleAge()) {
      throw new UnhirableDriverException("Vehicle age beyond limit, application denied!");
    } else if (!checkDriverLicenseInfo()) {
      throw new UnhirableDriverException("Issue with applicant license, application denied!");
    } else if (!checkInsuranceInfo()) {
      throw new UnhirableDriverException("Applicant not covered under vehicle insurance policy, application denied!");
    } else if (!checkDriverHistory()) {
      throw new UnhirableDriverException("Unacceptable violation in applicant driving history, application denied!");
    } else if (!checkVehicleHistory()) {
      throw new UnhirableDriverException("Unacceptable violation in vehicle history, application denied!");
    } else {
      for (int i = 0; i < acceptedDrivers.size(); i++) {
        // Alternatively we can check drivers licence #'s of approved applications
        if (driverApplication.equals(acceptedDrivers.get(i))) {
          throw new UnhirableDriverException("Application has been previously approved.");
        }
      }
      acceptedDrivers.add(driverApplication);
      System.out.println("Application approved!");
    }
  }

  /**
   * A String representation of a Registration Validator.
   * @return a String representation of a Registration Validator
   */
  @Override
  public String toString() {
    return "RegistrationValidator{" +
        "acceptedDrivers=" + acceptedDrivers +
        ", driverApplication=" + driverApplication +
        '}';
  }

  /**
   * Compares the registration validator to check for equality.
   * @param o another registration validator
   * @return true if equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof RegistrationValidator)) return false;
    RegistrationValidator that = (RegistrationValidator) o;
    return Objects.equals(acceptedDrivers, that.acceptedDrivers) &&
        driverApplication.equals(that.driverApplication);
  }

  /**
   * Get the int representation of this Registration Validator.
   * @return int representation of this Registration Validator
   */
  @Override
  public int hashCode() {
    return Objects.hash(acceptedDrivers, driverApplication);
  }
}

