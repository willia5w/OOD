package edu.neu.khoury.cs5004.problem2;

import java.util.Objects;

/**
 * Represents a recursive data structure polynomial.
 *
 */
public class Polynomial implements IPolynomial{
  private Double coefficient;
  private Double power;
  private IPolynomial nextTerm;

  /**
   * Creates a new Polynomial given a coefficient, power, and next term.
   *
   * @param coefficient the coefficient
   * @param power the power
   * @param nextTerm the next term
   */
  public Polynomial(Double coefficient, Double power, IPolynomial nextTerm) {
    this.coefficient = coefficient;
    this.power = power;
    this.nextTerm = nextTerm;
  }

  /**
   * Takes a coefficient and a power and returns a new Polynomial.
   * @param coefficient the coefficient
   * @param power the power
   * @return a new Polynomial with updated coefficient and power
   */
  @Override
  public IPolynomial addTerm(Double coefficient, Double power) {
    if (this.power > power) {
      return new Polynomial(this.coefficient, this.power, addTerm(coefficient, power));
    } else if (this.power.equals(power)) {
      return new Polynomial(coefficient + this.coefficient, this.power, this.nextTerm);
    } else {
      return new Polynomial(coefficient, power, this);
    }
  }
  /**
   * Takes a power and removes all terms in the Polynomial with that power.
   * @param power the power of the terms that are to be removed
   * @return a new Polynomial
   */
  @Override
  public IPolynomial removeTerm(Double power) {
    return this.power.equals(power) ? this.nextTerm : new Polynomial(this.coefficient,
        this.power, this.nextTerm.removeTerm(power));
  }
  /**
   * Returns true if two Polynomials are the same.
   * @return true if two Polynomials are same
   */
  @Override
  public Boolean isSame(Polynomial comparisonPolynomial) {
    if (this.equals(comparisonPolynomial)) {
      return true;
    } else {
      return false;
    }
  }
  /**
   * Evaluates a number.
   * @param x a double-precision number
   * @return a double-precision result
   */
  @Override
  public Double evaluate(Double x) {
    return Math.pow(x, power) * coefficient + nextTerm.evaluate(x);
  }
  /**
   * Multiplies together two Polynomials returning a new one.
   * @param poly IPolynomial object
   * @return a new Polynomial that is the product of two other Polynomials.
   */
  @Override
  public IPolynomial multiply(IPolynomial poly) {
    if (this.power > power) {
      return new Polynomial(this.coefficient, this.power, addTerm(coefficient, power));
    } else if (this.power.equals(power)) {
      return new Polynomial(coefficient * this.coefficient, this.power, this.nextTerm);
    } else {
      return new Polynomial(coefficient, power, this);
    }
  }
  /**
   * Returns the degree of the Polynomial.
   * @return the degree of the Polynomial
   */
  @Override
  public Double getDegree() {
    return this.power;
  }
  /**
   * Returns the coefficient of the Polynomial.
   * @param power the power of the term with the coefficient the user is searching for
   * @return the coefficient of the Polynomial.
   */
  @Override
  public Double  getCoefficient(Double power) {
    if (this.power == power) {
      return this.coefficient;
    } else {
      return this.nextTerm.getCoefficient(power);
    }
  }
  /**
   * Adds together two Polynomials returning a new one.
   * @param poly IPolynomial object
   * @return a new Polynomial that is the sum of two other Polynomials.
   */
  @Override
  public IPolynomial add(IPolynomial poly) {
    return new Polynomial(this.coefficient + coefficient, this.power, this.nextTerm);
  }
  /**
   * Return the hash code of a Polynomial
   * @param obj a Polynomial
   * @return an integer representation of a Polynomial
   */
  @Override
  public int hashCode(Object obj) {
    return Objects.hash(getCoefficient(power), power, nextTerm);
  }
  /**
   * Returns true if two Polynomials are equal.
   * @param o a comparison Polynomial
   * @return true if equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Polynomial)) return false;
    Polynomial that = (Polynomial) o;
    return Objects.equals(getCoefficient(power), that.getCoefficient(power)) &&
        Objects.equals(power, that.power) &&
        Objects.equals(nextTerm, that.nextTerm);
  }
  /**
   * Return a string representation of a Polynomial.
   * 5x^2 + 4x − 2 creates the string 5x^2 + 4x^1 - 2
   * −50x * + x^2 + 3 creates the string -50x^3 + 1x^2 + 3
   * 4x + 2x^5 − 3x^2 − 10 creates the string 2x^5 - 3x^2 + 4x^1 – 10
   *
   * @return String representation of a Polynomial
   */
  @Override
  public String toString() {
    if ((!(this.nextTerm  instanceof EmptyPolynomial))) {
      return coefficient + "x^" + power + "+";
    } else {
      return coefficient + "x^" + power;
    }
  }
}
