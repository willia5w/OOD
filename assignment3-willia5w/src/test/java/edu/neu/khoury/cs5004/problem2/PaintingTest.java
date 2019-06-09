package edu.neu.khoury.cs5004.problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaintingTest {
  private Painting painting;

  @Before
  public void setUp() throws Exception {
    painting = new Painting("Job1", "Mars", true,
        19, 0.0, 3);
  }

  @Test
  public void getInvoiceID() {
    assertEquals("Job1", painting.getInvoiceID());
  }

  @Test
  public void getPropertyAddress() {
    assertEquals("Mars", painting.getPropertyAddress());
  }

  @Test
  public void getMonthly() {
    assertEquals(true, painting.getMonthly());
  }

  @Test
  public void getTimesServiced() {
    assertEquals(19, painting.getTimesServiced(), 0);
  }

  @Test
  public void getPriceOfService() {
    assertEquals(0.0, painting.getPriceOfService(), 0);
  }

  @Test
  public void getNumPets() {
    assertEquals(3, painting.getNumPets(), 0);
  }

  @Test
  public void toString1() {
  }

  @Test
  public void baseFee() {
  }

  @Test
  public void calculatePrice() {
  }

}