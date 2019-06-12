package edu.neu.khoury.cs5004.problem3;

public abstract class RockPaperScissors implements IRockPaperScissors {

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    return getClass() == obj.getClass();
  }

  public abstract Boolean winOrLoss2(RockPaperScissors other);
}
