package edu.neu.ccs.cs5004.problem1;

public class IBagOfWords {

  /**
   * A BagOfWords can be a :
   *
   * - Word
   * - Empty
   *
   * A Word has a:
   *
   * - String val
   * - IBagOfWords next
   *
   */

  static IBagOfWords emptyBagOfWords() {
    return new EmptyBag();
  }
  /**
   * Returns true if called on an empty BagOfWords with no tedBag
   * @return true or false
   */
  Boolean isEmpty();

  /**
   * Returns number of elements in the bag of words
   * @return number of elements in the bag of words
   */
  Integer size();

  /**
   * @param s string
   * @return new BagOfWords with previous elements and new element
   */
  IBagOfWords add(String s);

  /**
   * Returns true only if the element in question is within the BagOfWords
   * @param s
   * @return true or false
   */
  Boolean contains(String s);


}
