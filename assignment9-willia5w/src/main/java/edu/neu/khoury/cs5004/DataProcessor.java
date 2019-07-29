package edu.neu.khoury.cs5004;

import java.util.Map;

/**
 * Contains data required for Java File IO processing.
 */
public class DataProcessor implements IDataProcessor {
  private String documentTemplate;
  private String outputDirectory;
  private String recipientList;
  private Map recipientData;


  /**
   * Handles the parsing and writing to execute the document creation process.
   */
  @Override
  public void processData() {
    recipientData = Parser.parseTemplate(documentTemplate);
//    while ((line = fileReader.readLine()) != null)
//      //Get all tokens available in line
//      String[] tokens = line.split(",");

        // ArrayList<String> customerData = Parser.parseRecipientList(tokens);
        //    Case 1: Remove leading quotation for index 0
        //    Case 2: Remove trailing quotation for last token in row
        // Append appropriate token to Value list for header Keys in Map
        // populateRecipientData(customerData);
//      }
//    }
//  }

    String populatedDocument = Writer.write(documentTemplate);
    Writer.save(populatedDocument, outputDirectory);
  }
}
