package edu.neu.khoury.cs5004.problem1;

/**
 * Allows an Artist to receive an award.
 */
public interface IArtist {
  /**
   * Updates the awards that an Artist has
   *
   * @param award the new award that the Artist is receiving
   * @return A new Artist with updated awards
   */
  Artist receiveAward(String award);
}