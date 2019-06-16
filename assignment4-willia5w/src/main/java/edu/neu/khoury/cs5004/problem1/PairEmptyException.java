package edu.neu.khoury.cs5004.problem1;


/**
 * Thrown if UserPassPair is empty.
 */
public class PairEmptyException extends Exception {
  private static final String message = "Error: Pair Empty.";

  public PairEmptyException () {
    super(message);
  }
}
