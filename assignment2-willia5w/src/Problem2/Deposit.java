package Problem2;

/**
 *
 */
public class Deposit {
  private CardBalance cardBalance;
  private Name name;
  private Integer cardNumber;
  private static Integer maxDollars = 200;
  private static Integer minAmount = 0;

  /**
   * @param cardBalance
   * @param name
   * @param cardNumber
   * @throws Exception
   */
  public Deposit(CardBalance cardBalance, Name name, Integer cardNumber) throws Exception {
    if (this.cardBalance.getDollars() >= maxDollars &&
        this.cardBalance.getCents() < minAmount) {
      new Exception("Invalid amount");
    } else {
      this.cardBalance = cardBalance;
    }
    this.name = name;
    this.cardNumber = cardNumber;
  }

  /**
   * Get value of deposit in dollars and cents
   * @return CardBalance object to view value of deposit
   */
  public CardBalance getCardBalance() {
    return cardBalance;
  }

  /**
   * Get name of card owner who will be receiving the deposit
   * @return Name object containing first and last name of card holder
   */
  public Name getName() {
    return name;
  }

  /**
   * Get card number that balance will be added to through deposit
   * @return Card number as an integer
   */
  public Integer getCardNumber() {
    return cardNumber;
  }
}
