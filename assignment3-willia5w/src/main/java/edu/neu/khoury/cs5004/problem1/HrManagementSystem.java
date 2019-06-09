package edu.neu.khoury.cs5004.problem1;

/**
 * This class has a Substitute Teacher and a Daycare Teacher. It is able to convert the substitute into a full-time
 * daycare teacher if the classroom type that the substitute teacher would like to work in matches the classroom type
 * of the full-time teacher.
 */
public class HrManagementSystem {
  private SubstituteTeacher subTeacher;
  private DaycareTeacher newCoworker;

  /**
   * Returns a new DaycareTeacher of the correct type if the requested classroom type
   * matches that of the potential coworker. Fields will be set appropriately, throws error otherwise.
   *
   * Down casting failed....
   *
   * @return new Daycare Teacher.
   */
  public DaycareTeacher convertSubstituteTeacher(
      subTeacher.getName().getFirstName(), String classroom, newCoworker.getName().getFirstName())
      throws IllegalArgumentException {

    switch (newCoworker.getClassroom()) {
      case "Infant":
        return new InfantTeacher(subTeacher.getName(), newCoworker.getClassroom(), newCoworker.getName(),
            newCoworker.getCurrentNumChildren(), newCoworker.getCurrentNumCrawlers(),
            newCoworker.getCurrentNumWalkers(), newCoworker.getMaxNumChildren(), newCoworker.getTeacherVacaStatus());
        break;
      case "Toddler":
        return new ToddlerTeacher(subTeacher.getName(), newCoworker.getClassroom(), newCoworker.getName(),
            newCoworker.getCurrentNumChildren(), newCoworker.getCurrentNumDiaperChildren(),
            newCoworker.getCurrentNumPottyChildren(), newCoworker.getMaxNumChildren(),
            newCoworker.getTeacherVacaStatus());
        break;
      case "Preschool":
        return new PreschoolTeacher(subTeacher.getName(), newCoworker.getClassroom(), newCoworker.getName(),
            newCoworker.getCurrentNumChildren(), newCoworker.getCurrentNumReadingChildren(),
            newCoworker.getMaxNumChildren(), newCoworker.getTeacherVacaStatus());
        break;
      default:
        throw new IllegalArgumentException("Incompatible or incorrect classroom type. Promotion denied.");
        break;
    }
  }
}
