/**
 *	Represents	an	Author	with	their	details--name,	email	and	physical	address
 *
 *	@author	therapon
 *
 */

public class Author {
    private Person name;
    private Email email;
    private Address address;

    /**
     * Creates	a	new	author	given	the	author's	name,	email	and	address	as	strings.
     *
     * @param    name    the	author's	name
     * @param    email    the	author's	email	address
     * @param    address    the	authors	physical	address
     */
    public Author(Person name, Email email, Address address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name.getFirstName() + " " + this.name.getLastName();
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return this.email.getLoginName() + "@" + this.email.getDomain();
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return this.address.getAddress();
    }
    }