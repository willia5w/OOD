package edu.neu.khoury.cs5004;

import java.util.ArrayList;
import java.util.Map;

public class Parser implements IParse {
  /**
   * Parses a given template for fields to retrieve from the CSV file containing customer data
   *
   * @param documentTemplate the provided template to be populated with customer data
   */
  @Override
  public static Map parseTemplate(String documentTemplate) {

    // Using public boolean String.contains(CharSequence s), scan for each of the 8 possible
    // column headers from the recipientData CSV file.
    // Example: if (documentTemplate.contains(CharSequence [[first name]]))

    // Returns a Map of relevant header columns from the recipientData CSV file
    // Will either be 4 keys for email or 8 keys for letter based on provided templates.
    // Should be flexible for our custom templates.
    return Map;
  }

  /**
   * Create an array of customer information from read-in line of recipientList.
   *
   * @param customerRow a single line of the recipientList
   * @return an array representation of a row in the recipientList CSV file
   */
  @Override
  public ArrayList<String> parseRecipientList(String customerRow) {
    // BufferedReader will read in customer data line by line, converting the data to an ArrayList of personal data.
    // Frankly, converting just the columns that we need into ArrayLists would be much faster and eliminate this step.

  }

  /**
   * Populates Map of recipient data, where each index of the customerData ArrayList corresponds
   * to an element that is added to the Map of recipientData.
   *
   * @param customerData
   */
  @Override
  public void populateRecipientData(ArrayList customerData) {
    // Key: firstName, Value[0] = customerData[0] and so on...
  }
}
