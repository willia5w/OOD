package edu.neu.khoury.cs5004.problem1;

import edu.neu.khoury.cs5004.problem1.Media;
import edu.neu.khoury.cs5004.problem1.Name;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MediaTest {
  private Media media;
  private Media media2;
  private Media media3;
  private ArrayList<Name> directorList;
  private ArrayList<Name> actorList;
  private Name director;
  private Name director2;
  private Name actor;
  private Name actor2;

  @Before
  public void setUp() throws Exception {
    directorList = new ArrayList<>();
    actorList = new ArrayList<>();
    director = new Name("Daniel", "English");
    director2 = new Name("Dan", "Williams");
    actor = new Name("Eddie", "Nash");
    actor = new Name("Tommy", "Fowler");
    media = new Media(
        "alias",
        "The Office",
        2005,
        directorList,
        actorList
    );

    media2 = new Media(
        "alias2",
        "Parks and Rec",
        2007,
        directorList,
        actorList
    );

    media3 = new Media(
        "alias2",
        "Parks and Rec",
        2007,
        directorList,
        actorList
    );
  }

  @Test
  public void getAlias() {
    assertEquals("alias", media.getAlias());
  }

  @Test
  public void getTitle() {
    assertEquals("The Office", media.getTitle());
  }

  @Test
  public void getReleaseYear() {
    assertEquals((Integer) 2005, media.getReleaseYear());
  }

  @Test
  public void getNumStreams() {
    assertEquals((Integer) 0, media.getNumStreams());
    media.addStream();
    assertEquals((Integer) 1, media.getNumStreams());
  }

  @Test
  public void getDirectorList() {
    assertEquals(directorList, media.getDirectorList());
  }

  @Test
  public void getActorList() {
    assertEquals(actorList, media.getActorList());
  }

  @Test
  public void addStream() {
    assertEquals((Integer) 0, media.getNumStreams());
    media.addStream();
    assertEquals((Integer) 1, media.getNumStreams());
  }

  @Test
  public void compareTo() {
    assertEquals(1, media.compareTo(media2));
    assertEquals(-1, media2.compareTo(media));
    assertEquals(0, media.compareTo(media));
  }

  @Test
  public void toString1() {
    String toString = "Media{alias='alias', title='The Office', releaseYear=2005, directorList=[], actorList=[], numStreams=0}";
    assertEquals(toString, media.toString());
  }

  @Test
  public void equals1() {
    assertTrue(media2.equals(media3));
    assertFalse(media.equals(null));
    assertFalse(media.equals(media2));
  }

  @Test
  public void hashCode1() {
    assertTrue(media2.hashCode() == media3.hashCode());
  }
}