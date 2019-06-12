package edu.neu.khoury.cs5004.problem2;


import java.util.Objects;

public class TripReport {
  private Vehicle vehicle;
  private Float distance;
  private Integer duration;


  public TripReport(Vehicle vehicle, Float distance, Integer duration) {
    this.vehicle = vehicle;
    this.distance = distance;
    this.duration = duration;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public Float getDistance() {
    return distance;
  }

  public Integer getDuration() {
    return duration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof TripReport)) return false;
    TripReport that = (TripReport) o;
    return getVehicle().equals(that.getVehicle()) &&
        getDistance().equals(that.getDistance()) &&
        getDuration().equals(that.getDuration());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getVehicle(), getDistance(), getDuration());
  }

}
