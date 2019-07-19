package edu.neu.khoury.cs5004.problem2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SwimmerTest {
  private Swimmer swimmer;

  @Before
  public void setUp() throws Exception {
    List <Double> freestyle50mTimes = new ArrayList <>();
    freestyle50mTimes.add(1.0);
    freestyle50mTimes.add(2.0);
    freestyle50mTimes.add(3.0);
    List <Double> butterfly50mTimes = new ArrayList<>();
    List <Double> backstroke50mTimes = new ArrayList<>();
    List<Double> breaststroke50mTimes = new ArrayList<>();
    swimmer = new Swimmer("Dan", butterfly50mTimes, backstroke50mTimes,
        breaststroke50mTimes, freestyle50mTimes);
  }

  @Test
  public void getName() {
    assertEquals("Dan", swimmer.getName());
  }

  @Test
  public void getButterfly50mTimes() {
    List <Double> expectedButterfly50mTimes = new ArrayList<>();
    assertEquals(expectedButterfly50mTimes, swimmer.getButterfly50mTimes());
  }

  @Test
  public void getBackstroke50mTimes() {
    List <Double> expectedBackstroke50mTimes = new ArrayList<>();
    assertEquals(expectedBackstroke50mTimes, swimmer.getBackstroke50mTimes());
  }

  @Test
  public void getBreaststroke50mTimes() {
    List <Double> expectedBreaststroke50mTimes = new ArrayList<>();
    assertEquals(expectedBreaststroke50mTimes, swimmer.getBreaststroke50mTimes());
  }

  @Test
  public void getFreestyle50mTimes() {
    List <Double> expectedFreestyle50mTimes = new ArrayList <>();
    expectedFreestyle50mTimes.add(1.0);
    expectedFreestyle50mTimes.add(2.0);
    expectedFreestyle50mTimes.add(3.0);
    assertEquals(expectedFreestyle50mTimes, swimmer.getFreestyle50mTimes());
  }

  @Test
  public void compareTo() {
    List <Double> freestyle50mTimes = new ArrayList <>();
    freestyle50mTimes.add(1.0);
    freestyle50mTimes.add(2.0);
    freestyle50mTimes.add(3.0);
    List <Double> butterfly50mTimes = new ArrayList<>();
    List <Double> backstroke50mTimes = new ArrayList<>();
    List<Double> breaststroke50mTimes = new ArrayList<>();
    Swimmer equalSwimmer = new Swimmer("Dan", butterfly50mTimes, backstroke50mTimes,
        breaststroke50mTimes, freestyle50mTimes);

    assertEquals(0, swimmer.compareTo(equalSwimmer));
  }

  @Test
  public void compareToLess() {
    List <Double> freestyle50mTimes = new ArrayList <>();
    freestyle50mTimes.add(3.0);
    freestyle50mTimes.add(3.0);
    freestyle50mTimes.add(3.0);
    List <Double> butterfly50mTimes = new ArrayList<>();
    List <Double> backstroke50mTimes = new ArrayList<>();
    List<Double> breaststroke50mTimes = new ArrayList<>();
    Swimmer equalSwimmer = new Swimmer("Dan", butterfly50mTimes, backstroke50mTimes,
        breaststroke50mTimes, freestyle50mTimes);

    assertEquals(-1, swimmer.compareTo(equalSwimmer));
  }

  @Test
  public void compareToMore() {
    List <Double> freestyle50mTimes = new ArrayList <>();
    freestyle50mTimes.add(1.0);
    freestyle50mTimes.add(1.0);
    freestyle50mTimes.add(1.0);
    List <Double> butterfly50mTimes = new ArrayList<>();
    List <Double> backstroke50mTimes = new ArrayList<>();
    List<Double> breaststroke50mTimes = new ArrayList<>();
    Swimmer equalSwimmer = new Swimmer("Dan", butterfly50mTimes, backstroke50mTimes,
        breaststroke50mTimes, freestyle50mTimes);

    assertEquals(1, swimmer.compareTo(equalSwimmer));
  }
}