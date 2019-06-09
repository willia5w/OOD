package edu.neu.khoury.cs5004.problem2;

import java.util.Objects;

public abstract class Interior extends Service {
  private static final Double BASE_RATE = 80.0;
  private static final Double ONE_DAY = 8.0;
  private static final Double TWO_DAYS = 16.0;
  private static final Double FOUR_DAYS = 32.0;

  private Integer numPets;

  public Interior(String invoiceID, String propertyAddress, Boolean monthly,
                  Integer timesServiced, Double priceOfService, Integer numPets) {
    super(invoiceID, propertyAddress, monthly, timesServiced, priceOfService);
    this.numPets = numPets;
  }



  public Integer getNumPets() {
    return numPets;
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
        priceOfService = BASE_RATE * FOUR_DAYS;
        break;
    }
  }

  @Override
  public void additionalFee() {
    switch (numPets) {
      case 0:
        priceOfService = BASE_RATE * 1.0;
      case 1:
      case 2:
        priceOfService = BASE_RATE * 1.05;
      default:
        priceOfService = BASE_RATE * 1.07;
    }
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getNumPets());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Interior)) return false;
    if (!super.equals(o)) return false;
    Interior interior = (Interior) o;
    return numPets.equals(interior.numPets);
  }

}
