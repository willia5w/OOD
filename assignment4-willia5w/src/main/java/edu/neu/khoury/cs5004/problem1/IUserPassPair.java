package edu.neu.khoury.cs5004.problem1;

/**
 * Implements a Username-Password pair for an authentication system.
 */
public interface IUserPassPair {


  /**
   *
   * This Username-Password pair does the following:
   *
   * - Creates an empty UserPassPair.
   *
   * - Returns whether or not a UserPassPair is empty.
   *
   * - Create a new UserPassPair, throw error if one already exists.
   *
   * - Replace values in current UserPassPair, throw error if empty.
   *
   * - Deletes a verified user's Username-Password pair. Throws exception if invalid.
   *
   * - Return the password of a Username-Password pair if valid. Throws exception if invalid.
   *
   */

  /**
   * Creates an empty UserPassPair.
   * @return a new empty UserPassPair
   */
  UserPassPair createEmpty();

  /**
   * Returns whether or not a UserPassPair is empty.
   * @return true if UserPassPair is empty, false otherwise
   */
  Boolean isEmpty();

  /**
   * Sets up Username and Password for an empty UserPassPair.
   * @param u Username
   * @param p Password
   * @return a new Non-Empty UserPassPair if previously empty
   * @throws PairAlreadyInitialized if UserPassPair is Non-Empty
   */
  UserPassPair add(String u, String p) throws PairAlreadyInitialized;


  /**
   * Replace current UserName and Password with new ones.
   * @param u Replacement UserName
   * @param p Replacement Password
   * @return a new UserPassPair with updated values
   * @throws PairEmptyException if the UserPassPair is empty
   */
  UserPassPair replace(String u, String p)throws PairEmptyException;

  /**
   * Retunrs a new empty UserPassPair.
   * @param x UserName of the UserPassPair user is looking to delete
   * @return an empty UserPassPair if currently empty or if there is a UserName match
   * @throws InvalidUsernameException if the UserName is not empty but there is no match
   */
  UserPassPair delete(String x) throws InvalidUsernameException;

  /**
   * Returns corresponding Password matching UserPassPair.
   *
   * @param x UserName of the UserPassPair you wish to get the Password from
   * @return the Password of the matched UserPassPair
   * @throws PairEmptyException if called on an empty UserPassPair
   * @throws InvalidUsernameException if UserPassPair is Non-Empty but UserName does not match
   */
  String getPassword(String x) throws PairEmptyException, InvalidUsernameException;

  /**
   * Returns true if two UserPassPair are equal.
   * @param obj a comparison UserPassPair
   * @return true if equal, false otherwise
   */
  boolean equals(Object obj);

  /**
   * Return the hash code of a UserPassPair.
   * \
   * @param obj a UserPassPair
   * @return an integer representation of a UserPassPair
   */
  int hashCode(Object obj);

  /**
   * Return a string representation of a UserPassPair.
   *
   * @return String representation of a UserPassPair
   */
  String toString();
}
