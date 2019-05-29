package PrototypeVideoGame;

public class Civilian extends Piece {
  private Integer wealth;

  public Civilian (Name name, Integer age, Integer wealth) throws IncorrectWealthValueException, IncorrectAgeRangeException {
    super(name, age);
    if (wealth < 0) {
      throw IncorrectWealthValueException("Wealth must remain positive or zero.");
    }
    this.wealth = wealth;
  }

  public Integer getWealth() {
    return wealth;
  }
}
