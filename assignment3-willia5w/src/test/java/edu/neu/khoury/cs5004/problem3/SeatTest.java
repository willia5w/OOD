package edu.neu.khoury.cs5004.problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeatTest {
  public Seat seat;

  @Before
  public void setUp() throws Exception {
    seat = new Seat("A", "Dan");
  }

  @Test
  public void getSeatName() {
    assertEquals("A", seat.getSeatName());
  }

  @Test
  public void getReservedFor() {
    assertEquals("Dan", seat.getReservedFor());
  }

  @Test
  public void equals1() {
    assert true;
  }

  @Test
  public void hashCode1() {
    assert true;
  }
}