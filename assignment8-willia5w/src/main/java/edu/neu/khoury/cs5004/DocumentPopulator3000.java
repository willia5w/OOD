package edu.neu.khoury.cs5004;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class DocumentPopulator3000 {
  public static void main (String[] args) throws InvalidArgumentException {

    if (args.length >5) {
      System.out.println("Too many arguments provided, program failure.");
      System.exit(0);  // Terminate JVM
    }

    try (ArgumentScanner.validateArgs(args)) {
      DataProcessor dataProcessor = ArgumentScanner.processArgs(args);  // Create DataProcessor instance
      dataProcessor.processData();  // Executes parse and write process given valid data
    } catch {
      throw new InvalidArgumentException("Invalid combination of arguments provided");
    }
  }
}
