package edu.neu.khoury.cs5004.problem2;

public class WindowCleaning extends Exterior{
  private Integer numFloors;

  public WindowCleaning(Integer BASE_RATE,  String invoiceID, String propertyAddress,
                        Boolean monthly, Integer timesServiced, Double priceOfService, Integer month, Integer numFloors)
  throws TooManyFloorsException {
    super(BASE_RATE, invoiceID, propertyAddress, monthly, timesServiced, priceOfService, month);
    if (numFloors > 3) {
      throw new TooManyFloorsException("Max number of floors for this service is 3");
    }
  }

  /**
   * $20 Waste removal fee added for gardening service
   */
  @Override
  public void additionalFee() {
    if (numFloors > 1) {
      priceOfService = priceOfService * 1.05;
    }
  }

  @Override
  public Double calculatePrice() {
    return super.calculatePrice();
  }
}
