package edu.neu.khoury.cs5004.problem2;

public class Cleaning extends Interior {

  public Cleaning(String invoiceID, String propertyAddress, Boolean monthly,
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
}
