package edu.neu.khoury.cs5004.problem1;

import java.util.Objects;

/**
 * This class represents a name object.
 */
public class Name {
  private String firstName;
  private String lastName;

  /**
   * Constructs a name object.
   *
   * @param firstName name's first name
   * @param lastName name's last name
   */
  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * Return name's first name.
   *
   * @return name's first name
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Returns name's last name.
   *
   * @return name's last name
   */
  public String getLastName() {
    return lastName;
  }

  @Override
  public String toString() {
    return "Name{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(firstName, name.firstName) &&
        Objects.equals(lastName, name.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName);
  }
}
