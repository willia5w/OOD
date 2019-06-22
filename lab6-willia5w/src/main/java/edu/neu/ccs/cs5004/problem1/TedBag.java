package edu.neu.ccs.cs5004.problem1;

public class TedBag implements IBagOfWords {
  private String val;
  private IBagOfWords next;

  public TedBag(String val, IBagOfWords next) {
    this.val = val;
    this.next = next;
  }

  public String getVal() {
    return val;
  }

  public IBagOfWords getNext() {
    return next;
  }
  public IBagOfWords emptyBagOfWords(){
    return new
  }
  @Override
  Boolean isEmpty() {
    return false;
  }

  @Override
  Integer size() {
    return 1 + next.size();
  }

  @Override
  IBagOfWords add(String s) {
    return new TedBag(val, this);
  }

  @Override
  Boolean contains(String s) {
    return s.equals(val) ? true : next.contains(s);
  }
}
