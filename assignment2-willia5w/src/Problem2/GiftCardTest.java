package Problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GiftCardTest {
  private Integer cardNumber;
  private CardBalance cardBalance;
  private GiftCard giftCard;


  @Before
  public void setUp() throws Exception {
    cardBalance = new CardBalance(0,0);
    giftCard = new GiftCard(999999999, cardBalance);
  }

  @Test
  public void getCardNumber() {
    assertEquals(99999999, giftCard.getCardNumber(), 0);
  }

  @Test
  public void getCardBalance() {
    assertEquals(0, cardBalance.getDollars(),0);
    assertEquals(0, cardBalance.getCents(),0);
  }
}