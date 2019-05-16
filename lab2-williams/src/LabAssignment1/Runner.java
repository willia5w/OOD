package LabAssignment1;

/**
* Class Runner contains information about a runner, including athlete's name,
their best 5K time, best marathon time, and favorite event type.
*/
public class Runner extends Athlete {
  private Double best5kTime;
  private Double bestHalfMarathonTime;
  private String favoriteRunningEvent;

  /**
   * Creates	a	new	runner	given	the	runner's	5K time, marathon time, and favorite event.
   *
   * @param    best5kTime    the	runner's	5K time
   * @param    bestHalfMarathonTime    the	runner's	marathon time
   * @param    favoriteRunningEvent    the	runner's	favorite event
   */

  public Runner(Name athletesName, Double height, Double weight, String league, Double best5kTime,
      Double bestHalfMarathonTime,
      String favoriteRunningEvent) {
    super(athletesName, height, weight, league);
    this.best5kTime = best5kTime;
    this.bestHalfMarathonTime = bestHalfMarathonTime;
    this.favoriteRunningEvent = favoriteRunningEvent;
  }

  /**
   * @return the best 5K time
   */
  public Double getBest5kTime() {
    return best5kTime;
  }

  /**
   * @return the best marathon time
   */
  public Double getBestHalfMarathonTime() {
    return bestHalfMarathonTime;
  }

  /**
   * @return the favorite event
   */
  public String getFavoriteRunningEvent() {
    return favoriteRunningEvent;
  }
}
