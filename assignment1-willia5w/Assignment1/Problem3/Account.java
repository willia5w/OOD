package Problem3;

/**
 *
 *
 * Class Problem3.Account contains information about a bank account.
 * This class is used as a part of Problem 3.
 **/
public class Account {
  private AccountHolder accountHolder;
  private Amount amount;

  /**
   * Constructor that creates a new Problem1.Swimmer object with the
   * specified first name, last name and best backstroke time.
   *
   * @param accountHolder       - Name of account holder
   * @param amount              - Amount in account
   *
   **/
  public Account(AccountHolder accountHolder, Amount amount) {
    this.accountHolder = accountHolder;
    this.amount = amount;
  }

  /**
   * Returns the account holder's name
   * /@return - account holder's name
   **/
  public AccountHolder getAccountHolder() {
    return accountHolder;
  }

  /**
   * Returns the amount in the account
   * /@return - amount in the account
   **/
  public Amount getAmount() {
    return amount;
  }

  /**
   * Returns a new account with the post-deposit amount
   * /@return - account with the post-deposit amount
   **/
  public Account deposit(Amount depositAmount) {
    Integer newDollars = depositAmount.getDollars()
        + amount.getDollars();
    Integer newCents = depositAmount.getCents()
        + amount.getCents();
    if(newCents > 99) {
        newCents = newCents - 99;
        newDollars = newDollars + 1;
    }
    Amount newAmount = new Amount(newDollars, newCents);
    AccountHolder currentHolder = getAccountHolder();
    return new Account(currentHolder, newAmount);
  }

  /**
   * Returns a new account with the post-withdrawal amount
   * /@return - account with the post-withdrawal amount
   **/
  public Account withdrawal(Amount withdrawalAmount) {
    Integer newDollars = withdrawalAmount.getDollars()
        - amount.getDollars();
    Integer newCents = withdrawalAmount.getCents()
        - amount.getCents();
    Amount newAmount = new Amount(newDollars, newCents);
    AccountHolder currentHolder = getAccountHolder();
    return new Account(currentHolder, newAmount);
  }
}
