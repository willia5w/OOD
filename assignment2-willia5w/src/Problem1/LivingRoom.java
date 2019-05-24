package Problem1;

/**
 * This class represents a bathroom that has a max and min temperature
 * It is an extension of the Room abstract class with concrete temperature limits.
 */
class LivingRoom extends Room {
    private static Integer min = 60;
    private static Integer max = 72;

    /**
     * Constructs a Bathroom object and initializes it with its max and min temperature
     *
     * @param minTemp the min temp of the bathroom
     * @param maxTemp the max temp of the bathroom
     */
    public LivingRoom(Integer currentTemp, Integer minTemp, Integer maxTemp) {
        super(currentTemp, minTemp, maxTemp);
        this.minTemp = min;
        this.maxTemp = max;
    }

    /**
     * Get the current temp of the living room
     *
     * @return the current temp of the living room
     */
    public Integer getCurrentTemp() {
        return currentTemp;
    }

    /**
     * Get the min temp of the living room
     *
     * @return the min temp of the living room
     */
    public Integer getMinTemp() {
        return minTemp;
    }

    /**
     * Get the max temp of the living room
     *
     * @return the max temp of the living room
     */
    public Integer getMaxTemp() {
        return maxTemp;
    }

    /**
     * Updates current temperature of room if desired temperature is valid
     *
     * @param temperature User's desired living room temperature
     * @return A new LivingRoom object will be returned with current temperature updated if valid
     */
    public LivingRoom validateNewTemp(Integer temperature) throws Exception {
        if (temperature < minTemp || temperature > maxTemp) {
            throw new Exception("Invalid temperature");
        }
        else {
            return new LivingRoom(temperature, minTemp, maxTemp);
        }
    }
}


