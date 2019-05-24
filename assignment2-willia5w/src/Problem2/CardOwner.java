package Problem2;

/**
 *This class represents a card owner and contains their gift card and information such as their name, address, and email
 */
public class CardOwner {
  private GiftCard giftCard;
  private Name name;
  private Address address;
  private Email email;


  /**
   * Creates a CardOwner object with their gift card, name, address, and email
   *
   * @param giftCard the card owner's gift card
   * @param name the card owner's gift card
   * @param address the card owner's gift card
   * @param email the card owner's gift card
   */
  public CardOwner(GiftCard giftCard, Name name, Address address, Email email) {
    this.giftCard = giftCard;
    this.name = name;
    this.address = address;
    this.email = email;
  }

  /**
   * Get the card owner's gift card
   * @return the card owner's gift card
   */
  public GiftCard getGiftCard() {
    return giftCard;
  }

  /**
   * Get the card owner's name
   * @return the card owner's name
   */
  public Name getName() {
    return name;
  }

  /**
   * Get the card owner's address
   * @return the card owner's address
   */
  public Address getAddress() {
    return address;
  }

  /**
   * Get the card owner's email
   * @return the card owner's email
   */
  public Email getEmail() {
    return email;
  }
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
