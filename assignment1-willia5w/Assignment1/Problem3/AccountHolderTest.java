package Problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountHolderTest {
  private AccountHolder accountHolder;

  @Before
  public void setUp() throws Exception {
    accountHolder = new AccountHolder("Dan", "Williams");
  }

  @Test
  public void getFirstName() {
    assertEquals("Dan", accountHolder.getFirstName());
  }

  @Test
  public void getLastName() {
    assertEquals("Williams", accountHolder.getLastName());
  }
}