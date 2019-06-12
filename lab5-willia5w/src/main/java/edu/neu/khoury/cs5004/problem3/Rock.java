package edu.neu.khoury.cs5004.problem3;

/**
 * Represents the state Paper in the game Rock-Paper-Scissors
 */
public class Rock extends RockPaperScissors {


  @Override
  public int hashCode() {
    return 2;
  }

  @Override
  public String toString() {
    return "Rock";
  }

  @Override
  public Boolean winOrLoss(RockPaperScissors other) {
    // > ok if they use instanceof
    return other.getClass().equals(Scissors.class);
  }


  @Override
  public Boolean winOrLoss2(Rock rock) {
    return false;
  }

  @Override
  public Boolean winOrLoss2(Paper paper) {
    return false;
  }

  /**
   * Rock wins only against scissors.
   * @param scissors
   * @return true
   */
  @Override
  public Boolean winOrLoss2(Scissors scissors) {
    return true;
  }

  @Override
  public Boolean winOrLoss2(RockPaperScissors other) {
    return other.winOrLoss2(this);
  }

}