package edu.neu.khoury.cs5004.problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmptyPolynomialTest {
  private EmptyPolynomial emptyPolynomial;

  @Before
  public void setUp() throws Exception {
    emptyPolynomial = new EmptyPolynomial();
  }

  @Test
  public void isSame() {
   Polynomial polynomial = new Polynomial(1.0, 0.0, emptyPolynomial);
   EmptyPolynomial testEmptyPolynomial = new EmptyPolynomial();
   assertFalse(emptyPolynomial.isSame(polynomial));
   assertTrue(emptyPolynomial.isSame(testEmptyPolynomial));
  }

  @Test
  public void addTerm() {
    assertEquals(emptyPolynomial.addTerm(4.0, 2.0).toString(),
        new Polynomial(4.0, 2.0, emptyPolynomial).toString());
  }

  @Test
  public void removeTerm() {
    assertEquals(emptyPolynomial, emptyPolynomial.removeTerm(0.0));
  }

  @Test
  public void getDegree() {
    assertEquals(0.0, emptyPolynomial.getDegree(), 0);
  }

  @Test
  public void getCoefficient() {
    assertEquals(0.0, emptyPolynomial.getCoefficient(0.0), 0);
  }


  @Test
  public void evaluate() {
    assertEquals(0.0, emptyPolynomial.evaluate(9.0), 0);
  }

  @Test
  public void add() {
    Polynomial polynomial = new Polynomial(1.0, 0.0, emptyPolynomial);
    assertEquals(emptyPolynomial.add(polynomial).toString(), polynomial.toString());
  }

  @Test
  public void multiply() {
    Polynomial polynomial = new Polynomial(1.0, 0.0, emptyPolynomial);
    assertEquals(emptyPolynomial.multiply(polynomial).toString(), polynomial.toString());
  }

  @Test
  public void equals1() {
    EmptyPolynomial testEmptyPolynomial = new EmptyPolynomial();
    assertEquals(true, testEmptyPolynomial.equals(emptyPolynomial));
  }

  @Test
  public void hashCode1() {
    EmptyPolynomial testEmptyPolynomial = new EmptyPolynomial();
    assertEquals(testEmptyPolynomial.hashCode(), testEmptyPolynomial.hashCode(), 0);
  }

  @Test
  public void toString1() {
    EmptyPolynomial testEmptyPolynomial = new EmptyPolynomial();
    assertEquals(emptyPolynomial.toString(), testEmptyPolynomial.toString());
  }
}