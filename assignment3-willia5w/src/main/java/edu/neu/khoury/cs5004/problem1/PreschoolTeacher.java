package edu.neu.khoury.cs5004.problem1;

import java.util.Objects;

public class PreschoolTeacher extends DaycareTeacher {
  private Integer currentNumReadingChildren;

  public PreschoolTeacher(Name name, String classroom, Name coTeacher, Integer currentNumChildren,
                          Integer maxNumChildren, Boolean teacherVacaStatus,
                          Integer currentNumReadingChildren) {
    super(name, classroom, coTeacher, currentNumChildren, maxNumChildren, teacherVacaStatus);
    this.currentNumReadingChildren = currentNumReadingChildren;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof PreschoolTeacher)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    PreschoolTeacher that = (PreschoolTeacher) o;
    return getCurrentNumReadingChildren().equals(that.getCurrentNumReadingChildren());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getCurrentNumReadingChildren());
  }

  @Override
  public String toString() {
    return "PreschoolTeacher{"
        + "currentNumReadingChildren="
        + currentNumReadingChildren
        + '}';
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

  public Integer getCurrentNumReadingChildren() {
    return currentNumReadingChildren;
  }
}

