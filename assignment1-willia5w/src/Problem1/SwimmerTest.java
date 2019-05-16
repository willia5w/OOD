import static org.junit.Assert.*;

public class SwimmerTest {
    private Swimmer swimmer;
    private String firstName;
    private String lastName;
    private Double bestBackstroke50mTime;

    @org.junit.Before
    public void setUp() throws Exception {
        swimmer = new Swimmer("Dan", "Williams", 60.00);
    }

    @org.junit.Test
    public void getFirstName() {
        assertEquals("Dan", swimmer.getFirstName());
    }

    @org.junit.Test
    public void getLastName() {
        assertEquals("Williams", swimmer.getLastName());
    }

    @org.junit.Test
    public void getBestBackstroke50mTime() {
        Double currentTime = 60.00;
        assertEquals(currentTime, swimmer.getBestBackstroke50mTime());
    }

    @org.junit.Test
    public void setBestBackstroke50mTime() {
        Double newTime = 60.00;
        assertEquals(newTime, swimmer.setBestBackstroke50mTime(newTime));
    }


}