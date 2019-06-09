package edu.neu.khoury.cs5004.problem1;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Objects;

public class InfantTeacher extends DaycareTeacher {
  private Integer currentNumCrawlers;
  private Integer currentNumWalkers;


  public InfantTeacher(Name name, String classroom, Name coTeacher, Integer currentNumChildren, Integer maxNumChildren,
                       Boolean teacherVacaStatus, Integer currentNumCrawlers, Integer currentNumWalkers) {
    super(name, classroom, coTeacher, currentNumChildren, maxNumChildren, teacherVacaStatus);
    this.currentNumCrawlers = currentNumCrawlers;
    this.currentNumWalkers = currentNumWalkers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof InfantTeacher)) return false;
    if (!super.equals(o)) return false;
    InfantTeacher that = (InfantTeacher) o;
    return getCurrentNumCrawlers().equals(that.getCurrentNumCrawlers()) &&
        getCurrentNumWalkers().equals(that.getCurrentNumWalkers());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getCurrentNumCrawlers(), getCurrentNumWalkers());
  }

  @Override
  public String toString() {
    return "InfantTeacher{" +
        "currentNumCrawlers=" + currentNumCrawlers +
        ", currentNumWalkers=" + currentNumWalkers +
        '}';
  }

  @Override
  public Name getName() {
    return super.getName();
  }

  @Override
  public String getClassroom() {
    return super.getClassroom();
  }

  @Override
  public Name getCoTeacher() {
    return super.getCoTeacher();
  }

  @Override
  public Integer getCurrentNumChildren() {
    return super.getCurrentNumChildren();
  }

  @Override
  public Integer getMaxNumChildren() {
    return super.getMaxNumChildren();
  }

  @Override
  public Boolean getTeacherVacaStatus() {
    return super.getTeacherVacaStatus();
  }

  public Integer getCurrentNumCrawlers() {
    return currentNumCrawlers;
  }

  public Integer getCurrentNumWalkers() {
    return currentNumWalkers;
  }
}
