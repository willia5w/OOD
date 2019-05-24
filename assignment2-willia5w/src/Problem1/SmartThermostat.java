package Problem1;

/**
 * This class represents a smart thermostat that
 */
public class SmartThermostat {
    private Bathroom bathroom;
    private Bedroom bedroom;
    private LivingRoom livingRoom;

    /**
     * Creates a SmartThermostat object given a Bathroom, Bedroom, and LivingRoom object
     * @param bathroom A Bathroom object with temperature values
     * @param bedroom A Bedroom object with temperature values
     * @param livingRoom A LavingRoom object with temperature values
     */
    public SmartThermostat(Bathroom bathroom, Bedroom bedroom, LivingRoom livingRoom) {
        this.bathroom = bathroom;
        this.bedroom = bedroom;
        this.livingRoom = livingRoom;
    }

    /**
     * Get current Bathroom object with temperature values
     * @return current Bathroom object with temperature values
     */
    public Bathroom getBathroom() {
        return bathroom;
    }

    /**
     * Get current Bedroom object with temperature values
     * @return current Bedroom object with temperature values
     */
    public Bedroom getBedroom() {
        return bedroom;
    }

    /**
     * Get current LivingRoom object with temperature values
     * @return current LivingRoom object with temperature values
     */
    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    /**
     * Returns new room objects if intended temperature is within
     * the allowed range of each individual room type
     * @param temperature Desired temperature passed as argument
     */
    public SmartThermostat setHouseTemp(Integer temperature) throws Exception {
        try {
            bathroom = bathroom.validateNewTemp(temperature);
            bedroom = bedroom.validateNewTemp(temperature);
            livingRoom = livingRoom.validateNewTemp(temperature);
            return new SmartThermostat(bathroom, bedroom, livingRoom);
        }
        catch (Exception e) {
            System.out.println("Temperature not within limits of one or more rooms");
        }
        throw new Exception("Invalid temperature");
    }
}
