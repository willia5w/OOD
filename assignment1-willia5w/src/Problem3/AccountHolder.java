package Problem3;

/**
 *	Represents	an	Account Holder	with	their	name.
 *
 */

public class AccountHolder {
  private String firstName;
  private String lastName;

  /**
   * Creates	an Account Holder based on first and last name.
   *
   * @param    firstName    the	author's	name
   * @param    lastName    the	author's	email	address
   */
  public AccountHolder(String firstName, String lastName) {
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