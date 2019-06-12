package edu.neu.khoury.cs5004.problem3;

/**
 * Represents the state Paper in the game Rock-Paper-Scissors
 */
public class Paper extends RockPaperScissors {


  @Override
  public int hashCode() {
    return 1;
  }


  @Override
  public String toString() {
    return "Paper";
  }


  @Override
  public Boolean winOrLoss(RockPaperScissors other) {
    // > ok if students use instanceof
    return other.getClass().equals(Rock.class);
  }


  /**
   * Paper wins only against rock.
   * @param rock
   * @return true
   */
  @Override
  public Boolean winOrLoss2(Rock rock) {
    return true;
  }


  @Override
  public Boolean winOrLoss2(Paper paper) {
    return false;
  }


  @Override
  public Boolean winOrLoss2(Scissors scissors) {
    return false;
  }


  @Override
  public Boolean winOrLoss2(RockPaperScissors other) {
    return other.winOrLoss2(this);
  }
}