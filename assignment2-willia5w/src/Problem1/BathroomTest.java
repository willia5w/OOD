package Problem1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BathroomTest {
  private Bathroom bathroom;

  @Before
  public void setUp() throws Exception {
    bathroom = new Bathroom(60, 58,70);
  }

  @Test
  public void getCurrentTemp() {
    assertEquals(60, bathroom.getCurrentTemp(), 0);
  }

  @Test
  public void getMinTemp() {
    assertEquals(58, bathroom.getMinTemp(), 0);
  }

  @Test
  public void getMaxTemp() {
    assertEquals(70, bathroom.getMaxTemp(), 0);
  }

  @Test (expected = Exception.class)
  public void validateNewTemp() throws Exception {
    bathroom = bathroom.validateNewTemp(40);
  }
}