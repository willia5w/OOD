package edu.neu.ccs.cs5004.problem1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public abstract class Artist extends Influencer {
  protected String[] awards;
  protected Integer latestWorkYear;
  protected Integer latestWorkIncome;

  public Artist(Name name, LocalDate dateOfBirth, SocialMediaPlatforms[] platforms,
                Integer[] numberOfFollowers, String[] awards, Integer latestWorkYear, Integer latestWorkIncome) {
    super(name, dateOfBirth, platforms, numberOfFollowers);
    this.awards = awards;
    this.latestWorkYear = latestWorkYear;
    this.latestWorkIncome = latestWorkIncome;
  }


  public String[] getAwards() {
    return awards;
  }

  public Integer getLatestWorkYear() {
    return latestWorkYear;
  }

  public Integer getLatestWorkIncome() {
    return latestWorkIncome;
  }

  @Override
  public String toString() {
    return "Artist{" +
        "awards=" + Arrays.toString(awards) +
        ", latestWorkYear=" + latestWorkYear +
        ", latestWorkIncome=" + latestWorkIncome +
        ", name=" + name +
        ", dateOfBirth=" + dateOfBirth +
        ", platforms=" + Arrays.toString(platforms) +
        ", numberOfFollowers=" + Arrays.toString(numberOfFollowers) +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Artist)) return false;
    if (!super.equals(o)) return false;
    Artist artist = (Artist) o;
    return Arrays.equals(getAwards(), artist.getAwards()) &&
        getLatestWorkYear().equals(artist.getLatestWorkYear()) &&
        getLatestWorkIncome().equals(artist.getLatestWorkIncome());
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(super.hashCode(), getLatestWorkYear(), getLatestWorkIncome());
    result = 31 * result + Arrays.hashCode(getAwards());
    return result;
  }
}
