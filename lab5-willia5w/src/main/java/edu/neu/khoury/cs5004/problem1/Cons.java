package edu.neu.khoury.cs5004.problem1;

public class Cons implements IListOfStrings {
  public Cons() {
  }

  public Integer getVal() {
  }

  public IListOfStrings removeByIndex(Integer index) throws IllegalArgumentException {
    if (size(Cons) > index + 1) {
      throw IllegalArgumentException("Idex out of range.");
    }
    if (index > 0) {
      return new Cons(val, next.removeByIndex(index - 1));
    }
    return next;
  }

  public IListOfStrings add(Integer) {
    return new Cons(val, this);
  }

  @Override
  public Boolean isEmpty() {
    return false;
  }

  @Override
  public Integer size() {
    return 1 + next.size();
  }

  @Override
  public Boolean contains(String search) {
    return this.val.equals(val) ? true : next.contains(search);
  }

  @Override
  public Boolean containsAll() {
    return null;
  }

  @Override
  public arrList filterLargerThan(Integer stringLength) {
    return null;
  }

  @Override
  public Boolean hasDuplicates() {
    return null;
  }

  @Override
  public arrList removeDuplicates() {
    return null;
  }
}
