package edu.neu.khoury.cs5004.problem1;

public interface ISet<T> {

  /**
   * Returns an empty set.
   *
   * @return an empty set
   */
  ISet emptySet();

  /**
   * Returns whether or not the set is empty.
   *
   * @return true if empty
   */
  Boolean isEmpty();

  /**
   * Adds an element to a set.
   *
   * Returns a new set containing element n if set was empty.
   *
   * Returns a new set containing element n and elements previously
   * in the set if set was previously non-empty.
   *
   * Returns the same set if element n was already present.
   *
   * @param n element being added into set
   * @return a new set
   */
  ISet add(T n);

  /**
   * Returns true if element contained in set.
   *
   * Returns false if element not contained in set or set is empty.
   *
   * @param n element that user is searching for in the set
   * @return true or false
   */
  Boolean contains(T n);

  /**
   * Returns a new set with the target element removed if it was contained.
   *
   * Returns the same set if target element not found or if set was empty.
   *
   * @param n element to be removed from a set
   * @return a new set with the same elements or with target element removed
   */
  ISet remove(T n);

  /**
   * Returns the size of the set.
   * @return the number of elements in the set
   */
  Integer size();

  boolean equals(Object obj);

  String toString();

  int hashCode();


}
