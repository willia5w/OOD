package edu.neu.khoury.cs5004.problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PainterTest {
  public Name name;
  public Painter painter;

  @Before
  public void setUp() throws Exception {
    name = new Name("Dan", "Williams");
    painter = new Painter(name, 26, "1993-current", "art", "none", "many");
  }

  @Test
  public void getExhibits() {
    assertEquals("many", painter.getExhibits());
  }

  @Test
  public void getName() {
    assertEquals("Dan Williams", painter.name.getFullName());
  }

  @Test
  public void getAge() {
    assertEquals("many", painter.getAge());
  }

  @Test
  public void getActive() {
    assertEquals("many", painter.getActive());
  }

  @Test
  public void getGenre() {
    assertEquals("many", painter.getGenre());
  }

  @Test
  public void getAwards() {
    assertEquals("many", painter.getAwards());
  }

  @Test
  public void receiveAward() {
    assertEquals("many", painter.recieveAward());
  }
}