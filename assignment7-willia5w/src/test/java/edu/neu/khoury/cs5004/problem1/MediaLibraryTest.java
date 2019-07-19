package edu.neu.khoury.cs5004.problem1;

import edu.neu.khoury.cs5004.problem1.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MediaLibraryTest {
  private MediaLibrary mediaLibrary;
  private Media media1;
  private Media media2;
  private Media media3;
  private Media media4;
  private Media media5;
  private ArrayList<Media> mediaList1;
  private ArrayList<Name> directorList1;
  private ArrayList<Name> actorList1;
  private ArrayList<Name> directorList2;
  private ArrayList<Name> actorList2;
  private Name director1;
  private Name director2;
  private Name director3;
  private Name actor1;
  private Name actor2;
  private Name actor3;


  @Before
  public void setUp() throws Exception {
    director1 = new Name("Daniel", "English");
    director2 = new Name("Tommy", "Fowler");
    actor1 = new Name("Justin", "Browne");
    directorList1 = new ArrayList<>();
    directorList2 = new ArrayList<>();
    actorList1 = new ArrayList<>();
    actorList2 = new ArrayList<>();
    directorList1.add(director1);
    directorList2.add(director2);
    actorList1.add(actor1);

    media1 = new Media(
        "alias",
        "The Office",
        2005,
        directorList1,
        actorList1
    );

    media2 = new Media(
        "alias2",
        "Game of Thrones",
        2011,
        directorList1,
        actorList1
    );

    media3 = new Media(
        "alias3",
        "Parks and Recreation",
        2007,
        directorList2,
        actorList1
    );

    media4 = new Media(
        "alias4",
        "Lord of the Rings",
        2006,
        directorList1,
        actorList1
    );

    media5 = new Media(
        "alias5",
        "Star Wars",
        1977,
        directorList1,
        actorList1
    );

    mediaList1 = new ArrayList<>();
    mediaList1.add(media3);
    mediaList1.add(media2);
    mediaList1.add(media1);
    mediaList1.add(media4);
    mediaLibrary = new MediaLibrary(mediaList1);
  }

  @Test
  public void getMediaList() {
    assertEquals(mediaList1, mediaLibrary.getMediaList());
  }

  @Test
  public void getFromDirector() {
    ArrayList<Media> returnedList = mediaLibrary.getFromDirector(director1);
    assertEquals(media2, returnedList.get(0));
    assertEquals(media4, returnedList.get(1));
    assertEquals(media1, returnedList.get(2));
    assertEquals(3, returnedList.size());
  }

  @Test
  public void sortByReleaseYear() {
    ArrayList<Media> list = MediaLibrary.sortByReleaseYear(mediaList1);
    assertEquals(media2, list.get(0));
    assertEquals(media3, list.get(1));
    assertEquals(media4, list.get(2));
    assertEquals(media1, list.get(3));
  }

  @Test
  public void aliasExists() {
    assertTrue(MediaLibrary.aliasExists(mediaList1, "alias"));
    assertFalse(MediaLibrary.aliasExists(mediaList1, "alias5"));
  }

  @Test
  public void addMedia() throws DuplicateMediaException {
    mediaLibrary.addMedia(media5);
    assertTrue(mediaLibrary.getMediaList().contains(media5));
  }

  @Test
  public void requestStream() throws MediaDoesNotExistException {
    assertEquals((Integer) 0, mediaLibrary.getNumStreams("alias3"));
    mediaLibrary.requestStream("alias3");
    assertEquals((Integer) 1, mediaLibrary.getNumStreams("alias3"));
  }

  @Test
  public void getNumStreams() throws MediaDoesNotExistException {
    assertEquals((Integer) 0, mediaLibrary.getNumStreams("alias3"));
    mediaLibrary.requestStream("alias3");
    assertEquals((Integer) 1, mediaLibrary.getNumStreams("alias3"));
  }

  @Test
  public void getMostStreamed() throws MediaDoesNotExistException {
    mediaLibrary.requestStream("alias2");
    mediaLibrary.requestStream("alias2");
    mediaLibrary.requestStream("alias2");
    assertEquals(media2, mediaLibrary.getMostStreamed());
  }
}