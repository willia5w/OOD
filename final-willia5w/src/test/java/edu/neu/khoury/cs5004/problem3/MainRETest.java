package edu.neu.khoury.cs5004.problem3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainRETest {

  @Test
  public void findMatchPass() {

  }

  @Test
  public void findMatchFail() {
    List expectedResultingList = new ArrayList();
    expectedResultingList.add("asiufbiusdnv");
    List actualResultingList = MainRE.findMatch("sndgkslnbxfjv");
    assertEquals(null, actualResultingList);
  }

  @Test
  public void checkFormat() {
    assertFalse(MainRE.checkFormat("111aaaaA1X11"));
  }
}