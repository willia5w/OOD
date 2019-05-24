package Problem1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BedroomTest {
  private Bedroom bedroom;

  @Before
  public void setUp() throws Exception {
    bedroom = new Bedroom(60, 60,68);
  }

  @Test
  public void getCurrentTemp() {
    assertEquals(60, bedroom.getCurrentTemp(), 0);
  }

  @Test
  public void getMinTemp() {
    assertEquals(60, bedroom.getMinTemp(), 0);
  }

  @Test
  public void getMaxTemp() {
    assertEquals(68, bedroom.getMaxTemp(), 0);
  }

  @Test (expected = Exception.class)
  public void validateNewTemp() throws Exception {
    bedroom = bedroom.validateNewTemp(40);
  }
}