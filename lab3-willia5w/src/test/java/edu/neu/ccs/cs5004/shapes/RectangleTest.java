package edu.neu.ccs.cs5004.shapes;

import edu.neu.css.cs5004.shapes.Rectangle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
  public Rectangle rectangle;

  @Before
  public void setUp() throws Exception {
    rectangle = new Rectangle(0.0, 5.5, 4, 3);

  }

  @Test
  public void invalidRectangle() {
    Rectangle invalid = new Rectangle(0.0, 5.5, 0, 0);
  }

  @Test
  public void validRectangle() {
    Rectangle invalid = new Rectangle(0.0, 5.5, 100, 200);
  }

}