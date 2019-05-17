package Problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AmountTest {
  private Amount amount;

  @Before
  public void setUp() throws Exception {
    amount = new Amount(100, 50);
  }

  @Test
  public void invalidAmount() {
    Amount invalid = new Amount(-100, -50);
  }

  @Test
  public void getDollars() {
    assertEquals(100, amount.getDollars(), 0);
  }

  @Test
  public void getCents() {
    assertEquals(50, amount.getCents(), 0);
  }
}