package Problem2;

/**
 *
 *
 * Class Problem2.Time contains information about a time stamp.
 * This class is used as a part of Problem 2.
 */
public class Time {
    private Integer hours;
    private Integer minutes;
    private Integer seconds;

    /**
     * @param hours - Ride hours
     * @param minutes - Ride minutes
     * @param seconds - Ride seconds
     */
    public Time(Integer hours, Integer minutes, Integer seconds) {
        if (hours < 0 || hours > 23 ||
            minutes < 0 || minutes > 59 ||
            seconds < 0 || seconds > 59) {
            System.out.println("ERROR");
        } else {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }
    }

    /**
     * Returns hours portion of time stamp
     * @return hours
     */
    public Integer getHours() {
        return hours;
    }

    /**
     * Returns minutes portion of time stamp
     * @return minutes
     */
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * Returns seconds portion of time stamp
     * @return seconds
     */
    public Integer getSeconds() {
        return seconds;
    }

    /**
     * Returns the difference in time between start and end time stamps.
     * @param startTime
     * @param endTime
     */
    static Time getDuration(Time startTime, Time endTime) {

        Integer carryMinute = 0;
        Integer carryHour = 0;

        Integer elapsedSeconds = endTime.getSeconds() - startTime.getSeconds();
        if (elapsedSeconds < 0) {
            elapsedSeconds = elapsedSeconds + 60;
            carryMinute = 1;
        }
        Integer elapsedMinutes = endTime.getMinutes()
            - startTime.getMinutes()
            + carryMinute;
        if (elapsedMinutes < 0) {
            elapsedMinutes = elapsedMinutes + 60;
            carryHour = 1;
        }
        Integer elapsedHours = endTime.getHours()
            - startTime.getHours()
            + carryHour;
        if (elapsedHours < 0) {
            elapsedHours = elapsedHours + 24;
        }

        Time duration = new Time(elapsedHours, elapsedMinutes, elapsedSeconds);
        return duration;
    }
}
