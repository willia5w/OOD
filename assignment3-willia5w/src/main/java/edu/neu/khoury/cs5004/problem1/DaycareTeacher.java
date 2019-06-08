package edu.neu.khoury.cs5004.problem1;

public class DaycareTeacher implements IDaycareTeacher {
  private Name name;
  private String classroom; // "Infant", "Toddler", "Preschool"
  private Name coTeacher; // Can be null
  private Integer currentNumChildren;
  private Integer maxNumChildren; // 4, 7, 10
  private Boolean teacherVacaStatus;

  public DaycareTeacher(Name name, String classroom, Name coTeacher, Integer currentNumChildren,
                        Integer maxNumChildren, Boolean teacherVacaStatus) {
    this.name = name;
    this.classroom = classroom;
    this.coTeacher = coTeacher;
    this.currentNumChildren = currentNumChildren;
    this.maxNumChildren = maxNumChildren;
    this.teacherVacaStatus = teacherVacaStatus;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  @Override
  public String toString() {
    return super.toString();
  }

  public Name getName() {
    return name;
  }

  public String getClassroom() {
    return classroom;
  }

  public Name getCoTeacher() {
    return coTeacher;
  }

  public Integer getCurrentNumChildren() {
    return currentNumChildren;
  }

  public Integer getMaxNumChildren() {
    return maxNumChildren;
  }

  public Boolean getTeacherVacaStatus() {
    return teacherVacaStatus;
  }
}
