package edu.neu.ccs.cs5004.problem2;

public class NotSwimmer implements ISwimTeamManagementSystem {

  @Override
  public Boolean isEmpty() {
    return null;
  }

  @Override
  public ISwimTeamManagementSystem addSwimmer(ISwimTeamManagementSystem swimmer) {
    return this;
  }

  @Override
  public Boolean containsSwimmer(ISwimTeamManagementSystem swimmer) {
    return false;
  }

  @Override
  public Integer numberOfSwimmer(ISwimTeamManagementSystem swimmer) {
    return 0;
  }

  @Override
  public ISwimTeamManagementSystem specifiedDisciplineSwimmers(ISwimTeamManagementSystem swimmer) throws SwimmerNotFoundException {
    return this;
  }
}
