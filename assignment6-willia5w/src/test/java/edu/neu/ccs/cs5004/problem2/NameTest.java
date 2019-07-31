package edu.neu.ccs.cs5004.problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {
    private edu.neu.khoury.cs5004.problem2.Name name;

    @Before
    public void setUp() throws Exception {
        name = new edu.neu.khoury.cs5004.problem2.Name("Dan", "Williams");
    }

    @Test
    public void getFirstName() {
        assertEquals("Dan", name.getFirstName());
    }

    @Test
    public void getLastName() {
        assertEquals("Williams", name.getLastName());
    }

    @Test
    public void getFullName() {
        assertEquals("Dan Williams", name.getFullName());
    }

    @Test
    public void toString1() {
        assertEquals("Name{firstName='Dan', lastName='Williams'}", name.toString());

    }

    @Test
    public void equals1() {
        int noEquals = 1;
        assertFalse(name.equals(noEquals));
    }

    @Test
    public void hashCode1() {
        int noEquals = 1;
        assertFalse(name.hashCode() == noEquals);
    }
}
