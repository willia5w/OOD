/**
 *	Represents	an	Author	with	their	details--name,	email	and	physical	address
 *
 *	@author	therapon
 *
 */

public class Email {
    private String loginName;
    private String domain;

    /**
     * Creates an email
     *
     * @param  loginName  the	author's	login name
     * @param  domain  the	author's	login name
     */
    public Email(String loginName, String domain) {
        this.loginName = loginName;
        this.domain = domain;
    }
    /**
     * @return the    name
     */
    public String getLoginName() {
        return this.loginName;
    }
    /**
     * @return the    email
     */
    public String getDomain() {
        return this.domain;
    }
}