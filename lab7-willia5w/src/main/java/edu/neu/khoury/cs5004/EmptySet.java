package edu.neu.khoury.cs5004;

/**
 * Generic version of the aSet class.
 * @param <T> the type of the value being boxed
 */
public class EmptySet<T> implements ISet{
  private T value;

  public EmptySet(T value) {
    this.value = null;
  }

//  private T t;
//
//  public void set(T t) { this.t = t; }
//  public T get() { return t; }


  /**
   * Returns an empty set.
   *
   * @return an empty set
   */
  @Override
  public ISet emptySet() {
    return new EmptySet(null);
  }

  /**
   * Returns whether or not the set is empty.
   *
   * @return true if empty
   */
  @Override
  public Boolean isEmpty() {
    return true;
  }

  /**
   * Adds an element to a set.
   * <p>
   * Returns a new set containing element n if set was empty.
   * <p>
   * Returns a new set containing element n and elements previously
   * in the set if set was previously non-empty.
   * <p>
   * Returns the same set if element n was already present.
   *
   * @param n element being added into set
   * @return a new set
   */
  @Override
  public aSet add(Object n) {
    aSet newSet = new aSet(n, this);
    return newSet;
  }

  /**
   * Returns true if element contained in set.
   * <p>
   * Returns false if element not contained in set or set is empty.
   *
   * @param n element that user is searching for in the set
   * @return true or false
   */
  @Override
  public Boolean contains(Object n) {
    return false;
  }

  /**
   * Returns a new set with the target element removed if it was contained.
   * <p>
   * Returns the same set if target element not found or if set was empty.
   *
   * @param n element to be removed from a set
   * @return a new set with the same elements or with target element removed
   */
  @Override
  public ISet remove(Object n) {
    return this;
  }

  /**
   * Returns the size of the set.
   *
   * @return the number of elements in the set
   */
  @Override
  public Integer size() {
    return 0;
  }
}
