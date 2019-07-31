package edu.neu.khoury.cs5004.problem2;

import java.util.Objects;

/**
 * Represents a person' full name.
 */
public class Name {
  private String firstName;
  private String lastName;

  /**
   * Creates a name given both parts.
   *
   * @param firstName the first name
   * @param lastName the last name
   */
  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * Get the first name.
   *
   * @return the first name
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Get the last name.
   *
   * @return the last name
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * Get the full name of the person.
   *
   * @return the full name of the person
   */
  public String getFullName() {
    return this.getFirstName()
        + " " + this.getLastName();
  }

  /**
   * A String representation of a name.
   * @return a String representation of a name
   */
  @Override
  public String toString() {
    return "Name{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }

  /**
   * Compares one name against another to check for equality.
   * @param o another name
   * @return true if equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Name)) return false;
    Name name = (Name) o;
    return Objects.equals(getFirstName(), name.getFirstName()) &&
        Objects.equals(getLastName(), name.getLastName());
  }

  /**
   * Get the int representation of this name.
   * @return int representation of this name
   */
  @Override
  public int hashCode() {
    return Objects.hash(getFirstName(), getLastName());
  }
}