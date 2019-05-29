package edu.neu.css.cs5004.shapes;

/**
 * This class represents a circle.  It offers all the operations mandated by the
 * Shape interface.
 */
public class Circle extends AbstractShape {
  private double radius;

  /**
   * Construct a Circle object using the given center and radius.
   *
   * @param xcoord      x coordinate of the center of this circle
   * @param ycoord      y coordinate of the center of this circle
   * @param radius the radius of this circle
   */
  public Circle(double xcoord, double ycoord, double radius) {
    super(new Posn(xcoord, ycoord));
    this.radius = radius;
  }

  /**
   * Construct a circle object with the given radius. It is centered at (0,0).
   *
   * @param radius the radius of this circle
   */
  public Circle(double radius) {
    super(new Posn(0, 0));
    this.radius = radius;
  }

  /**
   * Get the area of the circle.
   * @return the area of the circle
   */
  @Override
  public double area() {
    return Math.PI * radius * radius;
  }

  /**
   * Get the perimeter of the circle.
   * @return perimeter of the circle
   */
  @Override
  public double perimeter() {
    return 2 * Math.PI * radius;
  }

  /**
   * @param factor factor of resizing.
   * @return create new resized circle
   */
  @Override
  public Shape resize(double factor) {
    return new Circle(reference.getX(), reference.getY(), Math.sqrt(factor)
        * radius);
  }


  /**
   * Return string expressing the center and radius of the circle.
   * @return string expressing the center and radius of the circle
   */
  public String toString() {
    return String.format("Circle: center (%.3f,%.3f) radius %.3f",
            this.reference.getX(), this.reference.getY(), this.radius);
  }

  /**
   * Get distance from the origin.
   * @return distance from the origin
   */
  @Override
  public double distanceFromOrigin() {
    return 0;
  }
}