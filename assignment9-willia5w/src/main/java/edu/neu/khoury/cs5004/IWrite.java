package edu.neu.khoury.cs5004;

/**
 * Responsible for populating fields of a given template and saving to specified output directory.
 */
public interface IWrite {

  /**
   * Populates necessary fields within a given template.
   * @param documentTemplate the given document template to be populated with customer data.
   * @return a populated documentTemplate
   */
  String write(String documentTemplate);

  /**
   * Saves the populated document template to the specified directory.
   * @param outputDirectory the output directory that the user specifies in the command line
   */
  void save(String outputDirectory);
}
