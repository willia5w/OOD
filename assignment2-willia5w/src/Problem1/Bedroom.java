package Problem1;

/**
 * This class represents a bedroom that has a max and min temperature
 * It is an extension of the Room abstract class with concrete temperature limits.
 */
class Bedroom extends Room{
    private static Integer min = 60;
    private static Integer max = 68;


    public Bedroom(Integer currentTemp, Integer minTemp, Integer maxTemp) {
        super(currentTemp, minTemp, maxTemp);
        this.minTemp = min;
        this.maxTemp = max;
    }

    /**
     * Get the current temp of the bedroom
     * @return the current temp of the bedroom
     */
    public Integer getCurrentTemp() {
        return currentTemp;
    }

    /**
     * Get the min temp of the bedroom
     * @return the min temp of the bedroom
     */
    public Integer getMinTemp() {
        return minTemp;
    }

    /**
     * Get the max temp of the bedroom
     * @return the max temp of the bedroom
     */
    public Integer getMaxTemp() {
        return maxTemp;
    }

    /**
     * Updates current temperature of bedroom if desired temperature is valid
     * @param temperature User's desired bedroom temperature
     * @return A new Bedroom object will be returned with current temperature updated if valid
     */
    public Bedroom validateNewTemp(Integer temperature) throws Exception {
        if (temperature < minTemp || temperature > maxTemp) {
            throw new Exception("Invalid temperature");
        }
        else {
            return new Bedroom(temperature, minTemp, maxTemp);
        }
    }
}
