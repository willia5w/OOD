package edu.neu.khoury.cs5004.problem1;

/**
 * Allows a Capturer to receive an award.
 */
public interface ICapturer extends IArtist{
  /**
   * Updates the awards that a Capturer has
   *
   * @param award the new award that the Capturer is receiving
   * @return A new Capturer with updated awards
   */
  Capturer receiveAward(String award);
}
