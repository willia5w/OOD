package edu.neu.ccs.cs5004.problem1;

public class EmptyBag implements IBagOfWords {

  /**
   * Creates an empty BagOfWords
   * @return BagOfWords
   */
  private IBagOfWords emptyBagOfWords() {

  }


  @Override
  Boolean isEmpty() {
    return false;
  }

  @Override
  Integer size() {
    return 0;
  }

  @Override
  IBagOfWords add(String s) {
    return new Word(s, null);
  }

  @Override
  Boolean contains(String s) {
    return false;
  }
}
