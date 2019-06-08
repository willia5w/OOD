package edu.neu.khoury.cs5004.problem1;

public class HrManagementSystem {

  static DaycareTeacher convertSubstituteTeacher(
      SubstituteTeacher subTeacher, String classroom, DaycareTeacher newCoworker) throws IllegalArgumentException {

    switch (newCoworker.getClassroom()) {
      case "Infant":
        return new InfantTeacher(subTeacher.getName(), newCoworker.getClassroom(), newCoworker.getName(),
            newCoworker.getCurrentNumChildren(), newCoworker.getCurrentNumCrawlers(),
            newCoworker.getCurrentNumWalkers(), newCoworker.getMaxNumChildren(), newCoworker.getTeacherVacaStatus());

      case "Toddler":
        return new ToddlerTeacher(subTeacher.getName(), newCoworker.getClassroom(), newCoworker.getName(),
            newCoworker.getCurrentNumChildren(), newCoworker.getCurrentNumDiaperChildren(),
            newCoworker.getCurrentNumPottyChildren(), newCoworker.getMaxNumChildren(),
            newCoworker.getTeacherVacaStatus());

      case "Preschool":
        return new PreschoolTeacher(subTeacher.getName(), newCoworker.getClassroom(), newCoworker.getName(),
            newCoworker.getCurrentNumChildren(), newCoworker.getCurrentNumReadingChildren(),
            newCoworker.getMaxNumChildren(), newCoworker.getTeacherVacaStatus());

      default:
        throw new IllegalArgumentException("Incompatible or incorrect classroom type. Promotion denied.");
    }
  }
}
