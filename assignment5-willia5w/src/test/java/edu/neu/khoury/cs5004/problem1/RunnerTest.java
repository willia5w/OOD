package edu.neu.khoury.cs5004.problem1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RunnerTest {
  private Runner runner;

  @Before
  public void setUp() throws Exception {
    List <Double> fiveKRaceTimes = new ArrayList<>();
    fiveKRaceTimes.add(1.0);
    fiveKRaceTimes.add(2.0);
    fiveKRaceTimes.add(3.0);
    List <Double> tenKRaceTimes = new ArrayList<>();
    List <Double> halfMarathonTimes = new ArrayList<>();
    runner = new Runner("Dan", fiveKRaceTimes, tenKRaceTimes, halfMarathonTimes);
  }

  @Test
  public void getName() {
    assertEquals("Dan", runner.getName());
  }

  @Test
  public void getFiveKRaceTimes() {
    List <Double> expectedFiveKRaceTimes = new ArrayList<>();
    expectedFiveKRaceTimes.add(1.0);
    expectedFiveKRaceTimes.add(2.0);
    expectedFiveKRaceTimes.add(3.0);
    assertEquals(expectedFiveKRaceTimes, runner.getFiveKRaceTimes());
  }

  @Test
  public void getTenKRaceTimes() {
    List <Double> expectedTenKRaceTimes = new ArrayList<>();
    assertEquals(expectedTenKRaceTimes, runner.getTenKRaceTimes());

  }

  @Test
  public void getHalfMarathonTimes() {
    List <Double> expectedHalfMarathonTimes = new ArrayList<>();
    assertEquals(expectedHalfMarathonTimes, runner.getHalfMarathonTimes());
  }

  @Test
  public void compareToSame() {
    List <Double> fiveKRaceTimes = new ArrayList<>();
    fiveKRaceTimes.add(1.0);
    fiveKRaceTimes.add(2.0);
    fiveKRaceTimes.add(3.0);
    List <Double> tenKRaceTimes = new ArrayList<>();
    List <Double> halfMarathonTimes = new ArrayList<>();
    Runner otherRunner = new Runner("Other", fiveKRaceTimes, tenKRaceTimes, halfMarathonTimes);
    assertEquals(0, runner.compareTo(otherRunner), 0);
  }

  @Test
  public void compareToLess() {
    List <Double> fiveKRaceTimes = new ArrayList<>();
    fiveKRaceTimes.add(3.0);
    fiveKRaceTimes.add(3.0);
    fiveKRaceTimes.add(3.0);
    List <Double> tenKRaceTimes = new ArrayList<>();
    List <Double> halfMarathonTimes = new ArrayList<>();
    Runner otherRunner = new Runner("Other", fiveKRaceTimes, tenKRaceTimes, halfMarathonTimes);
    assertEquals(-1, runner.compareTo(otherRunner), 0);
  }

  @Test
  public void compareToMore() {
    List <Double> fiveKRaceTimes = new ArrayList<>();
    fiveKRaceTimes.add(1.0);
    fiveKRaceTimes.add(1.0);
    fiveKRaceTimes.add(1.0);
    List <Double> tenKRaceTimes = new ArrayList<>();
    List <Double> halfMarathonTimes = new ArrayList<>();
    Runner otherRunner = new Runner("Other", fiveKRaceTimes, tenKRaceTimes, halfMarathonTimes);
    assertEquals(1, runner.compareTo(otherRunner), 0);
  }
}