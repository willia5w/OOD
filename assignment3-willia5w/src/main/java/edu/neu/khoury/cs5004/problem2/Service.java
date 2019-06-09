package edu.neu.khoury.cs5004.problem2;

import java.util.Objects;


public abstract class Service implements IService {
  private static final Double TEN_SERVICES = 10.0;
  private static final Double NINE_SERVICES = 9.0;
  private static final Double NINETY_PERCENT = 0.9;
  private static final Double FIFTY_PERCENT = 0.5;

  protected String invoiceID;
  protected String propertyAddress;
  protected PropertySize propertySize;
  protected Boolean monthly;
  protected Integer timesServiced;
  protected Double priceOfService;


  public Service(String invoiceID, String propertyAddress, Boolean monthly,
                 Integer timesServiced, Double priceOfService) {
    this.invoiceID = invoiceID;
    this.propertyAddress = propertyAddress;
    this.monthly = monthly;
    this.timesServiced = timesServiced;
    this.priceOfService = priceOfService;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Service)) return false;
    Service service = (Service) o;
    return getInvoiceID().equals(service.getInvoiceID()) &&
        getPropertyAddress().equals(service.getPropertyAddress()) &&
        getMonthly().equals(service.getMonthly()) &&
        getTimesServiced().equals(service.getTimesServiced());
  }

  public int hashCode() {
    return Objects.hash(getInvoiceID(), getPropertyAddress(), getMonthly(), getTimesServiced());
  }

  public String getInvoiceID() {
    return invoiceID;
  }

  public String getPropertyAddress() {
    return propertyAddress;
  }

  public Boolean getMonthly() {
    return monthly;
  }

  public PropertySize getPropertySize() {
    return propertySize;
  }

  public Double getPriceOfService() {
    return priceOfService;
  }

  public Integer getTimesServiced() {
    return timesServiced;

  }
  public void frequencyDiscount() {
    if (monthly == true && timesServiced % TEN_SERVICES != NINE_SERVICES) {
      priceOfService = priceOfService * NINETY_PERCENT;
    }
    if (monthly == true && timesServiced % TEN_SERVICES == NINE_SERVICES) {
      priceOfService = priceOfService * FIFTY_PERCENT;
    }
  }

  public Double calculatePrice() {
    baseFee();
    additionalFee();
    frequencyDiscount();
    return getPriceOfService();
  }

  public String toString() {
    String toString = super.toString();
    return toString;
  }
}
