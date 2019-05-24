package edu.neu.css.cs5004.shapes;

public abstract class AbstractShape implements Shape {

  protected Posn reference;

  public AbstractShape(Posn reference) {
    this.reference = reference;
  }

  @Override
  public double distanceFromOrigin() {
    return reference.distToOrigin();
  }

}
