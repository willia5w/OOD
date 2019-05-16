package Problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwimTimesTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getBestBackstroke50mTime() {
        Double currentTime = 60.00;
        assertEquals(currentTime, swimmer.getBestBackstroke50mTime());
    }

    @Test
    public void setBestBackstroke50mTime() {
    }

    @Test
    public void getBestBreaststroke50mTime() {
    }

    @Test
    public void setBestBreaststroke50mTime() {
    }

    @Test
    public void getBestButterfly50mTime() {
    }

    @Test
    public void setBestButterfly50mTime() {
    }

    @Test
    public void getBestFreestyle50mTime() {
    }

    @Test
    public void setBestFreestyle50mTime() {
    }
}