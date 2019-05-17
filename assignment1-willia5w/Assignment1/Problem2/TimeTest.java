package Problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TimeTest {
  private Time time;

  @Before
  public void setUp() throws Exception {
    time = new Time(3, 4, 5);
  }

  @Test
  public void getHours() {
    assertEquals(3, time.getHours(), 0);
  }

  @Test
  public void getMinutes() {
    assertEquals(4, time.getMinutes(), 0);
  }

  @Test
  public void getSeconds() {
    assertEquals(5, time.getSeconds(), 0);
  }

  @Test
  public void getDuration() {
    Time begin = new Time(0,0,0);
    Time end = new Time(3,4,5);
    Time difference = time.getDuration(begin, end);
    assertEquals(5, difference.getSeconds(),0);

  }
}