import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AuthorTest {
    private Author author;
    private Person person;
    private Email email;
    private Address address;

    @Before
    public void setUp() throws Exception	{
        person = new Person("Dan", "Williams");
        email = new Email("dmwinnj", "aol.com");
        address = new Address("1287", "Westlake Ave",
                "Seattle", "WA", "98109",
                "USA");

        author = new Author(person, email, address);
    }
    @Test
    public void getName() {
        assertEquals("Dan Williams", author.getName());
    }
    @Test
    public void getEmail() throws Exception	{
        assertEquals("dmwinnj@aol.com", author.getEmail());
    }
    @Test
    public void getAddress() throws Exception	{
        assertEquals("1287 Westlake Ave Seattle WA 98109 USA", author.getAddress());
    }
}