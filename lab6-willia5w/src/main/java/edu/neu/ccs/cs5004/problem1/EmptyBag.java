package edu.neu.ccs.cs5004.problem1;

public class EmptyBag implements IBagOfWords {

  /**
   * Creates an empty BagOfWords
   * @return BagOfWords
   */
  public IBagOfWords emptyBagOfWords() {
      return new EmptyBag();
  }

  @Override
  public Boolean isEmpty() {
    return true;
  }

  @Override
  public Integer size() {
    return 0;
  }

  @Override
  public IBagOfWords add(String s) {
    return new TedBag(s, null);
  }

  @Override
  public  Boolean contains(String s) {
    return false;
  }
}
