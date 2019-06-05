package edu.neu.khoury.cs5004.problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {
    private Name name;

    @Before
    public void setUp() throws Exception {
        name = new Name("Dan", "Williams");
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
}
