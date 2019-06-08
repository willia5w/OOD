package edu.neu.khoury.cs5004.problem2;

import java.util.Objects;

public abstract class Interior extends Service {
  private static final Integer BASE_RATE = 80;
  private Integer numPets;


  public Interior(Integer BASE_RATE, String invoiceID, String propertyAddress, Boolean monthly,
                  Integer timesServiced, Double priceOfService, Integer numPets) {
    super(BASE_RATE, invoiceID, propertyAddress, monthly, timesServiced, priceOfService);
    this.numPets = numPets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Interior)) return false;
    if (!super.equals(o)) return false;
    Interior interior = (Interior) o;
    return numPets.equals(interior.numPets);
  }


  public Integer getNumPets() {
    return numPets;
  }

  @Override
  public void baseFee() {
    switch (propertySize) {
      case small:
        priceOfService = BASE_RATE * 1.0;
      case medium:
        priceOfService = BASE_RATE * 2.0;
      case large:
        priceOfService = BASE_RATE * 4.0;
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
}
