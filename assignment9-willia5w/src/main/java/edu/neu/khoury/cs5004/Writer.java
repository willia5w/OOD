package edu.neu.khoury.cs5004;

public class Writer implements IWrite {
  /**
   * Populates necessary fields within a given template.
   *
   * @param documentTemplate the given document template to be populated with customer data.
   */
  @Override
  public static String write(String documentTemplate) {

    // Using regex replaceAll(), pattern [[first name]] to be replaced with current customer's first name,
    // and so on for other fields in current customer's Value(list of personal information).
    // Example: str = str.replaceAll("[[first name]]", Map.firstName.values[i]);
  }

  /**
   * Saves the populated document template to the specified directory.
   *
   * @param populatedDocument the document ready to be saved
   * @param outputDirectory the output directory that the user specifies in the command line
   */
  @Override
  public static void save(String populatedDocument, String outputDirectory) {

    // Use Java.IO built in method to save current file to directory.
    // Perhaps add LocalDateTime now() and customerID or similar to exported filename.

  }
}
