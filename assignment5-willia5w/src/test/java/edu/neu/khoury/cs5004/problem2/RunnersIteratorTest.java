package edu.neu.khoury.cs5004.problem2;

import edu.neu.khoury.cs5004.problem1.Runner;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class RunnersIteratorTest {
  RunnersIterator runnersIterator;

  @Before
  public void setUp() throws Exception {
    ArrayList<Runner> runnerList = new ArrayList <>();

    List <Double> runnerOneFiveKRaceTimes = new ArrayList<>();
    runnerOneFiveKRaceTimes.add(1.0);
    runnerOneFiveKRaceTimes.add(2.0);
    runnerOneFiveKRaceTimes.add(3.0);
    runnerOneFiveKRaceTimes.add(4.0);
    runnerOneFiveKRaceTimes.add(5.0);
    List <Double> runnerOneTenKRaceTimes = new ArrayList<>();
    List <Double> runnerOneHalfMarathonTimes = new ArrayList<>();
    runnerOneHalfMarathonTimes.add(100.0); // Half Marathon fail
    Runner runnerOne = new Runner(
        "One", runnerOneFiveKRaceTimes, runnerOneTenKRaceTimes, runnerOneHalfMarathonTimes);

    List <Double> runnerTwoFiveKRaceTimes = new ArrayList<>();
    runnerTwoFiveKRaceTimes.add(1.0); // 5k fail
    runnerTwoFiveKRaceTimes.add(2.0);
    runnerTwoFiveKRaceTimes.add(3.0);
    runnerTwoFiveKRaceTimes.add(4.0);
    List <Double> runnerTwoTenKRaceTimes = new ArrayList<>();
    List <Double> runnerTwoHalfMarathonTimes = new ArrayList<>();
    runnerTwoHalfMarathonTimes.add(100.0);
    runnerTwoHalfMarathonTimes.add(90.0);
    runnerTwoHalfMarathonTimes.add(80.0);
    Runner runnerTwo = new Runner(
        "Two", runnerTwoFiveKRaceTimes, runnerTwoTenKRaceTimes, runnerTwoHalfMarathonTimes);

    List <Double> runnerThreeFiveKRaceTimes = new ArrayList<>();
    runnerThreeFiveKRaceTimes.add(1.0); // 5K pass
    runnerThreeFiveKRaceTimes.add(2.0);
    runnerThreeFiveKRaceTimes.add(3.0);
    runnerThreeFiveKRaceTimes.add(4.0);
    runnerThreeFiveKRaceTimes.add(5.0);
    List <Double> runnerThreeTenKRaceTimes = new ArrayList<>();
    List <Double> runnerThreeHalfMarathonTimes = new ArrayList<>();
    runnerThreeHalfMarathonTimes.add(80.0); // Half Marathon pass
    Runner runnerThree = new Runner(
        "Three", runnerThreeFiveKRaceTimes, runnerThreeTenKRaceTimes, runnerThreeHalfMarathonTimes);


    runnerList.add(runnerOne);
    runnerList.add(runnerTwo);
    runnerList.add(runnerThree);

    runnersIterator = new RunnersIterator(runnerList);
  }
//
//  @Test
//  public void qualified() {
//    assertEquals("Three", runnersIterator.getRunnerStack());
//  }

//  @Test
//  public void hasNext() {
//    assertFalse(runnersIterator.hasNext());
//  }
//
//  @Test (expected = NoSuchElementException.class)
//  public void next() {
//    runnersIterator.next();
//  }
}