package edu.neu.ccs.cs5004.problem2;

public interface IOrderFulfillmentAndProcessing {

  // Should throw error message if desired qty is greater than available
  // Should allow user to continue shopping
  // Stock qty not updated until order fulfilled
  void addProductToCart() throws Exception;


  // Substitute out of stock item with equivalent based on set rules in outline
  void substitutue();

  void fulfillOrder();  // Reduces available qty for items and substitutes as needed

  Reciept processOrder();


}
