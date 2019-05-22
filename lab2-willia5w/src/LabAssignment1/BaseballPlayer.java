package LabAssignment1;

/**
 * Class BaseballPlayer contains information about a baseball player, including athlete's name,
 their team. batting average, and home runs.
 */
public class BaseballPlayer extends Athlete {
  private String team;
  private Double averageBatting;
  private Integer homeRuns;

  /**
   * Creates	a	new	baseball player	given	the	baseball player's	team, batting average, and home runs.
   *
   * @param    team    the	baseball player's	team
   * @param    averageBatting    the	baseball player's	batting average
   * @param    homeRuns    the	baseball player's	home runs
   */
  public BaseballPlayer(Name athletesName, Double height, Double weight, String league, String team, Double averageBatting, Integer homeRuns) {
    super(athletesName, height, weight, league);
    this.team = team;
    this.averageBatting = averageBatting;
    this.homeRuns = homeRuns;
  }

  /**
   * @return the player's team
   */
  public String getTeam() {
    return team;
  }

  /**
   * @return batting average
   */
  public Double getAverageBatting() {
    return averageBatting;
  }

  /**
   * @return number of home runs
   */
  public Integer getHomeRuns() {
    return homeRuns;
  }
}
