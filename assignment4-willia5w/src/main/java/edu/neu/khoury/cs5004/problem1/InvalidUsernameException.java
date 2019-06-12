package edu.neu.khoury.cs5004.problem1;

/**
 * Thrown if invalid username is entered.
 */
public class InvalidUsernameException extends Exception {

  public InvalidUsernameException(String message) {
    super(message);
  }
}
