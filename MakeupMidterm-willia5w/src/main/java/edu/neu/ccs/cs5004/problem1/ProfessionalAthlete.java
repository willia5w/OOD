package edu.neu.ccs.cs5004.problem1;

import java.util.Arrays;
import java.util.Objects;

public abstract class ProfessionalAthlete extends NewInfluencerTypes {
  protected String sport;
  protected String professionalLeague;
  protected Double lastSeasonEarnings;

  public ProfessionalAthlete(String sport, String professionalLeague, Double lastSeasonEarnings) {
    this.sport = sport;
    this.professionalLeague = professionalLeague;
    this.lastSeasonEarnings = lastSeasonEarnings;
  }

  public String getSport() {
    return sport;
  }

  public String getProfessionalLeague() {
    return professionalLeague;
  }

  public Double getLastSeasonEarnings() {
    return lastSeasonEarnings;
  }

  @Override
  public String toString() {
    return "ProfessionalAthlete{" +
        "lastSeasonEarnings=" + lastSeasonEarnings +
        ", name=" + name +
        ", dateOfBirth=" + dateOfBirth +
        ", platforms=" + Arrays.toString(platforms) +
        ", numberOfFollowers=" + Arrays.toString(numberOfFollowers) +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ProfessionalAthlete)) return false;
    if (!super.equals(o)) return false;
    ProfessionalAthlete that = (ProfessionalAthlete) o;
    return getSport().equals(that.getSport()) &&
        getProfessionalLeague().equals(that.getProfessionalLeague()) &&
        getLastSeasonEarnings().equals(that.getLastSeasonEarnings());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getSport(), getProfessionalLeague(), getLastSeasonEarnings());
  }

  @Override
  public Double estimateInfluence(Influencer influencer) throws InfluenceEstimationException {
    Integer numPlatforms = this.platforms.length;
    Double impact = 0.0;

    for (int i = 0; i < numPlatforms; i++) {
        impact += this.numberOfFollowers[i];
    }

    // Inadequate total number of followers
    if (impact < 500000) {
      throw new InfluenceEstimationException();
    } else {
      impact *= .95; // Journalist discount
    }
    return impact;
  }
}
