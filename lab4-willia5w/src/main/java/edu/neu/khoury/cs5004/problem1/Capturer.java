package edu.neu.khoury.cs5004.problem1;

/**
 * This class represents Capturer which is a type of Artist that also has an exhibit.
 *
 */
public abstract class Capturer extends Artist {
  private String exhibits;

  /**
   * Initializes an Capturer with with name, age, status, genre, awards, and exhibits.
   *
   * @param name the Capturer's name
   * @param age the Capturer's age
   * @param active the Capturer's active years
   * @param genre the Capturer's genre
   * @param awards the Capturer's awards
   * @param exhibits the Capturer's exhibits
   *
   */
  public Capturer(Name name, Integer age, String active, String genre, String awards, String exhibits) {
    super(name, age, active, genre, awards);
    this.exhibits = exhibits;
  }

  /**
   * Get the exhibits of the Capturer
   * @return the exhibits of the Capturer
   */
  public String getExhibits() {
    return exhibits;
  }
}
