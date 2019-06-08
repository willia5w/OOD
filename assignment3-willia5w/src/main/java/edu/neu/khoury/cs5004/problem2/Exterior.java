package edu.neu.khoury.cs5004.problem2;

import java.util.Objects;

public abstract class Exterior extends Service {
  private static final Integer BASE_RATE = 80;
  private Integer month;

  public Exterior(Integer BASE_RATE, String invoiceID, String propertyAddress, Boolean monthly, Integer timesServiced, Double priceOfService, Integer month) {
    super(BASE_RATE, invoiceID, propertyAddress, monthly, timesServiced, priceOfService);
    this.month = month;
  }

  public Integer getMonth() {
    return month;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Exterior)) return false;
    if (!super.equals(o)) return false;
    Exterior interior = (Exterior) o;
    return month.equals(interior.month);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), month);
  }

  @Override
  public void baseFee() {
    switch (propertySize) {
      case small:
      case medium:
        priceOfService = BASE_RATE * 2.0;
      case large:
        priceOfService = BASE_RATE * 4.0;
    }
  }
}
