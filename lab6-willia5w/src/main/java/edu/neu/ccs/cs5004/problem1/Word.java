package edu.neu.ccs.cs5004.problem1;

public class Word implements IBagOfWords {
  private String val;
  private IBagOfWords next;

  public Word(String val, IBagOfWords next) {
    this.val = val;
    this.next = next;
  }

  public String getVal() {
    return val;
  }

  public IBagOfWords getNext() {
    return next;
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
    return new Word(val, this);
  }

  @Override
  Boolean contains(String s) {
//    if (val.equals(s)) {
//      return true;
//    } else {
//      return next.contains(s);
//    }
    return s.equals(val) ? true : next.contains(s);
  }
}
