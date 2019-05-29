package PrototypeVideoGame;

/**
 *	Represents a name for a piece
 *
 */

public class Name {
    private String firstName;
    private String lastName;

    /**
     * Creates	a	name given both parts.
     *
     * @param    firstName    the	first name
     * @param    lastName    the last name
     */
    public Name(String firstName, String lastName) {
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

    /**
     * Get the full name of the person
     * @return the full name of the person
     */
    public String getFullName() {
        return this.getFirstName()
            + " " + this.getLastName();
    }
}