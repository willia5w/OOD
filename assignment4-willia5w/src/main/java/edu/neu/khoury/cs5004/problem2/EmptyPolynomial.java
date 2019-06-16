package edu.neu.khoury.cs5004.problem2;

import java.util.Objects;

/**
 * Represents an empty polynomial.
 *
 */
public class EmptyPolynomial implements IPolynomial{

  /**
   * Creates an empty polynomial.
   *
   */
  public EmptyPolynomial() {

  }

  /**
   * Compares two polynomials to see if they are the same.
   * @param comparisonPolynomial a polynomial for comparison
   * @return true if the two polynomials are the same.
   */
  public Boolean isSame(EmptyPolynomial comparisonPolynomial) {
    if (equals(comparisonPolynomial)) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public IPolynomial addTerm(Double coefficient, Double power) {
      return new Polynomial(coefficient, power, this);
  }

  @Override
  public IPolynomial removeTerm(Double power) {
    return this;
  }

  @Override
  public Double getDegree() {
    return 0.0;
  }

  @Override
  public Double getCoefficient(Double power) {
    return 0.0;
  }

  @Override
  public Boolean isSame(Polynomial comparisonPolynomial) {
    return comparisonPolynomial.getClass().equals(EmptyPolynomial.class);
  }

  @Override
  public Double evaluate(Double x) {
    return 0.0;
  }

  @Override
  public IPolynomial add(IPolynomial poly) {
    return new Polynomial(poly.getCoefficient(poly.getDegree()), poly.getDegree(), new EmptyPolynomial());
  }

  @Override
  public IPolynomial multiply(IPolynomial poly) {
    return new Polynomial(poly.getCoefficient(poly.getDegree()), poly.getDegree(), new EmptyPolynomial());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof EmptyPolynomial)) {
      return false;
    } else {
      return true;
    }
  }
  @Override
  public int hashCode(Object obj) {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return "";
  }
}
