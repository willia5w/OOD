package edu.neu.css.cs5004.shapes;

/**
 * This class represents a 2D point. This point is denoted in Cartesian
 * coordinates as (xCoord,yCoord).
 */
public class Posn {
  private double xcoord;
  private double ycoord;

  /**
   * Construct a 2d point with the given coordinates.
   *
   * @param xcoord the x-coordinate of this point
   * @param ycoord the y-coordinate of this point
   */
  public Posn(double xcoord, double ycoord) {
    this.xcoord = xcoord;
    this.ycoord = ycoord;
  }

  /**
   * Compute and return the Euclidean distance of this point to the origin.
   *
   * @return the euclidean distance
   */

  public double distToOrigin() {
    return Math.sqrt(xcoord * xcoord + ycoord * ycoord);
  }

  /**
   * Return the x-coordinate of this point.
   *
   * @return x-coordinate of this point
   */
  public double getX() {
    return xcoord;
  }

  /**
   * Return the y-coordinate of this point.
   *
   * @return y-coordinate of this point
   */
  public double getY() {
    return ycoord;
  }
}