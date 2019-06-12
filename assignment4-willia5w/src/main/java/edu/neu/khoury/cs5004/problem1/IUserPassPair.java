package edu.neu.khoury.cs5004.problem1;

/**
 * Implements a Username-Password pair for an authentication system.
 */
public interface IUserPassPair {

  /**
   * empty = {<>} , nonempty = (u,p)
   *
   * This Username-Password pair does the following:
   *
   * Creates an empty UserPassPair.
   *
   * Returns whether or not a UserPassPair is empty.
   *
   * Create a new UserPassPair, throw error if one already exists.
   *
   * Replace values in current UserPassPair, throw error if empty.
   *
   * Deletes a verified user's Username-Password pair. Throws exception if invalid.
   *
   * Return the password of a Username-Password pair if valid. Throws exception if invalid.
   *
   */

  UserPassPair createEmpty();

  Boolean isEmpty();

  UserPassPair add();

  UserPassPair replace();

  UserPassPair delete();

  String getPassword();


}
