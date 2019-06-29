package edu.neu.ccs.cs5004.problem1;

import java.time.LocalDate;

public abstract class NewInfluencerTypes extends Influencer {

  public NewInfluencerTypes(Name name, LocalDate dateOfBirth, SocialMediaPlatforms[] platforms, Integer[] numberOfFollowers) {
    super(name, dateOfBirth, platforms, numberOfFollowers);
  }

  public Double estimateInfluence(Influencer influencer) throws InfluenceEstimationException {
    Integer numPlatforms = this.platforms.length;
    Double impact = 0.0;
    for (int i = 0; i < numPlatforms; i++) {
        impact += this.numberOfFollowers[i];
    }

    // Inadequate total number of followers
    if (impact < 500000) {
      throw new InfluenceEstimationException();
    }
    return impact;
  }

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
