package edu.neu.khoury.cs5004.problem3;

/**
 * Represents the state Scissors in the game Rock-Paper-Scissors
 */
public class Scissors extends RockPaperScissors {

    @Override
    public int hashCode() {
      return 3;
    }


    @Override
    public String toString() {
      return "Scissors";
    }

    @Override
    public Boolean winOrLoss(RockPaperScissors other) {
      // > ok if they use instanceof
      return other.getClass().equals(Paper.class);
    }


    @Override
    public Boolean winOrLoss2(Rock rock) {
      return false;
    }


  /**
   * Scissors wins only against paper.
   * @param paper
   * @return true
   */
    @Override
    public Boolean winOrLoss2(Paper paper) {
      return true;
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