package Problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {
  private Account account;
  private AccountHolder accountHolder;
  private Amount amount;

  @Before
  public void setUp() throws Exception {
    accountHolder = new AccountHolder("Dan", "Williams");
    amount = new Amount(100, 50);
    account = new Account(accountHolder, amount);
  }

  @Test
  public void getAccountHolder() {
    AccountHolder nAccount = new AccountHolder("Dan", "Williams");
    AccountHolder cAccount = account.getAccountHolder();
    assertEquals(nAccount.getFirstName(), cAccount.getFirstName());
  }

  @Test
  public void getAmount() {
    Amount nAmount = new Amount(100, 50);
    Amount cAmount = account.getAmount();
    assertEquals(nAmount.getCents(), cAmount.getCents());
  }

  @Test
  public void deposit() {
    Amount depAmount = new Amount(200,0);
    Account afterDep = account.deposit(depAmount);
    Amount afterAmount = afterDep.getAmount();
    assertEquals(300, afterAmount.getDollars(), 0);
  }

  @Test
  public void withdrawal() {
    Amount withAmount = new Amount(100,50);
    Account afterWith = account.withdrawal(withAmount);
    Amount afterAmount = afterWith.getAmount();
    assertEquals(0, afterAmount.getCents(), 0);
  }
}