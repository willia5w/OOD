package edu.neu.css.cs5004.shapes;

/**
 * This class represents a rectangle.  It defines all the operations mandated by
 * the Shape interface
 */
public class Rectangle extends AbstractShape {
  private double width;
  private double height;

  /**
   * Constructs a rectangle object with the given location of its lower-left
   * corner and dimensions.
   *
   * @param xcoord x coordinate of the lower-left corner of this rectangle
   * @param ycoord y coordinate of the lower-left corner of this rectangle
   * @param width  width of this rectangle
   * @param height height of this rectangle
   */
  public Rectangle(double xcoord, double ycoord, double width, double height) throws IllegalArgumentException {
    super(new Posn(xcoord, ycoord));
    this.width = width;
    this.height = height;
    if (this.width <= 0 || this.height <= 0) {
      throw new IllegalArgumentException("Input cannot be zero or negative");
    }
  }

  @Override
  public double area() {
    return this.width * this.height;
  }

  @Override
  public double perimeter() {
    return 2 * (this.width + this.height);
  }

  @Override
  public Shape resize(double factor) {
    double sqrtFactor = Math.sqrt(factor);
    return new Rectangle(
        this.reference.getX(),
        this.reference.getY(),
            sqrtFactor * this.width,
            sqrtFactor * this.height);
  }

  /**
   * Return string expressing the dimensions of the rectangle.
   * @return string expressing the dimensions of the rectangle
   */
  public String toString() {
    return String.format("Rectangle: LL corner (%.3f,%.3f) width %.3f height "
                    + "%.3f",
        this.reference.getX(), this.reference.getY(), this.width, this
            .height);
  }
}