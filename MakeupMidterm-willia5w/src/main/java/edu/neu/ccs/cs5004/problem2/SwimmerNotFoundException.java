package edu.neu.ccs.cs5004.problem2;

public class SwimmerNotFoundException extends Exception{

  public SwimmerNotFoundException() {
    super("Swimmer not found.");
  }
}
