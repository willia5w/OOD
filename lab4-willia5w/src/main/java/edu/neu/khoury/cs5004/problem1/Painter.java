package edu.neu.khoury.cs5004.problem1;

/**
 * This class represents Painter which is a type of Capturer that also has an exhibit.
 *
 */
public class Painter extends Capturer {


  /**
   * Initializes an Painter with with name, age, status, genre, awards, and exhibits.
   *
   * @param name     the Painter's name
   * @param age      the Painter's age
   * @param active   the Painter's active years
   * @param genre    the Painter's genre
   * @param awards   the Painter's awards
   * @param exhibits the Painter's exhibits
   */
  public Painter(Name name, Integer age, String active, String genre, String awards, String exhibits) {
    super(name, age, active, genre, awards, exhibits);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getExhibits() {
    return super.getExhibits();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Name getName() {
    return super.getName();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Integer getAge() {
    return super.getAge();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getActive() {
    return super.getActive();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getGenre() {
    return super.getGenre();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getAwards() {
    return super.getAwards();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Artist receiveAward(String award) {
    return null;
  }
}
