package edu.neu.khoury.cs5004.problem1;

import java.util.ArrayList;

public interface IMediaLibrary {
  /**
   * Return a list of all media directed by given name,
   * sorted by release year.
   *
   * @return list of media objects.
   */
  ArrayList<Media> getFromDirector(Name name);

  /**
   * Add a media object to the media library.
   *
   * @param media media to be added
   */
  void addMedia(Media media) throws DuplicateMediaException;

  /**
   * Increases the number of streams for the given
   * media.
   *
   * @param alias alias for media
   */
  void requestStream(String alias) throws MediaDoesNotExistException;

  /**
   * Return the number of streams for a given media.
   *
   * @param alias alias for media
   * @return number of streams
   */
  Integer getNumStreams(String alias) throws MediaDoesNotExistException;

  /**
   * Return the most streamed media in the media library.
   *
   * @return media object
   */
  Media getMostStreamed();
}
