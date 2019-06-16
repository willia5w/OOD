package edu.neu.khoury.cs5004.problem1;

/**
 * Thrown if UserPassPair is non-empty.
 */
public class PairAlreadyInitialized extends Exception {
  private static final String message = "Error: Pair already initialized.";

  public PairAlreadyInitialized() {
    super(message);
  }
}
