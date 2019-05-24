package Problem1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LivingRoomTest {
  private LivingRoom livingRoom;

  @Before
  public void setUp() throws Exception {
    livingRoom = new LivingRoom(60, 60,72);
  }

  @Test
  public void getCurrentTemp() {
    assertEquals(60, livingRoom.getCurrentTemp(), 0);
  }

  @Test
  public void getMinTemp() {
    assertEquals(60, livingRoom.getMinTemp(), 0);
  }

  @Test
  public void getMaxTemp() {
    assertEquals(72, livingRoom.getMaxTemp(), 0);
  }

  @Test (expected = Exception.class)
  public void validateNewTemp() throws Exception {
    livingRoom = livingRoom.validateNewTemp(40);
  }
}