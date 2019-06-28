package edu.neu.ccs.cs5004.problem1;

import java.util.Arrays;
import java.util.Objects;

public abstract class Journalist extends  NewInfluencerTypes {
  protected String publishingCompany;
  protected String[] journalisticAwards;

  public Journalist(String publishingCompany, String[] journalisticAwards) {
    this.publishingCompany = publishingCompany;
    this.journalisticAwards = journalisticAwards;
  }

  public String getPublishingCompany() {
    return publishingCompany;
  }

  public String[] getJournalisticAwards() {
    return journalisticAwards;
  }

  @Override
  public String toString() {
    return "Journalist{" +
        "publishingCompany='" + publishingCompany + '\'' +
        ", journalisticAwards=" + Arrays.toString(journalisticAwards) +
        ", name=" + name +
        ", dateOfBirth=" + dateOfBirth +
        ", platforms=" + Arrays.toString(platforms) +
        ", numberOfFollowers=" + Arrays.toString(numberOfFollowers) +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Journalist)) return false;
    if (!super.equals(o)) return false;
    Journalist that = (Journalist) o;
    return getPublishingCompany().equals(that.getPublishingCompany()) &&
        Arrays.equals(getJournalisticAwards(), that.getJournalisticAwards());
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(super.hashCode(), getPublishingCompany());
    result = 31 * result + Arrays.hashCode(getJournalisticAwards());
    return result;
  }

  @Override
  public Double estimateInfluence(Influencer influencer) throws InfluenceEstimationException {
    Integer numPlatforms = this.platforms.length;
    Double impact = 0.0;
    Integer twitterFlag = 0;

    for (int i = 0; i < numPlatforms; i++) {
      if (i == 3 && this.numberOfFollowers[i] > 100000) {
        twitterFlag = 1;
      } else {
        impact += this.numberOfFollowers[i];
      }
    }

    // Inadequate total number of followers
    if (impact < 500000) {
      throw new InfluenceEstimationException();
    } else {
      impact *= .85; // Journalist discount
    }

    if (twitterFlag == 1) {
      impact *= 1.25;
    }
    return impact;
  }
}
