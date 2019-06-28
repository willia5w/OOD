package edu.neu.ccs.cs5004.problem1;

import java.time.LocalDate;

public class ActingProfessional extends Artist {
  public ActingProfessional(Name name, LocalDate dateOfBirth, SocialMediaPlatforms[] platforms,
                            Integer[] numberOfFollowers, String[] awards, Integer latestWorkYear, Integer latestWorkIncome) {
    super(name, dateOfBirth, platforms, numberOfFollowers, awards, latestWorkYear, latestWorkIncome);
  }
}
