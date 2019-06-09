package edu.neu.khoury.cs5004.problem2;

/**
 * Exception thrown if building is too tall for ladder.
 */
public class TooManyFloorsException extends Exception {
  public TooManyFloorsException(String message) {
    super(message);
  }
}
