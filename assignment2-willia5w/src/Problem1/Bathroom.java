package Problem1;

/**
 * This class represents a bathroom that has a max and min temperature
 * It is an extension of the Room abstract class with concrete temperature limits.
 */
class Bathroom extends Room{
    private Integer currentTemp;
    private static Integer minTemp = 58;
    private static Integer maxTemp = 70;

    /**
     * Constructs a Bathroom object and initializes it with its max and min temperature
     * @param minTemp the min temp of the bathroom
     * @param maxTemp the max temp of the bathroom
     */
    public Bathroom(Integer currentTemp, Integer minTemp, Integer maxTemp) {
        this.currentTemp = currentTemp;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    /**
     * Get the current temp of the bathroom
     * @return the current temp of the bathroom
     */
    public Integer getCurrentTemp() {
        return currentTemp;
    }

    /**
     * Get the min temp of the bathroom
     * @return the min temp of the bathroom
     */
    public Integer getMinTemp() {
        return minTemp;
    }

    /**
     * Get the max temp of the bathroom
     * @return the max temp of the bathroom
     */
    public Integer getMaxTemp() {
        return maxTemp;
    }

    /**
     * Updates current temperature of room if desired temperature is valid
     * @param temperature User's desired bathroom temperature
     * @return A new Bathroom object will be returned with current temperature updated if valid
     */
    public Bathroom validateNewTemp(Integer temperature) throws Exception {
        if (temperature < minTemp || temperature > maxTemp) {
            throw new Exception("Invalid temperature");
        }
        else {
            return new Bathroom(temperature, minTemp, maxTemp);
        }
    }
}
