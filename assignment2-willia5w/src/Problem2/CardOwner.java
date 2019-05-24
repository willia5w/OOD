package Problem2;

/**
 *
 */
public class CardOwner {
  private GiftCard giftCard;
  private Name name;
  private Address address;
  private Email email;


  /**
   * Provides a card owner with an updated gift card if a valid deposit has
   * been made to them
   *
   * @param newGift Takes a deposit as an argument
   * @return Returns a new GiftCard if deposit was successful
   */
  public GiftCard depositGift(Deposit newGift) {

    Name checkName = newGift.getName();
    if(checkName.getFirstName() == name.getFirstName() && checkName.getLastName() == name.getLastName()) {
      checkName = name;
    }

    CardBalance currentBalance = giftCard.getCardBalance();
    Integer currentDollars = currentBalance.getDollars();
    Integer currentCents = currentBalance.getCents();

    CardBalance addToBalance = newGift.getCardBalance();
    Integer addDollars = addToBalance.getDollars();
    Integer addCents = addToBalance.getCents();

    Integer newDollars = currentDollars + addDollars;
    Integer newCents = currentCents + addCents;

    if(newCents > 99) {
      newCents = newCents - 100;
      newDollars = newDollars + 1;
    }

    CardBalance newBalance = new CardBalance(newDollars, newCents);

    return new GiftCard(giftCard.getCardNumber(), newBalance);
  }
}
