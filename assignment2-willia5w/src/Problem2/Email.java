package Problem2;

/**
 *	Represents	an email address with a login name and domain
 *
 *
 */

public class Email {
    private String loginName;
    private String domain;

    /**
     * Creates an Email object composed of a login name and domain
     *
     * @param  loginName  the	person's	login name
     * @param  domain  the	person's	login name
     */
    public Email(String loginName, String domain) {
        this.loginName = loginName;
        this.domain = domain;
    }
    /**
     * Get the person's login name
     * @return the person's login name
     */
    public String getLoginName() {
        return this.loginName;
    }
    /**
     * Get the person's email domai
     * @return the person's email domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * Get the full email address
     * @return the full email address
     */
    public String getEmail() {
        return this.getLoginName()
            + "@" + this.getDomain();
    }
}