package Problem1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class RoomTest {
  private Room room;

  @Before
  public void setUp() throws Exception {
    room = new LivingRoom(60, 60,72);
  }

  @Test
  public void getCurrentTemp() {
    assertEquals(60, room.getCurrentTemp(), 0);
  }

  @Test
  public void getMinTemp() {
    assertEquals(60, room.getMinTemp(), 0);
  }

  @Test
  public void getMaxTemp() {
    assertEquals(72, room.getMaxTemp(), 0);
  }
}