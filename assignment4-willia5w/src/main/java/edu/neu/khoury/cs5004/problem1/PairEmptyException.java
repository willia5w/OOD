package edu.neu.khoury.cs5004.problem1;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * Thrown if UserPassPair is empty.
 */
public class PairEmptyException extends Exception {

  public PairEmptyException (String message) {
    super(message);
  }
}
