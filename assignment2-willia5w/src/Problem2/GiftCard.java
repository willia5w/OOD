package Problem2;

public class GiftCard {
  private Integer cardNumber;
  private CardBalance cardBalance;

  public GiftCard(Integer cardNumber, CardBalance cardBalance) {
    this.cardNumber = cardNumber;
    this.cardBalance = cardBalance;
  }

  public Integer getCardNumber() {
    return cardNumber;
  }

  public CardBalance getCardBalance() {
    return cardBalance;
  }


}
