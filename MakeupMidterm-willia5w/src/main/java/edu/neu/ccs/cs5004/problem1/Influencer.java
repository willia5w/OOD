package edu.neu.ccs.cs5004.problem1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public abstract class Influencer implements IInfluencer {
  protected Name name;
  protected LocalDate dateOfBirth;
  protected SocialMediaPlatforms[] platforms;
  protected Integer[] numberOfFollowers;

  public Influencer(Name name, LocalDate dateOfBirth, SocialMediaPlatforms[] platforms, Integer[] numberOfFollowers) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.platforms = platforms;
    this.numberOfFollowers = numberOfFollowers;
  }

  public Name getName() {
    return name;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public SocialMediaPlatforms[] getPlatforms() {
    return platforms;
  }

  public Integer[] getNumberOfFollowers() {
    return numberOfFollowers;
  }

  public Integer getInfluencerAge() {
    LocalDate currentDate = LocalDate.now();
    return currentDate.getYear() - this.dateOfBirth.getYear();
  }

  @Override
  public String toString() {
    return "Influencer{" +
        "name=" + name +
        ", dateOfBirth=" + dateOfBirth +
        ", platforms=" + Arrays.toString(platforms) +
        ", numberOfFollowers=" + Arrays.toString(numberOfFollowers) +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Influencer)) return false;
    Influencer that = (Influencer) o;
    return name.equals(that.name) &&
        dateOfBirth.equals(that.dateOfBirth) &&
        Arrays.equals(platforms, that.platforms) &&
        Arrays.equals(numberOfFollowers, that.numberOfFollowers);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(name, dateOfBirth);
    result = 31 * result + Arrays.hashCode(platforms);
    result = 31 * result + Arrays.hashCode(numberOfFollowers);
    return result;
  }

  public Double estimateInfluence(Influencer influencer) throws ImpactEstimationException {
    Integer numPlatforms = this.platforms.length;
    Double impact = 0.0;
    for (int i = 0; i < numPlatforms; i++) {
      if (i == 0) {
        impact += (this.numberOfFollowers[i] * 0.9); // YouTube platform discount
      } else if (i == 2) {
        impact += (this.numberOfFollowers[i] * 1.6); // Instagram platform bump
      } else {
        impact += this.numberOfFollowers[i];
      }
    }
    Double adjustedImpact = 0.0;
    adjustedImpact = impact / numPlatforms;

    // Platform bump
    if (numPlatforms > 3) {
      adjustedImpact *= 1.6;
    }

    // Impact discount
    if (this.getInfluencerAge() > 40) {
      adjustedImpact *= 0.55;
    }

    // Impact discount
    if (this.getInfluencerAge() < 18) {
      throw new ImpactEstimationException();
    }
    return adjustedImpact;
  }
}
