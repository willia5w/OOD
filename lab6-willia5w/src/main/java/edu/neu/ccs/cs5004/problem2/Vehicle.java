package edu.neu.khoury.cs5004.problem2;

import java.util.Objects;

public abstract class Vehicle implements IVehicle{
  private String id;
  private Float avgSpeed;
  private Float maxSpeed;

  public Vehicle(String id, Float avgSpeed, Float maxSpeed) {
    this.id = id;
    this.avgSpeed = avgSpeed;
    this.maxSpeed = maxSpeed;
  }

  public String getId() {
    return id;
  }

  public Float getAvgSpeed() {
    return avgSpeed;
  }

  public Float getMaxSpeed() {
    return maxSpeed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Vehicle)) return false;
    Vehicle vehicle = (Vehicle) o;
    return getId().equals(vehicle.getId()) &&
        getAvgSpeed().equals(vehicle.getAvgSpeed()) &&
        getMaxSpeed().equals(vehicle.getMaxSpeed());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getAvgSpeed(), getMaxSpeed());
  }
}
