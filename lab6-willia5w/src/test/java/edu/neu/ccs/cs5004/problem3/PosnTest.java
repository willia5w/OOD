package edu.neu.ccs.cs5004.problem3;

import javafx.geometry.Pos;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PosnTest {
  private Posn posn;

  @Before
  public void setUp() throws Exception {
    posn = new Posn(1, 2);
  }

  @Test
  public void getX() {
    assertEquals(1, posn.getX(), 0);
  }

  @Test
  public void getY() {
    assertEquals(2, posn.getY(), 0);
  }

  @Test
  public void equals1() {
    otherPosn = new Posn(2, 1);

    assertFalse(posn.equals(otherPosn));
  }

  @Test
  public void hashCode1() {
    otherPosn = new Posn(2, 1);

    assertFalse(posn.hashCode(), otherPosn.hashCode());
  }

  @Test
  public void toString1() {
    assertEquals(posn.toString(), "Posn{x=1, y=2}");
  }
}