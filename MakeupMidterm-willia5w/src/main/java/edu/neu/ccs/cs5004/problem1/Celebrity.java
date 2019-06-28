package edu.neu.ccs.cs5004.problem1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public abstract class Celebrity extends Influencer {
  protected String latestAppearanceEvent;

  public Celebrity(Name name, LocalDate dateOfBirth, SocialMediaPlatforms[] platforms,
                   Integer[] numberOfFollowers, String latestAppearanceEvent) {
    super(name, dateOfBirth, platforms, numberOfFollowers);
    this.latestAppearanceEvent = latestAppearanceEvent;
  }

  public String getLatestAppearanceEvent() {
    return latestAppearanceEvent;
  }

  @Override
  public String toString() {
    return "Celebrity{" +
        "latestAppearanceEvent='" + latestAppearanceEvent + '\'' +
        ", name=" + name +
        ", dateOfBirth=" + dateOfBirth +
        ", platforms=" + Arrays.toString(platforms) +
        ", numberOfFollowers=" + Arrays.toString(numberOfFollowers) +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Celebrity)) return false;
    if (!super.equals(o)) return false;
    Celebrity celebrity = (Celebrity) o;
    return getLatestAppearanceEvent().equals(celebrity.getLatestAppearanceEvent());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getLatestAppearanceEvent());
  }
}
