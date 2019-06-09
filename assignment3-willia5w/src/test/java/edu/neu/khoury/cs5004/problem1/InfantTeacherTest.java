package edu.neu.khoury.cs5004.problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InfantTeacherTest {
  private InfantTeacher infantTeacher;
  private Name teacherName;
  private Name coworkerName;

  @Before
  public void setUp() throws Exception {
    teacherName = new Name("Dan", "Williams");
    coworkerName = new Name("Sam", "Adams");
    infantTeacher = new InfantTeacher(teacherName, "Infant", coworkerName,
        3, 4, true, 1, 2);

  }

  @Test
  public void equals1() {
    assert true;
  }

  @Test
  public void hashCode1() {
    assert true;
  }

  @Test
  public void toString1() {
    assert true;
  }

  @Test
  public void getName() {
    assertEquals("Dan Williams", teacherName.getFullName());
  }

  @Test
  public void getClassroom() {
    assertEquals("Infant", infantTeacher.getClassroom());
  }

  @Test
  public void getCoTeacher() {
    assertEquals("Sam Adams", coworkerName.getFullName());
  }

  @Test
  public void getCurrentNumChildren() {
    assertEquals(3, infantTeacher.getCurrentNumChildren(),0);
  }

  @Test
  public void getMaxNumChildren() {
    assertEquals(4, infantTeacher.getMaxNumChildren(),0);
  }

  @Test
  public void getTeacherVacaStatus() {
    assertEquals(true, infantTeacher.getTeacherVacaStatus());
  }

  @Test
  public void getCurrentNumCrawlers() {
    assertEquals(1, infantTeacher.getCurrentNumCrawlers(), 0);
  }

  @Test
  public void getCurrentNumWalkers() {
    assertEquals(2, infantTeacher.getCurrentNumWalkers(), 0);
  }
}