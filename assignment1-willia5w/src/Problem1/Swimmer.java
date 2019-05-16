
/**
 *
 *
 * Class Swimmer contains information about a swimmer.
 * This class is used as a part of Problem 1.
 **/

public class Swimmer {
    private String firstName;
    private String lastName;
    private Double bestBackstroke50mTime;
    private Double bestBreaststroke50mTime;
    private Double bestButterfly50mTime;
    private Double bestFreestyle50mTime;


    /**
     * Constructor that creates a new Swimmer object with the
     * specified first name, last name and best backstroke time.
     *
     * @param firstName             - swimmer's first name
     * @param lastName              - swimmer's last name
     * @param bestBackstroke50mTime - best 50m backstroke time
     **/
    public Swimmer(String firstName, String lastName, Double
            bestBackstroke50mTime, Double bestBreaststroke50mTime,
                   Double bestButterfly50mTime, Double bestFreestyle50mTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bestBackstroke50mTime = bestBackstroke50mTime;
        this.bestBreaststroke50mTime = bestBreaststroke50mTime;
        this.bestButterfly50mTime = bestButterfly50mTime;
        this.bestFreestyle50mTime = bestFreestyle50mTime;
    }

    /**
     * Returns the swimmer's first name
     * /@return - swimmer's first name
     **/
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Returns the swimmer's last name
     * /@return - swimmer's last name
     **/
    public String getLastName() {
        return this.lastName;
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