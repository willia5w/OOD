package Problem1;

/**
 * This class represents a blueprint for other room objects which all
 * possess a current, max, and min temperature
 */
public abstract class Room {
  protected Integer currentTemp;
  protected Integer maxTemp;
  protected Integer minTemp;

  /**
   * @param currentTemp
   * @param minTemp
   * @param maxTemp
   */
  public Room(Integer currentTemp, Integer minTemp, Integer maxTemp) {
    this.currentTemp = currentTemp;
    this.minTemp = minTemp;
    this.maxTemp = maxTemp;
  }

  /**
   * Get the current temp of the room
   *
   * @return the current temp of the room
   */
  public Integer getCurrentTemp() {
    return currentTemp;
  }

  /**
   * Get the min temp of the room
   *
   * @return the min temp of the room
   */
  public Integer getMinTemp() {
    return minTemp;
  }

  /**
   * Get the max temp of the room
   *
   * @return the max temp of the room
   */
  public Integer getMaxTemp() {
    return maxTemp;
  }
}
