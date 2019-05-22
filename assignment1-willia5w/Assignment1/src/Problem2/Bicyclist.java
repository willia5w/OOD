package Problem2;

/**
 *
 *
 * Class Problem2.Bicyclist contains information about a cyclist.
 * This class is used as a part of Problem 2.
 **/

public class Bicyclist {
  private String name;
  private String team;
  private Time startTime;
  private Time endTime;

  /**
   * Constructor that creates a new Problem1.Swimmer object with the
   * specified first name, last name and best backstroke time.
   *
   * @param name            - cyclist's first name
   * @param team              - cyclist's team
   * @param startTime             - cyclist's start time
   * @param endTime             - cyclist's start time
   *
   **/
  public Bicyclist(String name, String team, Time startTime, Time endTime) {
    this.name = name;
    this.team = team;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  /**
   * Returns the cyclist's first name
   * /@return - cyclist's first name
   **/
  public String getName() {
    return name;
  }

  /**
   * Returns the cyclist's team
   * /@return - cyclist's team
   **/
  public String getTeam() {
    return team;
  }

  /**
   * Returns the cyclist's start time
   * /@return - cyclist's start time
   **/
  public Time getStartTime() {
    return startTime;
  }

  /**
   * Returns the cyclist's end time
   * /@return - cyclist's end time
   **/
  public Time getEndTime() {
    return endTime;
  }

  /**
   * Returns the cyclist's ride duration
   * /@return - cyclist's ride duration
   **/
  public Time getDuration() {
    Time start = getStartTime();
    Time end = getEndTime();
    return Time.getDuration(start, end);
  }
}
