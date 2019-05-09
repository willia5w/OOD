/**
 *	Represents	an	Author	with	their	details--name,	email	and	physical	address
 *
 *	@author	therapon
 *
 */

public class Email {
    private String email;

    /**
     * Creates an email
     *
     * @param  email  the	author's	email	address\
     */
    public Email(String loginName, String domain) {
        this.loginName = loginName;
        this.domain = domain;

    }

    /**
     * @return the    name
     */
    public String getLoginName() {
        return this.loginName;;
    }

    /**
     * @return the    email
     */
    public String getDomain() {
        return this.domain;
    }
}