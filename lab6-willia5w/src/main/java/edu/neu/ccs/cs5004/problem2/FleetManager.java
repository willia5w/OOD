package edu.neu.ccs.cs5004.problem2;

public class FleetManager implements IFleetManager{

  @Override
  public TripReport drive(float distance, Vehicle vehicle) {
    Integer duration = Math.round(distance/vehicle.getAvgSpeed());
    return new TripReport(vehicle, distance, duration);
  }

  public TripReport drive(float speed, float distance, Train train) {
    Integer duration;
    if (speed > train.getMaxSpeed()) {
      duration = Math.round(distance/train.getMaxSpeed());
    } else {
      duration = Math.round(distance/train.getAvgSpeed());
    }
    return new TripReport(train, distance, duration);
  }

  public TripReport drive(float speed, float distance, Bus bus) {
    Integer duration;
    if (speed > bus.getMaxSpeed()) {
      duration = Math.round(distance/bus.getMaxSpeed());
    } else {
      duration = Math.round(distance/bus.getAvgSpeed());
    }
    return new TripReport(bus, distance, duration);
  }

  public TripReport drive(float speed, float distance, Boat boat) {
    Integer duration;
    if (speed > boat.getMaxSpeed()) {
      duration = Math.round(distance/boat.getMaxSpeed());
    } else {
      duration = Math.round(distance/boat.getAvgSpeed());
    }
    return new TripReport(boat, distance, duration);
  }
}
