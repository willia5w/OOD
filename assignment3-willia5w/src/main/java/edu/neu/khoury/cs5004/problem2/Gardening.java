package edu.neu.khoury.cs5004.problem2;

public class Gardening extends Exterior{

  public Gardening(Integer BASE_RATE, String invoiceID, String propertyAddress, Boolean monthly, Integer timesServiced, Double priceOfService, Integer month) {
    super(BASE_RATE, invoiceID, propertyAddress, monthly, timesServiced, priceOfService, month);
  }

  /**
   * $20 Waste removal fee added for gardening service
   */
  @Override
  public void additionalFee() {
    priceOfService = priceOfService + 20;
  }

  @Override
  public String toString() {
    return "Gardening{" +
        "invoiceID='" + invoiceID + '\'' +
        ", propertyAddress='" + propertyAddress + '\'' +
        ", propertySize=" + propertySize +
        ", monthly=" + monthly +
        ", timesServiced=" + timesServiced +
        ", priceOfService=" + priceOfService +
        '}';
  }
}
