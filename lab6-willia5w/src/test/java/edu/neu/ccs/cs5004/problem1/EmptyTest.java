package edu.neu.ccs.cs5004.problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmptyTest {
  public EmptyBag empty;

  @Before
  public void setUp() throws Exception {
    empty = new EmptyBag();
  }

  @Test
  public void isEmpty() {
    assertEquals(true, empty.isEmpty());
  }

  @Test
  public void size() {
    assertEquals(0, empty.size(), 0);
  }

  @Test
  public void add() {
    assertEquals(new TedBag(s, empty), empty.add(s));
  }

  @Test
  public void contains() {
    assertEquals(false, empty.contains(s));
  }
}