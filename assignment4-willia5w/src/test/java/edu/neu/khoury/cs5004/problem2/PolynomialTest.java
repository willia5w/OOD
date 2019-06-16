package edu.neu.khoury.cs5004.problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PolynomialTest {
  private Polynomial polynomial;
  private EmptyPolynomial emptyPolynomial;

  @Before
  public void setUp() throws Exception {
    emptyPolynomial = new EmptyPolynomial();
    polynomial = new Polynomial(1.0, 0.0, emptyPolynomial);
  }

  @Test
  public void addTerm() {
    Polynomial onePolynomial = new Polynomial(2.0, 2.0, emptyPolynomial);
    Polynomial expectedPolynomial = new Polynomial(6.0, 2.0, emptyPolynomial);
    assertEquals(expectedPolynomial.toString(), onePolynomial.addTerm(4.0, 2.0).toString());
  }

  @Test
  public void removeTerm() {
    Polynomial twoPolynomial = new Polynomial(1.0, 2.0, emptyPolynomial);
    assertEquals(emptyPolynomial, twoPolynomial.removeTerm(2.0));
  }

  @Test
  public void isSame() {
    EmptyPolynomial expectedPolynomial = new EmptyPolynomial();
    assertEquals(true, emptyPolynomial.isSame(expectedPolynomial));
  }

  @Test
  public void isNotSame() {
    Polynomial onePolynomial = new Polynomial(1.0, 2.0, emptyPolynomial);
    Polynomial expectedPolynomial = new Polynomial(4.0, 3.0, emptyPolynomial);
    assertEquals(false, onePolynomial.isSame(expectedPolynomial));
  }

  @Test
  public void evaluate() {
    Polynomial expectedPolynomial = new Polynomial(2.0, 3.0, emptyPolynomial);
    assertEquals(16.0, expectedPolynomial.evaluate(2.0), 0);
  }

  @Test
  public void multiply() {
    Polynomial onePolynomial = new Polynomial(2.0, 2.0, emptyPolynomial);
    Polynomial twoPolynomial = new Polynomial(3.0, 2.0, emptyPolynomial);
    Polynomial expectedPolynomial = new Polynomial(4.0, 2.0, emptyPolynomial);
    assertEquals(expectedPolynomial.toString(), onePolynomial.multiply(twoPolynomial).toString());
  }

  @Test
  public void multiplyUnlike() {
    Polynomial onePolynomial = new Polynomial(2.0, 2.0, emptyPolynomial);
    Polynomial twoPolynomial = new Polynomial(3.0, 2.0, onePolynomial);
    Polynomial unlikePolynomial = new Polynomial(4.0, 5.0, emptyPolynomial);
    Polynomial expectedPolynomial = new Polynomial(16.0, 5.0, emptyPolynomial);
    assertEquals(expectedPolynomial.toString(), unlikePolynomial.multiply(twoPolynomial).toString());
  }

  @Test
  public void getDegree() {
    Polynomial onePolynomial = new Polynomial(1.0, 2.0, emptyPolynomial);
    assertEquals(2.0, onePolynomial.getDegree(), 0);
  }

  @Test
  public void getCoefficient() {
    Polynomial onePolynomial = new Polynomial(1.0, 2.0, emptyPolynomial);
    assertEquals(0.0, onePolynomial.getCoefficient(2.0), 0);
  }

  @Test
  public void add() {
    Polynomial onePolynomial = new Polynomial(1.0, 2.0, emptyPolynomial);
    Polynomial twoPolynomial = new Polynomial(1.0, 2.0, emptyPolynomial);
    Polynomial expectedPolynomial = new Polynomial(2.0, 2.0, emptyPolynomial);
    assertEquals(expectedPolynomial.toString(), onePolynomial.add(twoPolynomial).toString());
  }

  @Test
  public void hashCode1() {
    Polynomial onePolynomial = new Polynomial(1.0, 2.0, emptyPolynomial);
    Polynomial twoPolynomial = new Polynomial(1.0, 2.0, emptyPolynomial);
    assertEquals(onePolynomial.hashCode(twoPolynomial), twoPolynomial.hashCode(onePolynomial));
  }

  @Test
  public void equals1() {
    Polynomial onePolynomial = new Polynomial(1.0, 2.0, emptyPolynomial);
    Polynomial twoPolynomial = new Polynomial(1.0, 2.0, emptyPolynomial);
    assertEquals(onePolynomial.equals(twoPolynomial), twoPolynomial.equals(onePolynomial));
  }

  @Test
  public void equals1New() {
    Polynomial onePolynomial = new Polynomial(1.0, 2.0, emptyPolynomial);
    assertEquals(false, onePolynomial.equals(new Polynomial(1.0, 3.0, emptyPolynomial)));
  }

  @Test
  public void toString1() {
    Polynomial onePolynomial = new Polynomial(1.0, 2.0, emptyPolynomial);
    Polynomial twoPolynomial = new Polynomial(1.0, 2.0, emptyPolynomial);
    assertEquals(onePolynomial.toString(), twoPolynomial.toString());
  }

  @Test
  public void toString1Long() {
    Polynomial onePolynomial = new Polynomial(1.0, 2.0, emptyPolynomial);
    Polynomial twoPolynomial = new Polynomial(1.0, 2.0, onePolynomial);
    Polynomial threePolynomial = new Polynomial(1.0, 2.0, onePolynomial);
    assertEquals(twoPolynomial.toString(), threePolynomial.toString());
  }
}