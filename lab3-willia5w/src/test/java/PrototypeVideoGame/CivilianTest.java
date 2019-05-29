package PrototypeVideoGame;

import org.junit.Before;
import org.junit.Test;

public class CivilianTest {
  private Name name;
  private Civilian civilian;

  @Before
  public void setUp() throws Exception {
    name = new Name("Dan", "Williams");
    civilian = new Civilian(name, 26, 1);

  }

  @Test
  public void getWealth() throws IncorrectWealthValueException, IncorrectAgeRangeException {
    try
    {
      civilian = new Civilian(name, 26, 100);
    }
    catch (IncorrectWealthValueException e) {
      fail("An exception should not have been thrown");
    }
    try {
      civilian = new Civilian(name, 26, -100);
    }
    catch (IncorrectWealthValueException e) {
    }
  }
}