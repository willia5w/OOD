package edu.neu.ccs.cs5004.problem1;

public interface IBagOfWords {

  /**
   * A BagOfWords can be a :
   *
   * - TedBag
   * - Empty
   *
   * A TedBag has a:
   *
   * - String val
   * - IBagOfWords next
   *
   */

  /**
   * Returns an empty bag of words.
   * @return an empty bag of words
   */
  IBagOfWords emptyBagOfWords();
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
