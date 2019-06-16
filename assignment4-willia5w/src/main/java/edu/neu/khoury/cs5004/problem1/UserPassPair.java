package edu.neu.khoury.cs5004.problem1;

import java.util.Objects;

/**
 * Represents a Username Password pair.
 *
 */
public class UserPassPair implements IUserPassPair{
  private String username;
  private String password;

  /**
   * Creates a new UserPassPair given a username and password.
   *
   * @param username the username of the UserPassPair.
   * @param password the password of the UserPassPair.
   */
  public UserPassPair(String username, String password) {
    this.username = username;
    this.password = password;
  }

  /**
   * Creates an empty UserPassPair
   */
  public UserPassPair() {
  }
  /**
   * Creates an empty UserPassPair.
   * @return a new empty UserPassPair
   */
  @Override
  public UserPassPair createEmpty() {
    return new UserPassPair();
  }
  /**
   * Returns whether or not a UserPassPair is empty.
   * @return true if UserPassPair is empty, false otherwise
   */
  @Override
  public Boolean isEmpty() {
    if (this.username == null) {
      return true;
    } else {
      return false;
    }
  }
  /**
   * Sets up Username and Password for an empty UserPassPair.
   * @param u Username
   * @param p Password
   * @return a new Non-Empty UserPassPair if previously empty
   * @throws PairAlreadyInitialized if UserPassPair is Non-Empty
   */
  @Override
  public UserPassPair add(String u, String p) throws PairAlreadyInitialized {
    if (isEmpty()) {
      return new UserPassPair(u, p);
    } else {
      throw new PairAlreadyInitialized();
    }
  }
  /**
   * Replace current UserName and Password with new ones.
   * @param u Replacement UserName
   * @param p Replacement Password
   * @return a new UserPassPair with updated values
   * @throws PairEmptyException if the UserPassPair is empty
   */
  @Override
  public UserPassPair replace(String u, String p) throws PairEmptyException {
    if (isEmpty()) {
      throw new PairEmptyException();
    } else {
      return new UserPassPair(u, p);
    }
  }
  /**
   * Retunrs a new empty UserPassPair.
   * @param x UserName of the UserPassPair user is looking to delete
   * @return an empty UserPassPair if currently empty or if there is a UserName match
   * @throws InvalidUsernameException if the UserName is not empty but there is no match
   */
  @Override
  public UserPassPair delete(String x) throws InvalidUsernameException {
    if (isEmpty()) {
      return createEmpty();
    } else if (this.username == x) {
      return createEmpty();
    } else {
      throw new InvalidUsernameException();
    }
  }
  /**
   * Returns corresponding Password matching UserPassPair.
   *
   * @param x UserName of the UserPassPair you wish to get the Password from
   * @return the Password of the matched UserPassPair
   * @throws PairEmptyException if called on an empty UserPassPair
   * @throws InvalidUsernameException if UserPassPair is Non-Empty but UserName does not match
   */
  @Override
  public String getPassword(String x) throws PairEmptyException, InvalidUsernameException {
    if (isEmpty()) {
      throw new PairEmptyException();
    } else if (this.username == x) {
      return this.password;
    } else {
      throw new InvalidUsernameException();
    }
  }
  /**
   * Returns true if two UserPassPair are equal.
   * @param o a comparison UserPassPair
   * @return true if equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof UserPassPair)) return false;
    UserPassPair that = (UserPassPair) o;
    return Objects.equals(username, that.username) &&
        Objects.equals(password, that.password);
  }

  /**
   * Return the hash code of a UserPassPair.
   *
   * @param obj a UserPassPair
   * @return an integer representation of a UserPassPair
   */
  @Override
  public int hashCode(Object obj) {
    return 0;
  }

  /**
   * Return the hash code of a UserPassPair.
   *
   * @return an integer representation of a UserPassPair
   */
  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }

  /**
   * Return a string representation of a UserPassPair.
   *
   * @return String representation of a UserPassPair
   */
  @Override
  public String toString() {
    return "UserPassPair{" +
        "username='" + username + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}
