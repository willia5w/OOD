package Problem1;

import static org.junit.Assert.*;

public class SwimmerTest {
  private Swimmer swimmer;
  private SwimTimes swimTimes;

  @org.junit.Before
  public void setUp() throws Exception {
    swimTimes = new SwimTimes(10.00, 20.00,
        30.00, 40.00);
    swimmer = new Swimmer("Dan", "Williams", swimTimes);
  }

  @org.junit.Test
  public void getFirstName() {
    assertEquals("Dan", swimmer.getFirstName());
  }

  @org.junit.Test
  public void getLastName() {
    assertEquals("Williams", swimmer.getLastName());
  }

  @org.junit.Test
  public void getSwimTimes() {
    assertEquals(swimTimes, swimmer.getSwimTimes());
  }

  @org.junit.Test
  public void setSwimTimes() {
    assertEquals(swimTimes, swimmer.setSwimTimes(10.00,
        20.00,30.00, 40.00));
  }
}