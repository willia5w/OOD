package edu.neu.khoury.cs5004;

import java.util.ArrayList;
import java.util.Map;

/**
 * Uses the provided template as a guide to retrieve required customer information.
 */
public interface IParse {

  /**
   * Parses a given template for fields to retrieve from the CSV file containing customer data
   * @param documentTemplate the provided template to be populated with customer data
   */
  Map parseTemplate(String documentTemplate);

  /**
   * Create an array of customer information from read-in line of recipientList.
   * @param customerRow a single line of the recipientList
   * @return an array representation of a row in the recipientList CSV file
   */
  ArrayList parseRecipientList(String customerRow);

  /**
   * Populates Map of recipient data, where each index of the customerData ArrayList corresponds
   * to an element that is added to the Map of recipientData.
   * @param customerData
   */
  void populateRecipientData(ArrayList customerData);
}
