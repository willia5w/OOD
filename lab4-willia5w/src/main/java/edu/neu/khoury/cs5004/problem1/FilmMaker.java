package edu.neu.khoury.cs5004.problem1;

/**
 * This class represents a Film Maker which is a type of performer that has films.
 */
public class FilmMaker extends Performer {


  /**
   * Creates an Film Maker given their name, age, active years, genre, and awards movies, series, and other multimedia.
   * @param name the Film Maker's name
   * @param age the Film Maker's age
   * @param active the Film Maker's active years
   * @param genre the Film Maker's genre
   * @param awards the Film Maker's awards
   * @param movies the Film Maker's movies
   * @param series the Film Maker's series
   * @param otherMultimedia the Film Maker's other multimedia
   */
  public FilmMaker(Name name, Integer age, String active, String genre, String awards, String movies, String series, String otherMultimedia) {
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
