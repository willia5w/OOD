/**
 *	Represents	an	Author	with	their	details--name,	email	and	physical	address
 *
 *	@author	therapon
 *
 */

public class Person {
    private String firstName;
    private String lastName;

    /**
     * Creates	a	new	author	given	the	author's	name,	email	and	address	as	strings.
     *
     * @param    firstName    the	author's	name
     * @param    lastName    the	author's	email	address
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * @return the first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * @return the last name
     */
    public String getLastName() {
        return this.lastName;
    }
}