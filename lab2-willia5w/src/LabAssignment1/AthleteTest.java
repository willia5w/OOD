package LabAssignment1;

import static org.junit.Assert.*;

public class AthleteTest {
  private Name athletesName;
  private Athlete athlete;

  @org.junit.Before
  public void setUp() throws Exception {
    athletesName = new Name("Dan", "M", "Williams");
    athlete = new Athlete(athletesName, 5.75, 155.50, "Curling");
  }

  @org.junit.Test
  public void getAthletesName() {
    assertEquals("Dan M Williams", athletesName.getFirstName()
        + " " + athletesName.getMiddleName() + " " + athletesName.getLastName());
  }

  @org.junit.Test
  public void getHeight() {
    Double testHeight = 5.75;
    assertEquals(testHeight, athlete.getHeight());
  }

  @org.junit.Test
  public void getWeight() {
    Double testWeight = 155.50;
    assertEquals(testWeight, athlete.getWeight());
  }

  @org.junit.Test
  public void getLeague() {
    assertEquals("Curling", athlete.getLeague());
  }
}