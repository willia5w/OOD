package edu.neu.khoury.cs5004.problem1;

/**
 * This class represents a Musician which is a type of Artist that
 * has a recording company and a last record album.
 */
public class Musician extends Artist {
  private String recordingCompany;
  private String lastRecordAlbum;


  /**
   * Initializes a Musician given their name, age, active years, genre, awards, recording company, last record album.
   *
   * @param name the Musician's name
   * @param age the Musician's age
   * @param active the Musician's active years
   * @param genre the Musician's genre
   * @param awards the Musician's awards
   * @param recordingCompany the Musician's recording company
   * @param lastRecordAlbum the Musician's last record album
   */
  public Musician(Name name, Integer age, String active, String genre, String awards, String recordingCompany, String lastRecordAlbum) {
    super(name, age, active, genre, awards);
    this.recordingCompany = recordingCompany;
    this.lastRecordAlbum = lastRecordAlbum;
  }

  /**
   * Get the Musician's recording company
   * @return the Musician's recording company
   */
  public String getRecordingCompany() {
    return recordingCompany;
  }

  /**
   * Get the Musician's last album
   * @return the Musician's last album
   */
  public String getLastRecordAlbum() {
    return lastRecordAlbum;
  }

  /**
   * Updates the awards that a Musician has
   * @param award the new award that the Artist is receiving
   * @return A new Musician with updated awards
   */
  @Override
  public Musician receiveAward(String award) {
      String updated_awards = this.awards + ", " + award;
      return new Musician(name, age, active, genre, updated_awards, recordingCompany, lastRecordAlbum);
  }
}

