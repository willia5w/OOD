package edu.neu.khoury.cs5004.problem1;

/**
 * Thrown if invalid username is entered.
 */
public class InvalidUsernameException extends Exception {
  private static final String message = "Error: Invalid username.";

  public InvalidUsernameException() {
    super(message);
  }
}
