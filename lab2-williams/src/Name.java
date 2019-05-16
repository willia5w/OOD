/**
 *	Represents	an	Athlete's full name
 *
 */

public class Name {
  private String firstName;
  private String middleName;
  private String lastName;

  /**
   * Creates	a	new	author	given	the	author's	name,	email	and	address	as	strings.
   *
   * @param    firstName    the	athlete's	first name
   * @param    middleName    the	athlete's	middle name
   * @param    lastName    the	athlete's	last name
   */
  public Name(String firstName, String middleName, String lastName) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
  }

  /**
   * @return the first name
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * @return the middle name
   */
  public String getMiddleName() {
    return this.middleName;
  }

  /**
   * @return the last name
   */
  public String getLastName() {
    return this.lastName;
  }
}
