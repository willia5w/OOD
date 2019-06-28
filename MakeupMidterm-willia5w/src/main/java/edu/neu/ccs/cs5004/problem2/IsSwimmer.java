package edu.neu.ccs.cs5004.problem2;

public class IsSwimmer implements ISwimTeamManagementSystem {

  private Swimmer swimmer;
  private ISwimTeamManagementSystem nextSwimmer;

  @Override
  public Boolean isEmpty() {
    return false;
  }

  @Override
  public ISwimTeamManagementSystem addSwimmer(ISwimTeamManagementSystem swimmer) {
    swimmer = this.nextSwimmer;
    return this;
  }

  @Override
  public Boolean containsSwimmer(ISwimTeamManagementSystem swimmer) {
    if (this.swimmer == swimmer) {
      return true;
    } else {
      containsSwimmer(this.nextSwimmer);
    }
    return false;
  }

  @Override
  public Integer numberOfSwimmer(ISwimTeamManagementSystem swimmer) {
    return null;
  }

  @Override
  public ISwimTeamManagementSystem specifiedDisciplineSwimmers(ISwimTeamManagementSystem swimmer) throws SwimmerNotFoundException {
    return null;
  }
}
