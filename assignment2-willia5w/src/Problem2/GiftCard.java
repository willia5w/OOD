package Problem2;

/**
 * This class represents a gift card which is composed of a number and a balance
 */
public class GiftCard {
  private Integer cardNumber;
  private CardBalance cardBalance;

  /**
   * Creates a GiftCard object given a card number and balance
   * @param cardNumber the gift card's numbernce
   * @param cardBalance the gift card's bala
   */
  public GiftCard(Integer cardNumber, CardBalance cardBalance) {
    if(this.cardNumber >= 100000000 && this.cardNumber <= 999999999) {
      this.cardNumber = cardNumber;
    } else {
      System.out.println("Invalid Card Number");
    }
    this.cardBalance = cardBalance;
  }

  /**
   * Get the gift card's card number
   * @return the gift card's card number
   */
  public Integer getCardNumber() {
    return cardNumber;
  }

  /**
   * Get the gift card's balance
   * @return the gift card's balance
   */
  public CardBalance getCardBalance() {
    return cardBalance;
  }
}
