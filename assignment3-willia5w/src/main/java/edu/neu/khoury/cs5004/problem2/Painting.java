package edu.neu.khoury.cs5004.problem2;

public class Painting extends Interior {
  private static final Double BASE_RATE = 80.0;
  private static final Double ONE_DAY = 8.0;
  private static final Double TWO_DAYS = 16.0;
  private static final Double THREE_DAYS = 24.0;

  public Painting(String invoiceID, String propertyAddress, Boolean monthly,
                  Integer timesServiced, Double priceOfService, Integer numPets) {
    super(invoiceID, propertyAddress, monthly, timesServiced, priceOfService, numPets);
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
  public void baseFee() {
    switch (propertySize) {
      case small:
        priceOfService = BASE_RATE * ONE_DAY;
        break;
      case medium:
        priceOfService = BASE_RATE * TWO_DAYS;
        break;
      case large:
        priceOfService = BASE_RATE * THREE_DAYS;
        break;
    }
  }

  @Override
  public Double calculatePrice() {
    return super.calculatePrice();
  }
}
