package edu.neu.khoury.cs5004.problem2;

import java.util.Objects;

public class WindowCleaning extends Exterior{
  private Integer numFloors;

  public WindowCleaning(String invoiceID, String propertyAddress,
                        Boolean monthly, Integer timesServiced, Double priceOfService, Integer month, Integer numFloors)
  throws TooManyFloorsException {
    super(invoiceID, propertyAddress, monthly, timesServiced, priceOfService, month);
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

  public Integer getNumFloors() {
    return numFloors;
  }

  @Override
  public Double calculatePrice() {
    return super.calculatePrice();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof WindowCleaning)) return false;
    if (!super.equals(o)) return false;
    WindowCleaning that = (WindowCleaning) o;
    return numFloors.equals(that.numFloors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), numFloors);
  }
}


