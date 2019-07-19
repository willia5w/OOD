package edu.neu.khoury.cs5004.problem1;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Constructs a media object.
 */
public class Media implements Comparable<Media> {
  private String alias;
  private String title;
  private Integer releaseYear;
  private ArrayList<Name> directorList;
  private ArrayList<Name> actorList;
  private Integer numStreams;

  /**
   * Constructs a media object.
   *
   * @param alias media's alias
   * @param title media's title
   * @param releaseYear media's release year
   * @param directorList media's director list
   * @param actorList media's actor list
   */
  public Media(String alias, String title, Integer releaseYear,
      ArrayList<Name> directorList, ArrayList<Name> actorList) {
    this.alias = alias;
    this.title = title;
    this.releaseYear = releaseYear;
    this.directorList = directorList;
    this.actorList = actorList;
    this.numStreams = 0;
  }

  /**
   * Return a media's alias.
   *
   * @return media's alias
   */
  public String getAlias() {
    return alias;
  }

  /**
   * Return media's title.
   *
   * @return media's title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Return media's release year.
   *
   * @return media's release year
   */
  public Integer getReleaseYear() {
    return releaseYear;
  }

  /**
   * Return media's number of streams.
   *
   * @return media's number of streams
   */
  public Integer getNumStreams() {
    return numStreams;
  }

  /**
   * Return media's list of directors.
   *
   * @return media's list of directors
   */
  public ArrayList<Name> getDirectorList() {
    return directorList;
  }

  /**
   * Return media's list of actors.
   *
   * @return media's list of actors
   */
  public ArrayList<Name> getActorList() {
    return actorList;
  }

  /**
   * Increment media's number of streams.
   */
  public void addStream() {
    this.numStreams++;
  }

  /**
   * Compare's media's release year to a given media's
   * release year.
   *
   * @param otherMedia other media object
   * @return 1, 0, or -1
   */
  @Override
  public int compareTo(Media otherMedia) {
    if (this.getReleaseYear() < otherMedia.getReleaseYear()) {
      return 1;
    } else if (this.getReleaseYear() > otherMedia.getReleaseYear()) {
      return -1;
    } else {
      return 0;
    }
  }

  @Override
  public String toString() {
    return "Media{" +
        "alias='" + alias + '\'' +
        ", title='" + title + '\'' +
        ", releaseYear=" + releaseYear +
        ", directorList=" + directorList +
        ", actorList=" + actorList +
        ", numStreams=" + numStreams +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Media media = (Media) o;
    return Objects.equals(alias, media.alias) &&
        Objects.equals(title, media.title) &&
        Objects.equals(releaseYear, media.releaseYear) &&
        Objects.equals(directorList, media.directorList) &&
        Objects.equals(actorList, media.actorList) &&
        Objects.equals(numStreams, media.numStreams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, title, releaseYear, directorList, actorList, numStreams);
  }
}
