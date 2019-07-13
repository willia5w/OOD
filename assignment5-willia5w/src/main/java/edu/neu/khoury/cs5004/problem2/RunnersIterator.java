package edu.neu.khoury.cs5004.problem2;

import edu.neu.khoury.cs5004.problem1.Runner;

import java.util.*;

/**
 * Iterator for ArrayList of Runners.
 */
public class RunnersIterator implements Iterator {
  private Stack <Runner> runnerStack;

  /**
   * Iterates through runners in the list, qualifying throughout.
   * @param runnerList A list of runners
   */
  public RunnersIterator(ArrayList<Runner> runnerList) {
    for (int i = 0; i < runnerList.size(); i++) {
      Runner currentRunner = runnerList.get(i);
      qualified(currentRunner);
    }
  }

  /**
   * Get the current stack of Runners.
   * @return  current runner stack
   */
  public Stack <Runner> getRunnerStack() {
    return runnerStack;
  }

  /**
   * Pushes runners to the stack if they are sufficiently experienced with 5K runs.
   * Must also have half marathon race time under 100.00 minutes.
   * @param runner A runner from the list of runners
   */
  public void qualified(Runner runner) {
    int fastestHalfMarathon = runner.getHalfMarathonTimes().indexOf(Collections.min(runner.getHalfMarathonTimes()));
    if (runner.getFiveKRaceTimes().size() > 4 && fastestHalfMarathon < 100) {
      runnerStack.push(runner);
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
    return !runnerStack.isEmpty();
  }

  /**
   * Returns the next element in the iteration.
   *
   * @return the next element in the iteration
   * @throws NoSuchElementException if the iteration has no more elements
   */
  @Override
  public Object next() {
    if (!hasNext()) {
      throw new NoSuchElementException("No more qualified runners");
    }

    Runner nextRunner = runnerStack.pop();
    qualified(nextRunner);
    return nextRunner.getName();
  }
}
