package LabAssignment1;

import static org.junit.Assert.*;

public class NameTest {
  private Name athletesName;

  @org.junit.Before
  public void setUp() throws Exception {
    athletesName = new Name("Dan", "M", "Williams");
  }

  @org.junit.Test
  public void getFirstName() {
    assertEquals("Dan", athletesName.getFirstName());
  }

  @org.junit.Test
  public void getMiddleName() {
    assertEquals("M", athletesName.getMiddleName());
  }

  @org.junit.Test
  public void getLastName() {
    assertEquals("Williams", athletesName.getLastName());
  }
}