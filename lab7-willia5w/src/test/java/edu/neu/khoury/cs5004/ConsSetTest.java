package edu.neu.khoury.cs5004;

import edu.neu.khoury.cs5004.problem1.ConsSet;
import edu.neu.khoury.cs5004.problem1.EmptySet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsSetTest {
  private EmptySet emptySet;
  private ConsSet consSet;


  @Before
  public void setUp() throws Exception {
    emptySet = new EmptySet();
    consSet = new ConsSet(1, emptySet);
  }

  @Test
  public void emptySet() {
    assertEquals(emptySet.getClass(), consSet.emptySet().getClass());
  }

  @Test
  public void isEmpty() {
    assertFalse(consSet.isEmpty());
  }

  @Test
  public void add() {
    ConsSet comp = new ConsSet(2, consSet);
    assertEquals(comp, consSet.add(2));
  }

  @Test
  public void contains() {
    assertTrue(consSet.contains(1));
  }

  @Test
  public void notcontains() {
    assertFalse(consSet.contains(2));
  }

  @Test
  public void remove() {


  }

  @Test
  public void size() {
    assertEquals(1, consSet.size(), 0);
  }

  @Test
  public void toString1() {
    assertEquals("ConsSet{value=1, next=EmptySet{}}", consSet.toString());
  }

  @Test
  public void equals1() {
    ConsSet comp = new ConsSet(1, emptySet);
    assertTrue(consSet.equals(comp));

  }

  @Test
  public void hashCode1() {
    ConsSet comp = new ConsSet(1, emptySet);
    assertEquals(consSet.hashCode(), comp.hashCode());
  }
}