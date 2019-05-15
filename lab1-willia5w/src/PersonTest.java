import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    private Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person("Dan", "Williams");
    }

    @Test
    public void getFirstName() {
        assertEquals("Dan", person.getFirstName());
    }

    @Test
    public void getLastName() {
        assertEquals("Williams", person.getLastName());
    }
}