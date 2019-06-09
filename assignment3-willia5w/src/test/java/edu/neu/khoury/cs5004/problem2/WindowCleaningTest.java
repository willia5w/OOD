package edu.neu.khoury.cs5004.problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WindowCleaningTest {
  private WindowCleaning windowCleaning;

  @Before
  public void setUp() throws Exception {
    WindowCleaning windowCleaning
        = new WindowCleaning("Job1", "Mars", true,
        19, 0.0, 3, 3);
  }

  @Test (expected=TooManyFloorsException.class)
  public void testTooManyFloorsException() throws TooManyFloorsException {
    WindowCleaning invalidWindowCleaning
        = new WindowCleaning("Job1", "Mars", true,
        19, 0.0, 3, 4);
  }

  @Test
  public void getNumFloors() {
    assertEquals(3, windowCleaning.getNumFloors(), 0);
  }


  @Test
  public void additionalFee() {
  }

  @Test
  public void calculatePrice() {
  }

  @Test
  public void equals1() {
  }
}