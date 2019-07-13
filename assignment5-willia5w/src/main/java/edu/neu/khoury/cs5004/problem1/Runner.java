package edu.neu.khoury.cs5004.problem1;
import java.util.List;

/**
 * Represents a Runner with their name and various race times.
 */
public class Runner implements Comparable<Runner>{
  private String name;
  private List<Double> fiveKRaceTimes;
  private List<Double> tenKRaceTimes;
  private List<Double> halfMarathonTimes;
  public Runner(String name, List<Double> fiveKRaceTimes,
                List<Double> tenKRaceTimes,
                List<Double> halfMarathonTimes) {
    this.name = name;
    this.fiveKRaceTimes = fiveKRaceTimes;
    this.tenKRaceTimes = tenKRaceTimes;
    this.halfMarathonTimes = halfMarathonTimes;
  }

  /**
   * Get the runner's name.
   * @return Runner's name
   */
  public String getName() {
    return name;
  }

  /**
   * Get the runner's 5k race times.
   * @return list of 5k race times
   */
  public List<Double> getFiveKRaceTimes() {
    return fiveKRaceTimes;
  }

  /**
   * Get the runner's 10k race times.
   * @return list of 10k race times
   */
  public List<Double> getTenKRaceTimes() {
    return tenKRaceTimes;
  }

  /**
   * Get the runner's half marathon race times.
   * @return list of half marathon race times
   */
  public List<Double> getHalfMarathonTimes() {
    return halfMarathonTimes;
  }

  /**
   * Compares two Runner objects based on their average 5k race times.
   * @param otherRunner another Runner for comparison
   * @return negative if less than (preferred), zero if equal, positive if greater than
   */
  @Override
  public int compareTo(Runner otherRunner) {
    Double thisRunner5kTotal = this.fiveKRaceTimes.stream().mapToDouble(Double::doubleValue).sum();
    Double thisRunner5kAvg = thisRunner5kTotal/this.fiveKRaceTimes.size();

    Double otherRunner5kTotal = otherRunner.getFiveKRaceTimes().stream().mapToDouble(Double::doubleValue).sum();
    Double otherRunner5kAvg = otherRunner5kTotal/otherRunner.getFiveKRaceTimes().size();

    if (thisRunner5kAvg.equals(otherRunner5kAvg)) {
      return 0;
    } else if (thisRunner5kAvg > otherRunner5kAvg) {
      return 1;
    } else {
      return -1;
    }
  }
}
