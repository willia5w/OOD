package PrototypeVideoGame;

public class Soldier extends Piece {
  private Integer stamina;

  public Soldier(Name name, Integer age, Integer stamina) throws IncorrectAgeRangeException {
    super(name, age);
    this.stamina = stamina;
  }
}
