package edu.neu.khoury.cs5004.problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RowTest {
  private Row row;

  @Before
  public void setUp() throws Exception {
    row = new Row(26,1, 26, true);

  }

  @Test
  public void getRowNum() {
  }

  @Test
  public void getNumSeats() {
  }

  @Test
  public void getAccessible() {
  }

  @Test
  public void equals1() {
  }

  @Test
  public void hashCode1() {
  }

  @Test
  public void toString1() {
  }

  @Test
  public Seat getSeatObject() {
    row = new Row(26,1, 26, true);
    assertEquals("A", row.getSeatObject(0).getSeatName());
  }
}