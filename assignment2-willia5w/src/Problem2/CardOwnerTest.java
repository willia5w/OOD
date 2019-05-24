package Problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardOwnerTest {
  private CardOwner cardOwner;
  private GiftCard giftCard;
  private Name name;
  private Address address;
  private Email email;
  private CardBalance cardBalance;

  @Before
  public void setUp() throws Exception {
    cardBalance = new CardBalance(0,0);
    giftCard = new GiftCard(999999999, cardBalance);
    name = new Name("Dan", "Williams");
    address = new Address("1287", "Westlake Ave",
        "Seattle", "WA", "98109",
        "USA");
    email = new Email("dmwinnj", "aol.com");
    cardOwner = new CardOwner(giftCard, name, address, email);
  }

  @Test
  public void getGiftCard() {
    GiftCard expectedGiftCard = cardOwner.getGiftCard();
    Integer expectedCardNum = expectedGiftCard.getCardNumber();
    assertEquals(999999999, expectedCardNum, 0);
  }

  @Test
  public void getName() {
    Name expectedName = cardOwner.getName();
    assertEquals("Dan", expectedName.getFirstName());
  }

  @Test
  public void getAddress() {
    Address expectedAddress = cardOwner.getAddress();
    assertEquals("Seattle", expectedAddress.getCityName();
  }

  @Test
  public void getEmail() {
    Email expectedEmail = cardOwner.getEmail();
    assertEquals("dmwinnj", expectedEmail.getLoginName();

  }

  @Test
  public void depositGift() {
    Deposit newGift = new Deposit(cardBalance,name, giftCard.getCardNumber());
  }
}