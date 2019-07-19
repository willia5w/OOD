package edu.neu.khoury.cs5004.problem3;

import java.util.*;

import edu.neu.khoury.cs5004.problem2.Swimmer;

/**
 * Iterator for ArrayList of Swimmers.
 */
public class SwimmersIterator implements Iterator {
  private Stack <Swimmer> swimmerStack;

  /**
   * Iterates through swimmers in the list, qualifying throughout.
   * @param swimmerList A list of swimmers
   */
  public SwimmersIterator(ArrayList<Swimmer> swimmerList) {
    for (int i = 0; i < swimmerList.size(); i++) {
      Swimmer currentSwimmer = swimmerList.get(i);
      qualified(currentSwimmer);
    }
  }

  /**
   * Get the current stack of Swimmers.
   * @return  current swimmer stack
   */
  public Stack <Swimmer> getSwimmerStack() {
    return swimmerStack;
  }

  /**
   * Pushes swimmers to the stack if they are sufficiently experienced with butterfly races.
   * Must also have freestyle time under 26.17 minutes.
   * @param swimmer A swimmer from the list of swimmers
   */
  public void qualified(Swimmer swimmer) {
    int fastestFreestyle = swimmer.getFreestyle50mTimes().indexOf(Collections.min(swimmer.getFreestyle50mTimes()));
    if (swimmer.getButterfly50mTimes().size() > 4 && fastestFreestyle < 26.17) {
      swimmerStack.push(swimmer);
    }
  }

  /**
   * Returns {@code true} if the iteration has more elements.
   * (In other words, returns {@code true} if {@link #next} would
   * return an element rather than throwing an exception.)
   *
   * @return {@code true} if the iteration has more elements
   */
  @Override
  public boolean hasNext() {
    return !swimmerStack.isEmpty();
  }

  /**
   * Returns the next element in the iteration.
   *
   * @return the next element in the iteration
   * @throws NoSuchElementException if the iteration has no more elements
   */
  @Override
  public Object next() throws NoSuchElementException {
    if (!hasNext()) {
      throw new NoSuchElementException("No more qualified swimmers");
    }

    Swimmer nextSwimmer = swimmerStack.pop();
    qualified(nextSwimmer);
    return nextSwimmer.getName();
  }
}
