package edu.neu.khoury.cs5004.problem1;

public class Poet extends Artist {
  private String publishingCompany;
  private String publishedCollection;


  /**
   * Initializes a Poet given their name, age, active years, genre, awards, publishing company, and published collection.
   *
   * @param name the Poet's name
   * @param age the Poet's age
   * @param active the Poet's active years
   * @param genre the Poet's genre
   * @param awards the Poet's awards
   * @param publishingCompany the Poet's publishing company
   * @param publishedCollection the Poet's last published collection
   */
  public Poet(Name name, Integer age, String active, String genre, String awards, String publishingCompany, String publishedCollection) {
    super(name, age, active, genre, awards);
    this.publishingCompany = publishingCompany;
    this.publishedCollection = publishedCollection;
  }

  /**
   * Get the Poet's publishing company
   * @return the Poet's publishing company
   */
  public String getPublishingCompany() {
    return publishingCompany;
  }

  /**
   * Get the Poet's published collection
   * @return the Poet's published collection
   */
  public String getPublishedCollection() {
    return publishedCollection;
  }

  /**
   * Updates the awards that a Poet has
   * @param award the new award that the Poet is receiving
   * @return a new Poet with updated awards
   */
  @Override
  public Poet receiveAward(String award) {
    String updated_awards = this.awards + ", " + award;
    return new Poet(name, age, active, genre, updated_awards, publishingCompany, publishedCollection);
  }
}
