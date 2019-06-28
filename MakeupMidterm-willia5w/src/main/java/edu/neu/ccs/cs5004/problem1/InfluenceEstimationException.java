package edu.neu.ccs.cs5004.problem1;

public class InfluenceEstimationException extends Exception {

  public InfluenceEstimationException() {
    super("Minimum follower count not met.");
  }
}
