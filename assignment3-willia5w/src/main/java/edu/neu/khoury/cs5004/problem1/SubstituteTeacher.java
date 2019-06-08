package edu.neu.khoury.cs5004.problem1;

public class SubstituteTeacher {
  private Name name;
  private String classroom;
  private Name coTeacher;
  private Integer numDaysInGivenClassroom;
  private Boolean teacherVacaStatus;


  public SubstituteTeacher(Name name, String classroom, Name coTeacher,
                           Integer numDaysInGivenClassroom, Boolean teacherVacaStatus) {
    this.name = name;
    this.classroom = classroom;
    this.coTeacher = coTeacher;
    this.numDaysInGivenClassroom = numDaysInGivenClassroom;
    this.teacherVacaStatus = teacherVacaStatus;
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

  public Integer getNumDaysInGivenClassroom() {
    return numDaysInGivenClassroom;
  }

  public Boolean getTeacherVacaStatus() {
    return teacherVacaStatus;
  }
}
