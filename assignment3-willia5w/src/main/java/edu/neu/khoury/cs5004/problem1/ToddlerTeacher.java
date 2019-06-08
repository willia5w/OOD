package edu.neu.khoury.cs5004.problem1;

import java.util.Objects;

public class ToddlerTeacher extends DaycareTeacher {
  private Integer currentNumDiaperChildren;
  private Integer currentNumPottyChildren;


  public ToddlerTeacher(Name name, String classroom, Name coTeacher, Integer currentNumChildren, Integer maxNumChildren,
                        Boolean teacherVacaStatus, Integer currentNumDiaperChildren, Integer currentNumPottyChildren) {
    super(name, classroom, coTeacher, currentNumChildren, maxNumChildren, teacherVacaStatus);
    this.currentNumDiaperChildren = currentNumDiaperChildren;
    this.currentNumPottyChildren = currentNumPottyChildren;
  }

  public ToddlerTeacher(Name name, String classroom, Name coTeacher, Integer currentNumChildren, Integer maxNumChildren, Boolean teacherVacaStatus) {
    super(name, classroom, coTeacher, currentNumChildren, maxNumChildren, teacherVacaStatus);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ToddlerTeacher)) return false;
    if (!super.equals(o)) return false;
    ToddlerTeacher that = (ToddlerTeacher) o;
    return getCurrentNumDiaperChildren().equals(that.getCurrentNumDiaperChildren()) &&
        getCurrentNumPottyChildren().equals(that.getCurrentNumPottyChildren());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getCurrentNumDiaperChildren(), getCurrentNumPottyChildren());
  }

  @Override
  public String toString() {
    return super.toString();
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

  public Integer getCurrentNumDiaperChildren() {
    return currentNumDiaperChildren;
  }

  public Integer getCurrentNumPottyChildren() {
    return currentNumPottyChildren;
  }
}
