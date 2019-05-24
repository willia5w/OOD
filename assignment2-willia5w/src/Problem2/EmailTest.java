package Problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailTest {
    private Email email;

    @Before
    public void setUp() throws Exception {
        email = new Email("dmwinnj", "aol.com");
    }

    @Test
    public void getLoginName() {
        assertEquals("dmwinnj", email.getLoginName());
    }

    @Test
    public void getDomain() {
        assertEquals("aol.com", email.getDomain());
    }

    @Test
    public void getEmail() {
        assertEquals("dmwinnj@aol.com", email.getEmail());
    }
}
