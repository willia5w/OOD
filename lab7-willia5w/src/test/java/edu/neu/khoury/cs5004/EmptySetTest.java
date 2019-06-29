package edu.neu.khoury.cs5004;

import edu.neu.khoury.cs5004.problem1.ConsSet;
import edu.neu.khoury.cs5004.problem1.EmptySet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmptySetTest {
  private EmptySet emptySet;

  @Before
  public void setUp() throws Exception {
    emptySet = new EmptySet();
  }

  @Test
  public void emptySet() {
    assertEquals(emptySet.getClass(), emptySet.emptySet().getClass());
  }

  @Test
  public void isEmpty() {
    assertTrue(emptySet.isEmpty());
  }

  @Test
  public void add() {
    Integer val = 1;
    ConsSet newSet = new ConsSet(val, emptySet);
    assertEquals(newSet, emptySet.add(val));
  }

  @Test
  public void contains() {
    assertFalse(emptySet.contains(emptySet));
  }

  @Test
  public void remove() {
    assertTrue(emptySet.equals(emptySet.remove(emptySet)));
  }

  @Test
  public void size() {
    assertEquals(0, emptySet.size(), 0);
  }

  @Test
  public void toString1() {
    assertEquals("EmptySet{}", emptySet.toString());
  }
}