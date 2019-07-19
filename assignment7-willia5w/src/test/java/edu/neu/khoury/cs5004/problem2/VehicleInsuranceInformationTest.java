package edu.neu.khoury.cs5004.problem2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class VehicleInsuranceInformationTest {
  private VehicleInsuranceInformation vehicleInsuranceInformation;

  @Before
  public void setUp() throws Exception {
    Name officialOwner = new Name("Bilbo", "Baggins");
    Name otherDriver1 = new Name("Frodo", "Baggins");
    Name otherDriver2 = new Name("Samwise", "Gangee");

    ArrayList<Name> otherDrivers = new ArrayList <>();
    otherDrivers.add(otherDriver1);
    otherDrivers.add(otherDriver2);

    vehicleInsuranceInformation = new VehicleInsuranceInformation(officialOwner, otherDrivers);
  }

  @Test
  public void getOfficialOwner() {
    Name expectedOfficialOwner = new Name("Bilbo", "Baggins");
    assertEquals(expectedOfficialOwner, vehicleInsuranceInformation.getOfficialOwner());
  }

  @Test
  public void getOtherDrivers() {
    Name expectedOtherDriver1 = new Name("Frodo", "Baggins");
    Name expectedOtherDriver2 = new Name("Samwise", "Gangee");

    ArrayList<Name> expectedOtherDrivers = new ArrayList <>();
    expectedOtherDrivers.add(expectedOtherDriver1);
    expectedOtherDrivers.add(expectedOtherDriver2);

    assertEquals(expectedOtherDrivers, vehicleInsuranceInformation.getOtherDrivers());
  }

  @Test
  public void toString1() {
    assertEquals("VehicleInsuranceInformation{officialOwner=Name{firstName='Bilbo'," +
        " lastName='Baggins'}, otherDrivers=[Name{firstName='Frodo', lastName='Baggins'}, Name{firstName" +
        "='Samwise', lastName='Gangee'}]}", vehicleInsuranceInformation.toString());
  }

  @Test
  public void equals1() {
    int noEquals = 1;
    assertFalse(vehicleInsuranceInformation.equals(noEquals));
  }

  @Test
  public void hashCode1() {
    assertEquals(8.97867868E8, vehicleInsuranceInformation.hashCode(), 0);
  }
}