package edu.neu.khoury.cs5004.problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {
    private Address address;

    @Before
    public void setUp() throws Exception {
        address = new Address("1287", "Westlake Ave",
                "Seattle", "WA", "98109",
                "USA");
    }

    @Test
    public void getStreetNumber() {
        assertEquals("1287", address.getStreetNumber());
    }

    @Test
    public void getStreetName() {
        assertEquals("Westlake Ave", address.getStreetName());
    }

    @Test
    public void getCityName() {
        assertEquals("Seattle", address.getCityName());
    }

    @Test
    public void getStateAcronym() {
        assertEquals("WA", address.getStateAcronym());
    }

    @Test
    public void getZipCode() {
        assertEquals("98109", address.getZipCode());
    }

    @Test
    public void getCountryName() {
        assertEquals("USA", address.getCountryName());
    }

    @Test
    public void getAddress() {
        assertEquals("1287 Westlake Ave Seattle WA 98109 USA", address.getAddress());
    }

    @Test
    public void toString1() {
        assertEquals("Address{streetNumber='1287', streetName='Westlake Ave', cityName='Seattle'" +
            ", stateAcronym='WA', zipCode='98109', countryName='USA'}", address.toString());
    }

    @Test
    public void equals1() {
        int noEquals = 1;
        assertFalse(address.equals(noEquals));
    }

    @Test
    public void hashCode1() {
        int noEquals = 1;
        assertFalse(address.hashCode() == noEquals);
    }
}