package edu.neu.khoury.cs5004.problem1;

/**
 * This class represents an Actor which is a type of Performer that has films.
 */
public class Actor extends Performer {


  /**
   * Creates an Actor given their name, age, active years, genre, and awards movies, series, and other multimedia.
   * @param name the Actor's name
   * @param age the Actor's age
   * @param active the Actor's active years
   * @param genre the Actor's genre
   * @param awards the Actor's awards
   * @param movies the Actor's movies
   * @param series the Actor's series
   * @param otherMultimedia the Actor's other multimedia
   */
  public Actor(Name name, Integer age, String active, String genre, String awards, String movies, String series, String otherMultimedia) {
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
   * Increase the awards an Artist has.
   * @param award the new award that the Artist is receiving
   * @return a new Artist with updated awards.
   */
  @Override
  public Actor receiveAward(String award) {
    String currentAward = getAwards();
    String updatedAwards = currentAward + ", " + award;
    return new Actor(name, age, active, genre, getMovies(), getSeries(), getOtherMultimedia(), updatedAwards);
  }
}
