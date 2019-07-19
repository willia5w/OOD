package edu.neu.khoury.cs5004.problem2;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.Assert.*;

public class LicenseInformationTest {
  private LicenseInformation licenseInformation;

  @Before
  public void setUp() throws Exception {
    Integer licenseNumber = 12345;
    Name driverName = new Name("Bilbo", "Baggins");
    Address driverAddress = new Address(
        "1", "Dirt Lane", "Shire",
        "ME", "88888", "New Zealand");
    LocalDateTime driverBirthDate = LocalDateTime.of(1700, 5, 1, 0, 0);
    String driverCountry = "New Zealand";
    String driverState= "Middle Earth";
    LocalDateTime issuanceDate = LocalDateTime.of(1700, 5, 1, 0, 0);
    LocalDateTime expirationDate = LocalDateTime.of(1700, 5, 1, 0, 0);

    licenseInformation = new LicenseInformation(licenseNumber, driverName, driverAddress,
        driverBirthDate, driverCountry, driverState,
        issuanceDate, expirationDate);
  }

  @Test
  public void getLicenseNumber() {
    assertEquals(12345, licenseInformation.getLicenseNumber(), 0);
  }

  @Test
  public void getDriverName() {
    assertEquals("Bilbo Baggins", licenseInformation.getDriverName().getFullName());
  }

  @Test
  public void getDriverAddress() {
    assertEquals("1 Dirt Lane Shire ME 88888 New Zealand",
        licenseInformation.getDriverAddress().getAddress());
  }

  @Test
  public void getDriverBirthDate() {
    LocalDateTime expectedDriverBirthDate = LocalDateTime.of(1700, 5, 1, 0, 0);
    assertEquals(expectedDriverBirthDate, licenseInformation.getDriverBirthDate());
  }

  @Test
  public void getDriverCountry() {
    assertEquals("New Zealand", licenseInformation.getDriverCountry());
  }

  @Test
  public void getDriverState() {
    assertEquals("Middle Earth", licenseInformation.getDriverCountry());
  }

  @Test
  public void getIssuanceDate() {
    LocalDateTime expectedIssuanceDate = LocalDateTime.of(1700, 5, 1, 0, 0);
    assertEquals(expectedIssuanceDate, licenseInformation.getIssuanceDate());
  }

  @Test
  public void getExpirationDate() {
    LocalDateTime expectedExpirationDate = LocalDateTime.of(1700, 5, 1, 0, 0);
    assertEquals(expectedExpirationDate, licenseInformation.getIssuanceDate());
  }

  @Test
  public void toString1() {
    assertEquals("LicenseInformation{licenseNumber=12345, driverName=Name{firstName='Bilbo" +
        "', lastName='Baggins'}, driverAddress=Address{streetNumber='1', streetName='Dirt Lane', city" +
        "Name='Shire', stateAcronym='ME', zipCode='88888', countryName='New Zealand'}, driverBirthDate" +
        "=1700-05-01T00:00, driverCountry='New Zealand', driverState='Middle Earth', issuanceDate=1700-" +
        "05-01T00:00, expirationDate=1700-05-01T00:00}", licenseInformation.toString());
  }

  @Test
  public void equals1() {
    int noEquals = 1;
    assertFalse(licenseInformation.equals(noEquals));
  }

  @Test
  public void hashCode1() {
    int noEquals = 1;
    assertFalse(licenseInformation.hashCode() == noEquals);
  }
}