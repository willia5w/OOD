package edu.neu.khoury.cs5004.problem1;

public class HomebakeData {
  private String formula; // Required
  private String operation; // Required
  private Boolean warningsFlag; // Optional
  private Boolean verboseFlag; // Optional
  private Boolean debugFlag; // Default is false

  public HomebakeData(String formula, String operation, Boolean warningsFlag, Boolean verboseFlag, Boolean debugFlag) {
    this.formula = formula;
    this.operation = operation;
    this.warningsFlag = warningsFlag;
    this.verboseFlag = verboseFlag;
    this.debugFlag = debugFlag;
  }
}
