package Problem3;

import Problem2.CardBalance;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardBalanceTest {
  private CardBalance cardBalance;

  @Before
  public void setUp() throws Exception {
    cardBalance = new CardBalance(100, 50);
  }

  @Test
  public void invalidAmount() {
    CardBalance invalid = new CardBalance(-100, -50);
  }

  @Test
  public void getDollars() {
    assertEquals(100, cardBalance.getDollars(), 0);
  }

  @Test
  public void getCents() {
    assertEquals(50, cardBalance.getCents(), 0);
  }
}