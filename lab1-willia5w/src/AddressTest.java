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
}