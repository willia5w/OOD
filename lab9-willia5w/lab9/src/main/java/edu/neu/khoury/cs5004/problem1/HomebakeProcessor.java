package edu.neu.khoury.cs5004.problem1;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomebakeProcessor {
  private String formula; // Required
  private String operation; // Required
  private Boolean warningsFlag; // Optional
  private Boolean verboseFlag; // Optional
  private Boolean debugFlag; // Default is false

  public static void main(String[] args) throws InvalidArgumentException {

    // Validate args
    // convert args to ArrayList<String>
    if (args.length > 5) {
      throw new InvalidArgumentException("Invalid combination of arguments");
    } else if (args.contains("install" && "uninstall" && "update")) {  // Cannot contain more than one
      throw new InvalidArgumentException("Invalid combination of arguments");
    }

    List <String> arguments = new ArrayList <>(Arrays.asList(args));
    while (arguments.size() >= 1) {
      String currentArg = arguments.remove(0);
      switch (currentArg) {
        case "install":
          operation = "install";
        case "uninstall":
          operation = "uninstall";
        case "update":
          operation = "update";
        case "-q":
          warningsFlag = true;
        case "-v":
          verboseFlag = true;
        case "-d":
          debugFlag = true;
      }
    }
    formula = arguments.remove(0); // final arg will be String that is the program name
    return new HomebakeData(formula, operation, warningsFlag, verboseFlag, debugFlag);
  }
}
