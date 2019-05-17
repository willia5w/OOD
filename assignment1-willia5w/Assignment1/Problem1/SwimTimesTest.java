package Problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwimTimesTest {
    private SwimTimes swimTimes;

    @Before
    public void setUp() throws Exception {
        swimTimes = new SwimTimes(10.00, 20.00,
            30.00, 40.00);
    }

    @Test
    public void getBestBackstroke50mTime() {
        Double currentTime = 10.00;
        assertEquals(currentTime, swimTimes.getBestBackstroke50mTime());
    }

    @Test
    public void setBestBackstroke50mTime() {
        Double currentTime = 20.00;
        assertEquals(currentTime, swimTimes.setBestBackstroke50mTime(20.00));
    }

    @Test
    public void getBestBreaststroke50mTime() {
        Double currentTime = 20.00;
        assertEquals(currentTime, swimTimes.getBestBreaststroke50mTime());
    }

    @Test
    public void setBestBreaststroke50mTime() {
        Double currentTime = 30.00;
        assertEquals(currentTime, swimTimes.setBestBreaststroke50mTime(30.00));
    }

    @Test
    public void getBestButterfly50mTime() {
        Double currentTime = 30.00;
        assertEquals(currentTime, swimTimes.getBestButterfly50mTime());
    }

    @Test
    public void setBestButterfly50mTime() {
        Double currentTime = 40.00;
        assertEquals(currentTime, swimTimes.setBestButterfly50mTime(40.00));
    }

    @Test
    public void getBestFreestyle50mTime() {
        Double currentTime = 40.00;
        assertEquals(currentTime, swimTimes.getBestFreestyle50mTime());
    }

    @Test
    public void setBestFreestyle50mTime() {
        Double currentTime = 50.00;
        assertEquals(currentTime, swimTimes.setBestFreestyle50mTime(50.00));
    }
}