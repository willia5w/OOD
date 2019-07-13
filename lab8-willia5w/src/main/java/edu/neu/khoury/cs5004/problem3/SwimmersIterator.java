package edu.neu.khoury.cs5004.problem3;

// Iterates over a list of swimmer
// Returns swimmers who have at least 5 butterfly swim times
// & have achieved at least one 50 m Olympic freestyle qualifying time (26.17s)
import java.util.ArrayList;
import java.util.Iterator;

import Swimmer;
public class SwimmersIterator extends Iterator {

  List<Swimmer> swimmers = new ArrayList<>();

  private getQualifiedSwimmers(ArrayList list) ;

  /**
   * Returns {@code true} if the iteration has more elements.
   * (In other words, returns {@code true} if {@link #next} would
   * return an element rather than throwing an exception.)
   *
   * @return {@code true} if the iteration has more elements
   */
  @Override
  public boolean hasNext() {
    return false;
  }

  /**
   * Returns the next element in the iteration.
   *
   * @return the next element in the iteration
   * @throws NoSuchElementException if the iteration has no more elements
   */
  @Override
  public Object next() {
    return null;
  }
}
