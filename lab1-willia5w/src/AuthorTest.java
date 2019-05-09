import static org.junit.Assert.*;

import junit.framework.TestCase;

public class AuthorTest {
    private Author author;

    @org.junit.Before
    public void setUp() throws Exception	{
        author = new Author("Dan","dmwinnj","Seattle");
    }
    @org.junit.Test
    public void getName() {
        assertEquals("Dan", author.getName());
//        TestCase.fail("Not	yet	implemented");
    }
    @org.junit.Test
    public void getEmail() throws Exception	{
        assertEquals("dmwinnj", author.getEmail());
//        TestCase.fail("Not	yet	implemented");
    }
    @org.junit.Test
    public void getAddress() throws Exception	{
        assertEquals("Seattle", author.getAddress());
//        TestCase.fail("Not	yet	implemented");
    }
}