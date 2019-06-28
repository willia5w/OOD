package edu.neu.ccs.cs5004.problem2;

public interface ISwimTeamManagementSystem {

  Boolean isEmpty();

  ISwimTeamManagementSystem addSwimmer(ISwimTeamManagementSystem swimmer);

  Boolean containsSwimmer(ISwimTeamManagementSystem swimmer);

  Integer numberOfSwimmer(ISwimTeamManagementSystem swimmer);

  ISwimTeamManagementSystem specifiedDisciplineSwimmers(ISwimTeamManagementSystem swimmer) throws SwimmerNotFoundException;
}
