package edu.neu.khoury.cs5004.problem1;

/**
 * Thrown if UserPassPair is non-empty.
 */
public class PairAlreadyInitialized extends Exception {

  public PairAlreadyInitialized(String message) {
    super(message);
  }
}
