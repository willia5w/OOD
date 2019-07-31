package edu.neu.khoury.cs5004;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class ArgumentScanner implements IArgumentScanner {
  /**
   * Scans command line arguments and validates them regardless of order.
   *
   * @param args command line arguments
   * @return True if arguments sufficient for processing. Returns False otherwise.
   * @throws InvalidArgumentException
   */
  @Override
  public static Boolean validateArgs(String[] args) throws InvalidArgumentException {
    // Order should not matter. "--email" or "--letter" can be anywhere.
    // Should allow for different flags.
  }

  /**
   * After arguments are validated, directory and template information are exported.
   *
   * @param args command line arguments
   * @return DataProcessor  object containing required information
   */
  @Override
  public static DataProcessor processArgs(String[] args) {
    return null;
  }
}
