package edu.neu.khoury.cs5004.problem1;

/**
 * This class represents Performer which is a type of Artist that also has movies, series, and other multimedia.
 *
 */
public abstract class Performer extends Artist {
  private String movies;
  private String series;
  private String otherMultimedia;


  /**
   * Initializes an Performer with with name, age, status, genre, awards, movies, series, and other multimedia.
   *
   * @param name the Performer's name
   * @param age the Performer's age
   * @param active the Performer's active years
   * @param genre the Performer's genre
   * @param awards the Performer's awards
   * @param awards the Performer's movies
   * @param awards the Performer's series
   * @param awards the Performer's otherMultimedia
   *
   */
  public Performer(Name name, Integer age, String active, String genre, String awards, String movies, String series, String otherMultimedia) {
    super(name, age, active, genre, awards);
    this.movies = movies;
    this.series = series;
    this.otherMultimedia = otherMultimedia;
  }

  /**
   * Get the movies of the Performer
   * @return the movies of the Performer
   */
  public String getMovies() {
    return movies;
  }

  /**
   * Get the series of the Performer
   * @return the series of the Performer
   */
  public String getSeries() {
    return series;
  }

  /**
   * Get the other multimedia of the Performer
   * @return the other multimedia of the Performer
   */
  public String getOtherMultimedia() {
    return otherMultimedia;
  }
}
