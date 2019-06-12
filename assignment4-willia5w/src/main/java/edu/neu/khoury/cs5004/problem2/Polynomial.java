package edu.neu.khoury.cs5004.problem2;

/**
 * Represents a recursive data structure.
 * \5�3 + 4� − 2 creates the string 5x^2 + 4x^1 - 2
 * −50�* + �3 + 3 creates the string -50x^3 + 1x^2 + 3
 * 4� + 2�8 − 3�3 − 10 creates the string 2x^5 - 3x^2 + 4x^1 – 10
 */
public class Polynomial {
  private Integer numTerms;

  // Coefficients must be non-zero
  // Constructor should have no parameters. Creates a Polynomial with no terms (0)
  //

  public Polynomial addTerm(Integer coefficient, Integer power) {
    return new Polynomial();

  }

  public Polynomial removeTerm(Integer power) {
    for (int i = 0; i < numTerms; i++)
      if (term.power == power) {
        return new Polynomial();
      }
  }

  public Polynomial removeTerm(Integer power) {
    for (int i = 0; i < numTerms; i++)
      return new Polynomial();
  }

  public Boolean isSame(Polynomial comparisonPolynomial) {
    if (equals(comparisonPolynomial)) {

    }
  }

}
