package Problem3;

/**
 *
 *
 * Class Problem3.Amount contains information the amount in an account.
 * This class is used as a part of Problem 3.
 **/
public class Amount {
  private Integer dollars;
  private Integer cents;

  /**
   * Constructor that creates a new Problem1.Swimmer object with the
   * specified first name, last name and best backstroke time.
   *
   * @param dollars       - Dollars in account
   * @param cents         - Cents in account
   *
   **/
  public Amount(Integer dollars, Integer cents) {
    if (dollars < 0 || cents < 0 || cents > 99) {
      System.out.println("ERROR");
    } else {
      this.dollars = dollars;
      this.cents = cents;
    }
  }

  /**
   * Returns the dollars in the account
   * /@return - dollars in the account
   **/
  public Integer getDollars() {
    return dollars;
  }

  /**
   * Returns the cents in the account
   * /@return - cents in the account
   **/
  public Integer getCents() {
    return cents;
  }
}