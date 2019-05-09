import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    private Person person;

    @org.junit.Before
    public void setUp() throws Exception {
        person = new Person("Dan", "Williams");
    }

    @org.junit.Test
    public void getFirstName() {
        assertEquals("Dan", person.getFirstName());
    }

    @org.junit.Test
    public void getLastName() {
        assertEquals("Williams", person.getLastName());
    }
}