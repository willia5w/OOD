package Problem2;

/**
 * Class card balance contains information the amount in an account.
 * This class is used as a part of Problem 2.
 *
 **/
public class CardBalance {
  private Integer dollars;
  private Integer cents;

  /**
   * Constructor that creates a new CardBalance object with the
   * current amount in dollars and cents. Does not allow negative amounts.
   *
   * @param dollars - Dollars on the card
   * @param cents - Cents on the card
   *
   **/
  public CardBalance(Integer dollars, Integer cents) {
    if (dollars < 0 || cents < 0 || cents > 99) {
      System.out.println("ERROR");
    } else {
      this.dollars = dollars;
      this.cents = cents;
    }
  }

  /**
   * Get the dollars on the card
   * /@return - dollars on the card
   **/
  public Integer getDollars() {
    return dollars;
  }

  /**
   * Get the cents on the card
   * /@return - cents on the card
   **/
  public Integer getCents() {
    return cents;
  }
}
}
