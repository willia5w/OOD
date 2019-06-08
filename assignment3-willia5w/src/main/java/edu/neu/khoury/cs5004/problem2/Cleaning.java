package edu.neu.khoury.cs5004.problem2;

public class Cleaning extends Interior {
  private static final double BASE_RATE = 80;

  public Cleaning(Integer BASE_RATE, String invoiceID, String propertyAddress, Boolean monthly,
                  Integer timesServiced, Double priceOfService, Integer numPets) {
    super(BASE_RATE, invoiceID, propertyAddress, monthly, timesServiced, priceOfService, numPets);
  }

  @Override
  public String toString() {
    return "Painting{" +
        "invoiceID='" + invoiceID + '\'' +
        ", propertyAddress='" + propertyAddress + '\'' +
        ", propertySize=" + propertySize +
        ", monthly=" + monthly +
        ", timesServiced=" + timesServiced +
        ", priceOfService=" + priceOfService +
        '}';
  }

  @Override
  public Double calculatePrice() {
    return super.calculatePrice();
  }
}
