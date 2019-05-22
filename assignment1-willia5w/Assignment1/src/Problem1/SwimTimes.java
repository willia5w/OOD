package Problem1;

/**
 *
 *
 * Class Problem1.SwimTimes contains information about a swimmer's times.
 * This class is used as a part of Problem 1.
 **/
public class SwimTimes {
    private Double bestBackstroke50mTime;
    private Double bestBreaststroke50mTime;
    private Double bestButterfly50mTime;
    private Double bestFreestyle50mTime;


    /**
     * Constructor that creates a new Problem1.SwimmerTimes object with the
     * specified times for swim styles.
     *
     * @param bestBackstroke50mTime - best 50m backstroke time
     * @param bestBreaststroke50mTime - best 50m breaststroke time
     * @param bestButterfly50mTime - best 50m butterfly time
     * @param bestFreestyle50mTime - best 50m freestyle time
     **/
    public SwimTimes(Double bestBackstroke50mTime, Double bestBreaststroke50mTime,
                     Double bestButterfly50mTime, Double bestFreestyle50mTime) {
        this.bestBackstroke50mTime = bestBackstroke50mTime;
        this.bestBreaststroke50mTime = bestBreaststroke50mTime;
        this.bestButterfly50mTime = bestButterfly50mTime;
        this.bestFreestyle50mTime = bestFreestyle50mTime;
    }

    /**
     * Returns the swimmer's best backstroke time
     * /@return - swimmer's best backstroke time
     **/
    public Double getBestBackstroke50mTime() {
        return this.bestBackstroke50mTime;
    }

    /**
     * Sets the swimmer's best backstroke time
     * /@param time - swimmer's best backstroke time
     **/
    public Double setBestBackstroke50mTime(Double time) {
        return this.bestBackstroke50mTime = time;
    }

    /**
     * Returns the swimmer's best breaststroke time
     * /@return - swimmer's best breaststroke time
     **/
    public Double getBestBreaststroke50mTime() {
        return this.bestBreaststroke50mTime;
    }

    /**
     * Sets the swimmer's best breaststroke time
     * /@param time - swimmer's best breaststroke time
     **/
    public Double setBestBreaststroke50mTime(Double time) {
        return this.bestBreaststroke50mTime = time;
    }

    /**
     * Returns the swimmer's best butterfly time
     * /@return - swimmer's best butterfly time
     **/
    public Double getBestButterfly50mTime() {
        return this.bestButterfly50mTime;
    }

    /**
     * Sets the swimmer's best butterfly time
     * /@param time - swimmer's butterfly time
     **/
    public Double setBestButterfly50mTime(Double time) {
        return this.bestButterfly50mTime = time;
    }

    /**
     * Returns the swimmer's best freestyle time
     * /@return - swimmer's best freestyle time
     **/
    public Double getBestFreestyle50mTime() {
        return this.bestFreestyle50mTime;
    }

    /**
     * Sets the swimmer's best freestyle time
     * /@param time - swimmer's best freestyle time
     **/
    public Double setBestFreestyle50mTime(Double time) {
        return this.bestFreestyle50mTime = time;
    }
}
