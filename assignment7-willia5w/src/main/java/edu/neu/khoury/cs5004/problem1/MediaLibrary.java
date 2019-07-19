package edu.neu.khoury.cs5004.problem1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Represents a media library.
 */
public class MediaLibrary implements IMediaLibrary {
  private ArrayList<Media> mediaList;

  /**
   * Construct a media library object.
   *
   * @param mediaList list of media objects
   */
  public MediaLibrary(ArrayList<Media> mediaList) {
    this.mediaList = mediaList;
  }

  /**
   * Return the media library's list of media.
   *
   * @return media library's list of media
   */
  public ArrayList<Media> getMediaList() {
    return mediaList;
  }

  @Override
  public ArrayList<Media> getFromDirector(Name name) {
    ArrayList<Media> mediaByDirector = new ArrayList<>();
    for (Media media : this.mediaList) {
      for (Name curName : media.getDirectorList()) {
        if (curName.equals(name)) {
          mediaByDirector.add(media);
        }
      }
    }
    mediaByDirector = sortByReleaseYear(mediaByDirector);
    return mediaByDirector;
  }

  /**
   * Sort and return the given list of media by release year.
   *
   * @param mediaList list of media to be sorted.
   * @return sorted list of media
   */
  public static ArrayList<Media> sortByReleaseYear(ArrayList<Media> mediaList) {
    Collections.sort(mediaList);
    return mediaList;
  }

  /**
   * Returns true if alias exists in media library,
   * false if not.
   *
   * @param mediaList media list to check
   * @param alias alias to check for
   * @return true if found, false if not
   */
  public static Boolean aliasExists(ArrayList<Media> mediaList, String alias) {
    for (Media media : mediaList) {
      if (media.getAlias().equals(alias)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void addMedia(Media media) throws DuplicateMediaException {
    if (aliasExists(this.getMediaList(), media.getAlias())) {
      throw new DuplicateMediaException("Media with that alias already exists.");
    }
    this.getMediaList().add(media);
  }

  @Override
  public void requestStream(String alias) throws MediaDoesNotExistException {
    Boolean found = false;
    for (Media media : this.getMediaList()) {
      if (media.getAlias().equals(alias)) {
        found = true;
        media.addStream();
      }
    }
    if (!found) {
      throw new MediaDoesNotExistException("Requested media does not exist.");
    }
  }

  @Override
  public Integer getNumStreams(String alias) throws MediaDoesNotExistException {
    for (Media media : this.getMediaList()) {
      if (media.getAlias().equals(alias)) {
        return media.getNumStreams();
      }
    }
    throw new MediaDoesNotExistException("Requested media does not exist.");
  }

  @Override
  public Media getMostStreamed() {
    Media mostStreamed = null;
    Integer max = 0;
    for (Media media : this.getMediaList()) {
      if (media.getNumStreams() > max) {
        mostStreamed = media;
      }
    }

    return mostStreamed;
  }
}
