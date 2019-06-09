package edu.neu.khoury.cs5004.problem2;

import java.util.Objects;

public abstract class Exterior extends Service {
  private static final Double BASE_RATE = 80.0;
  private static final Double TWO_HOURS = 2.0;
  private static final Double FOUR_HOURS = 4.0;
  private Integer month;

  public Exterior(String invoiceID, String propertyAddress, Boolean monthly, Integer timesServiced, Double priceOfService, Integer month) {
    super(invoiceID, propertyAddress, monthly, timesServiced, priceOfService);
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
        priceOfService = BASE_RATE * TWO_HOURS;
        break;
      case large:
        priceOfService = BASE_RATE * FOUR_HOURS;
        break;
    }
  }
}
