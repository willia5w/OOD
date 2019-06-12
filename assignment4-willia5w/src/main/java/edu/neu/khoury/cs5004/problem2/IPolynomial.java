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

  Polynomial addTerm();

  Polynomial removeTerm();

  Integer getDegree();

  Integer getCoefficient();

  Boolean isSame();

  Double evaluate();

  Polynomial add();

  Polynomial multiply();

  boolean equals(Object obj);

  String toString();

}
