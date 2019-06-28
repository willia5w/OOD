package edu.neu.ccs.cs5004.problem1;

public interface IInfluencer {

  /**
   * Calculates and returns the estimated influence of an Influencer.
   *
   * @param influencer influcencer to be analyzed for influence
   * @return influence of the influencer
   */
  Double estimateInfluence(Influencer influencer) throws ImpactEstimationException;

  String toString();

  boolean equals(Object o);

  int hashCode();

}
