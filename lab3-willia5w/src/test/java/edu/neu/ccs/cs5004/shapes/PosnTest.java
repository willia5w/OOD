package edu.neu.ccs.cs5004.shapes;

import edu.neu.css.cs5004.shapes.Posn;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PosnTest {
    Posn posn;

    @Before
    public void setUp() throws Exception {
        posn = new Posn(5.0, 6.0);
    }

    @Test
    public void distToOrigin() {
        assertEquals(7.8, posn.distToOrigin(), 0.1);
    }

    @Test
    public void getX() {
    }

    @Test
    public void getY() {
    }
}