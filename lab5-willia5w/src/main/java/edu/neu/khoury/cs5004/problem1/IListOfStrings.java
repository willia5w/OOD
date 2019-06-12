package edu.neu.khoury.cs5004.problem1;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;


public interface IListOfStrings {

  /**
   * This List of Strings does the following:
   *
   * Determines if the list is empty.
   *
   * Gets the size of the list.
   *
   * Searches for a string in the list.
   *
   * Searches for a group of strings in a list.
   *
   * Checks for duplicates.
   *
   * Eliminates duplicates.
   *
   */

  /**
   * Checks whether or not the list is empty.
   * @return
   */
  Boolean isEmpty();

  /**
   * Gets the total number of elements in the list
   * @return
   */
   Integer size(List <String>);

  /**
   * Consumes a String, and checks if the String is in the list or not.
   * @return
   */
  Boolean contains(String);

  /**
   * Consumes another list of Strings, and checks that all elements
   * of this list are in the list passed as argument.
   * @return
   */
  Boolean containsAll(String);

  /**
   * takes the maximum String length, and returns a list
   * with all elements whose length is greater than the maximum length removed.
   */
  ArrayList filterLargerThan(Integer stringLength);

  /**
   * Check if the list has at least one duplicate element.
   * @return
   */
  Boolean hasDuplicates(String);

  /**
   * Returns the list with all duplicates removed.
   * @return
   */
  ArrayList removeDuplicates(ArrayList checkList);

  /**
   * Test is 2 objects are equal:
   * --Use abstractFactory and create a (AbstractClass)TestObject class in Test folder.
   * with "wrongVariable" for each variable for full coverage
   * of equals Test.
   * Reflexive
   * Transitive
   *
   * @param o
   * @return
   */
  boolean equals(Object o);
}
