package LabAssignment1;

import static org.junit.Assert.*;

public class RunnerTest {
  private Name athletesName;
  private Runner runner;

  @org.junit.Before
  public void setUp() throws Exception {
    athletesName = new Name("Dan", "M", "Williams");
    runner = new Runner(athletesName,  5.75, 155.50, "Running",
        20.50, 160.10, "5K");
  }

  @org.junit.Test
  public void getBest5kTime() {
    Double fiveKTime = 20.50;
    assertEquals(fiveKTime, runner.getBest5kTime());
  }

  @org.junit.Test
  public void getBestHalfMarathonTime() {
    Double marathonTime = 160.10;
    assertEquals(marathonTime, runner.getBestHalfMarathonTime());
  }

  @org.junit.Test
  public void getFavoriteRunningEvent() {
    assertEquals("5K", runner.getFavoriteRunningEvent());
  }
}