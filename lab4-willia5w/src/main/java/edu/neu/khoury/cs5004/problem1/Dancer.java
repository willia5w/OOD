package edu.neu.khoury.cs5004.problem1;

/**
 * This class represents an Dancer which is a type of Performer that has films.
 */
public class Dancer extends Performer {

  /**
   * Creates an Dancer given their name, age, active years, genre, and awards movies, series, and other multimedia.
   * @param name the Dancer's name
   * @param age the Dancer's age
   * @param active the Dancer's active years
   * @param genre the Dancer's genre
   * @param awards the Dancer's awards
   * @param movies the Dancer's movies
   * @param series the Dancer's series
   * @param otherMultimedia the Dancer's other multimedia
   */
  public Dancer(Name name, Integer age, String active, String genre, String awards, String movies, String series, String otherMultimedia) {
    super(name, age, active, genre, awards, movies, series, otherMultimedia);
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
  public String getMovies() {
    return super.getMovies();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getSeries() {
    return super.getSeries();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getOtherMultimedia() {
    return super.getOtherMultimedia();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Artist receiveAward(String award) {
    return null;
  }
}
