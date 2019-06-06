package edu.neu.khoury.cs5004.problem1;

/**
 * This class represents an Artists that has a name, age, status, genre, and awards.
 *
 */
public abstract class Artist implements IArtist{
  protected Name name;
  protected Integer age;
  protected String active;
  protected String genre;
  protected String awards;

  /**
   * Initializes an Artist with name, age, active years, genre, and awards.
   *
   * @param name the Artist's name
   * @param age the Artist's age
   * @param active the Artist's active years
   * @param genre the Artist's genre
   * @param awards the Artist's awards
   */
  public Artist(Name name, Integer age, String active, String genre, String awards) {
    this.name = name;
    if (age < 1 || age > 128) {
      System.out.println("Invalid age entered.");
    } else {
      this.age = age;
    }
    if (active.length() < 9 || active.length() > 12) {
      System.out.println("Invalid active years entered.");
    } else {
      this.active = active;
    }
    this.genre = genre;
    this.awards = awards;
  }

  /**
   * Get the name of the Artist
   * @return the name of the Artist
   */
  public Name getName() {
    return name;
  }

  /**
   * Get the age of the Artist
   * @return the age of the Artist
   */
  public Integer getAge() {
    return age;
  }

  /**
   * Get the active years of the Artist
   * @return the active years of the Artist
   */
  public String getActive() {
    return active;
  }

  /**
   * Get the genre of the Artist
   * @return the genre of the Artist
   */
  public String getGenre() {
    return genre;
  }

  /**
   * Get the awards of the Artist
   * @return the award sof the Artist
   */
  public String getAwards() {
    return awards;
  }
}

