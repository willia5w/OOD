package PrototypeVideoGame;

public abstract class Piece {
  protected Name name;
  protected Integer age;


  public Piece(Name name, Integer age) throws IncorrectAgeRangeException {
    if (age < 0 || age > 128) {
      throw new IncorrectAgeRangeException("Invalid age entered.");
    }
    this.name = name;
    this.age = age;
  }

  public Name getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }
}
