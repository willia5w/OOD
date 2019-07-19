package edu.neu.khoury.cs5004.problem2;

import java.util.List;

/**
 * Represents a Swimmer given their name and various race times.
 */
public class Swimmer implements Comparable<Swimmer> {
  private String name;
  private List<Double> butterfly50mTimes;
  private List<Double> backstroke50mTimes;
  private List<Double> breaststroke50mTimes;
  private List<Double> freestyle50mTimes;


  /**
   * Constructor for the Swimmer class.
   *
   * @param name swimmer name
   * @param butterfly50mTimes the swimmer's butterfly times
   * @param backstroke50mTimes the swimmer's back stroke times
   * @param breaststroke50mTimes the swimmer's breast stroke times
   * @param freestyle50mTimes the swimmer's freestyle times
   */
  public Swimmer(String name, List<Double> butterfly50mTimes, List<Double> backstroke50mTimes,
                 List<Double> breaststroke50mTimes, List<Double> freestyle50mTimes) {
    this.name = name;
    this.butterfly50mTimes = butterfly50mTimes;
    this.backstroke50mTimes = backstroke50mTimes;
    this.breaststroke50mTimes = breaststroke50mTimes;
    this.freestyle50mTimes = freestyle50mTimes;
  }

  /**
   * Get the swimmer's name.
   * @return the swimmer's name
   */
  public String getName() {
    return name;
  }

  /**
   * Get the swimmer's butterfly times.
   * @return the swimmer's butterfly times
   */
  public List<Double> getButterfly50mTimes() {
    return butterfly50mTimes;
  }

  /**
   * Get the swimmer's back stroke times.
   * @return the swimmer's back stroke times
   */
  public List<Double> getBackstroke50mTimes() {
    return backstroke50mTimes;
  }

  /**
   * Get the swimmer's breast stroke times.
   * @return the swimmer's breast stroke times
   */
  public List<Double> getBreaststroke50mTimes() {
    return breaststroke50mTimes;
  }

  /**
   * Get the swimmer's freestyle times.
   * @return the swimmer's freestyle times
   */
  public List<Double> getFreestyle50mTimes() {
    return freestyle50mTimes;
  }

  /**
   * Compares two Swimmer objects based on their average freestyle times.
   * @param otherSwimmer another Swimmer for comparison
   * @return negative if less than (preferred), zero if equal, positive if greater than
   */
  @Override
  public int compareTo(Swimmer otherSwimmer) {
    Double thisSwimmerFreestyleTotal = this.freestyle50mTimes.stream().mapToDouble(Double::doubleValue).sum();
    Double thisSwimmerFreestyleAvg = thisSwimmerFreestyleTotal/this.freestyle50mTimes.size();

    Double otherSwimmerFreestyleTotal = otherSwimmer.getFreestyle50mTimes().stream().mapToDouble(Double::doubleValue).sum();
    Double otherSwimmerFreestyleAvg = otherSwimmerFreestyleTotal/otherSwimmer.getFreestyle50mTimes().size();

    if (thisSwimmerFreestyleAvg.equals(otherSwimmerFreestyleAvg)) {
      return 0;
    } else if (thisSwimmerFreestyleAvg > otherSwimmerFreestyleAvg) {
      return 1;
    } else {
      return -1;
    }
  }
}
