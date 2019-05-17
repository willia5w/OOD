package Problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BicyclistTest {
  private Bicyclist bicyclist;
  private Time startTime;
  private Time endTime;

  @Before
  public void setUp() throws Exception {
    startTime = new Time(0, 0,0);
    endTime = new Time(5, 5,5);
    bicyclist = new Bicyclist("Dan", "USA", startTime, endTime);
  }

  @Test
  public void getName() {
    assertEquals("Dan", bicyclist.getName());
  }

  @Test
  public void getTeam() {
    assertEquals("USA", bicyclist.getTeam());
  }

  @Test
  public void getStartTime() {
    Time predictedStartTime = new Time(0,0,0);
    Time actualStartTime = bicyclist.getStartTime();
    assertEquals(predictedStartTime.getSeconds(), actualStartTime.getSeconds());
  }

  @Test
  public void getEndTime() {
    Time predictedEndTime = new Time(5,5,5);
    Time actualEndTime = bicyclist.getEndTime();
    assertEquals(predictedEndTime.getHours(), actualEndTime.getHours());
  }

  @Test
  public void getDuration() {
//    Time trialStartTime = bicyclist.getStartTime();
//    Time trialEndTime = bicyclist.getEndTime();
    Time trialDuration = bicyclist.getDuration();
    assertEquals(bicyclist.getEndTime().getSeconds(), trialDuration.getSeconds());
  }
}