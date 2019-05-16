import static org.junit.Assert.*;

public class BaseballPlayerTest {
  private Name athletesName;
  private BaseballPlayer baseballPlayer;

  @org.junit.Before
  public void setUp() throws Exception {
    athletesName = new Name("Dan", "M", "Williams");
    baseballPlayer = new BaseballPlayer(athletesName,  5.75, 155.50,
        "Baseball","Bears", 5.50, 2);
  }

  @org.junit.Test
  public void getTeam() {
    assertEquals("Bears", baseballPlayer.getTeam());
  }

  @org.junit.Test
  public void getAverageBatting() {
    Double battingAverage = 5.50;
    assertEquals(battingAverage, baseballPlayer.getAverageBatting());
  }

  @org.junit.Test
  public void getHomeRuns() {
    Integer runs = 2;
    assertEquals(runs, baseballPlayer.getHomeRuns());
  }
}