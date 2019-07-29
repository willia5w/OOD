package edu.neu.khoury.cs5004;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Map;

public interface IArgumentScanner {

  /**
   * Scans command line arguments and validates them regardless of order.
   * @param args command line arguments
   * @return True if arguments sufficient for processing. Returns False otherwise.
   * @throws InvalidArgumentException
   */
  Boolean validateArgs(String[] args) throws InvalidArgumentException;


  /**
   * After arguments are validated, directory and template information are exported.
   * @param args command line arguments
   * @return DataProcessor  object containing required information
   */
  DataProcessor processArgs(String[] args);
}
