package edu.neu.khoury.cs5004.problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserPassPairTest {
  private UserPassPair userPassPair;

  @Before
  public void setUp() throws Exception {
    userPassPair = new UserPassPair("Dan", "Coffee");
  }

  @Test
  public void createEmpty() {
    userPassPair.createEmpty();
  }

  @Test
  public void isEmpty() {
    assertFalse(userPassPair.isEmpty());
  }

  @Test(expected = PairAlreadyInitialized.class)
  public void addError() throws PairAlreadyInitialized {
    UserPassPair existing = new UserPassPair("Rabbit", "Carrot");
    existing.add("Tortoise", "Lettuce");
  }
  @Test
  public void add() throws PairAlreadyInitialized {
    UserPassPair existing = new UserPassPair();
    UserPassPair comparison = new UserPassPair("Rabbit", "Carrot");
    assertEquals(existing.add("Rabbit", "Carrot").toString(), comparison.toString());
  }

  @Test
  public void replace() throws PairEmptyException {
    UserPassPair existing = new UserPassPair("Rabbit", "Carrot");
    assertEquals(existing.replace("Dan", "Coffee").toString(), userPassPair.toString());
  }

  @Test(expected = PairEmptyException.class)
  public void replaceError() throws PairEmptyException {
    UserPassPair existing = new UserPassPair();
    existing.replace("Dan", "Coffee");
  }

  @Test
  public void deleteEmpty() throws InvalidUsernameException {
    UserPassPair existing = new UserPassPair();
    UserPassPair expected = new UserPassPair();
    assertEquals(existing.delete("Rabbit"), expected);
  }

  @Test
  public void deleteMatch() throws InvalidUsernameException {
    UserPassPair existing = new UserPassPair("Rabbit", "Carrot");
    UserPassPair expected = new UserPassPair();
    assertEquals(existing.delete("Rabbit"), expected);
  }

  @Test(expected = InvalidUsernameException.class)
  public void deleteError() throws InvalidUsernameException {
    UserPassPair existing = new UserPassPair("Rabbit", "Carrot");
    existing.delete("Dan");
  }

  @Test(expected = PairEmptyException.class)
  public void getPasswordEmpty() throws PairEmptyException, InvalidUsernameException {
    UserPassPair existing = new UserPassPair();
    existing.getPassword("Dan");
  }

  @Test
  public void getPassword() throws PairEmptyException, InvalidUsernameException {
    assertEquals(userPassPair.getPassword("Dan"), "Coffee");
  }

  @Test(expected = InvalidUsernameException.class)
  public void getPasswordInvalid() throws PairEmptyException, InvalidUsernameException {
    UserPassPair existing = new UserPassPair("Rabbit", "Carrot");
    existing.getPassword("Dan");
  }
}