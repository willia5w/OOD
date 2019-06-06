package edu.neu.khoury.cs5004.problem1;

public class Empty implements IListOfStrings {

  public Empty() {
  }
  // WILL BEHAVE DIFFERENTLY THAN CONS,
  // Override methods accordingly

  @Override
  public Boolean isEmpty() {
    return null;
  }

  @Override
  public Integer size() {
    return null;
  }

  @Override
  public Boolean contains() {
    return false;
  }

  @Override
  public Boolean containsAll() {
    return false;
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
