package edu.neu.khoury.cs5004.problem2;

public interface IPolynomial {
  /**
   * This interface does the following:
   *
   * Takes a coefficient and a power (both integer
   * numbers), and adds the resulting term to the polynomial. Builds a Polynomial term by term.
   *
   * Takes a power, and removes any and all terms in the polynomial with that power.
   *
   * Returns the degree of this polynomial.
   *
   * Takes a power, and returns the coefficient for
   * the term with that power.
   *
   * Takes another IPolynomial object and returns true if
   * they are the same, false otherwise.
   *
   * Takes a double-precision decimal number, and returns
   * a double-precision result.
   *
   * Takes another IPolynomial object, and returns the
   * polynomial obtained by adding the two polynomials.
   *
   * Takes another IPolynomial object, and returns the
   * polynomial obtained by multiplying the two polynomials.
   *
   */

  /**
   * Takes a coefficient and a power and returns a new Polynomial.
   * @param coefficient the coefficient
   * @param power the power
   * @return a new Polynomial with updated coefficient and power
   */
  IPolynomial addTerm(Double coefficient, Double power);

  /**
   * Takes a power and removes all terms in the Polynomial with that power.
   * @param power the power of the terms that are to be removed
   * @return a new Polynomial
   */
  IPolynomial removeTerm(Double power);


  /**
   * Returns the degree of the Polynomial.
   * @return the degree of the Polynomial
   */
  Double  getDegree();

  /**
   * Returns the coefficient of the Polynomial.
   * @param power the power of the term with the coefficient the user is searching for
   * @return the coefficient of the Polynomial.
   */
  Double  getCoefficient(Double power);

  /**
   * Returns true if two Polynomials are the same.
   * @return true if two Polynomials are same
   */
  Boolean isSame(Polynomial comparisonPolynomial);

  /**
   * Evaluates a number.
   * @param x a double-precision number
   * @return a double-precision result
   */
  Double evaluate(Double x);

  /**
   * Adds together two Polynomials returning a new one.
   * @param poly IPolynomial object
   * @return a new Polynomial that is the sum of two other Polynomials.
   */
  IPolynomial add(IPolynomial poly);

  /**
   * Multiplies together two Polynomials returning a new one.
   * @param poly IPolynomial object
   * @return a new Polynomial that is the product of two other Polynomials.
   */
  IPolynomial multiply(IPolynomial poly);

  /**
   * Returns true if two Polynomials are equal.
   * @param obj a comparison Polynomial
   * @return true if equal, false otherwise
   */
  boolean equals(Object obj);

  /**
   * Return the hash code of a Polynomial
   * @param obj a Polynomial
   * @return an integer representation of a Polynomial
   */
  int hashCode(Object obj);

  /**
   * Return a string representation of a Polynomial.
   * 5x^2 + 4x − 2 creates the string 5x^2 + 4x^1 - 2
   * −50x * + x^2 + 3 creates the string -50x^3 + 1x^2 + 3
   * 4x + 2x^5 − 3x^2 − 10 creates the string 2x^5 - 3x^2 + 4x^1 – 10
   *
   * @return String representation of a Polynomial
   */
  String toString();

}
