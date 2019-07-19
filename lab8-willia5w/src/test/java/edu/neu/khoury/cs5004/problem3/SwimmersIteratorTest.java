package edu.neu.khoury.cs5004.problem3;

import org.junit.Before;
import org.junit.Test;

import edu.neu.khoury.cs5004.problem2.Swimmer;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class SwimmersIteratorTest {
  private SwimmersIterator swimmersIterator;

  @Before
  public void setUp() throws Exception {
    ArrayList <Swimmer> swimmerList = new ArrayList <>();

    List <Double> freestyle50mTimes1 = new ArrayList <>();
    freestyle50mTimes1.add(1.0);
    freestyle50mTimes1.add(2.0);
    freestyle50mTimes1.add(3.0);
    List <Double> butterfly50mTimes1 = new ArrayList<>();
    List <Double> backstroke50mTimes1 = new ArrayList<>();
    List<Double> breaststroke50mTimes1 = new ArrayList<>();
    Swimmer swimmer1 = new Swimmer("One", butterfly50mTimes1, backstroke50mTimes1,
        breaststroke50mTimes1, freestyle50mTimes1);

    List <Double> freestyle50mTimes2 = new ArrayList <>();
    freestyle50mTimes2.add(1.0);
    freestyle50mTimes2.add(2.0);
    freestyle50mTimes2.add(3.0);
    List <Double> butterfly50mTimes2 = new ArrayList<>();
    List <Double> backstroke50mTimes2 = new ArrayList<>();
    List<Double> breaststroke50mTimes2 = new ArrayList<>();
    Swimmer swimmer2 = new Swimmer("Two", butterfly50mTimes2, backstroke50mTimes2,
        breaststroke50mTimes2, freestyle50mTimes2);

    List <Double> freestyle50mTimes3 = new ArrayList <>();
    freestyle50mTimes3.add(1.0);
    freestyle50mTimes3.add(2.0);
    freestyle50mTimes3.add(3.0);
    List <Double> butterfly50mTimes3 = new ArrayList<>();
    List <Double> backstroke50mTimes3 = new ArrayList<>();
    List<Double> breaststroke50mTimes3 = new ArrayList<>();
    Swimmer swimmer3 = new Swimmer("Three", butterfly50mTimes3, backstroke50mTimes3,
        breaststroke50mTimes3, freestyle50mTimes3);

    swimmerList.add(swimmer1);
    swimmerList.add(swimmer2);
    swimmerList.add(swimmer3);

    swimmersIterator = new SwimmersIterator(swimmerList);
  }

  @Test
  public void getSwimmerStack() {
    assertEquals(3, swimmersIterator.getSwimmerStack().size(), 0);
  }

  @Test
  public void qualified() {
    List <Double> freestyle50mTimes1 = new ArrayList <>();
    freestyle50mTimes1.add(26.16);
    List <Double> butterfly50mTimes1 = new ArrayList<>();
    butterfly50mTimes1.add(1.0);
    butterfly50mTimes1.add(2.0);
    butterfly50mTimes1.add(3.0);
    butterfly50mTimes1.add(4.0);
    butterfly50mTimes1.add(5.0);
    List <Double> backstroke50mTimes1 = new ArrayList<>();
    List<Double> breaststroke50mTimes1 = new ArrayList<>();
    Swimmer qualifiedSwimmer = new Swimmer("One", butterfly50mTimes1, backstroke50mTimes1,
        breaststroke50mTimes1, freestyle50mTimes1);

    swimmersIterator.qualified(qualifiedSwimmer);

    assertEquals(4, swimmersIterator.getSwimmerStack().size(), 0);
  }

  @Test
  public void hasNext() {
    assertTrue(swimmersIterator.hasNext());
  }

  @Test
  public void next() {
    assertEquals("Three", swimmersIterator.next());
  }

  @Test (expected = NoSuchElementException.class)
  public void nextFail() throws NoSuchElementException {
    swimmersIterator.next();
    swimmersIterator.next();
    swimmersIterator.next();  // Last swimmer popped
    swimmersIterator.next();
  }
}