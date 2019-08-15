package edu.neu.khoury.cs5004.problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * This class filters a list of Vehicles to only include those made after 1999.
 */
public class OlderVehiclesFilter {

  private List<Vehicle> vehicles = new ArrayList<>();

  /**
   * Constructor for the OlderVehiclesFilter class.
   * @param vehicles a list of Vehicles
   */
  public OlderVehiclesFilter(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }

  /**
   * Constructor for the OlderVehiclesFilter class.
   *
   * @param vehicle1 first vehicle
   * @param vehicle2 second vehicle
   * @param vehicle3 third vehicle
   */
  public OlderVehiclesFilter(Vehicle vehicle1, Vehicle vehicle2, Vehicle vehicle3){
    this.vehicles.add(vehicle1);
    this.vehicles.add(vehicle2);
    this.vehicles.add(vehicle2);
  }

  /**
   * Filters out older vehicles.
   * @return a vehicle to string list excluding vehicles made after 1999
   */
  public List<String> filterOlderVehicles(){
    List<String> newerVehicles = new ArrayList <>();
    newerVehicles.add(
        vehicles.stream().filter(vehicle -> vehicle.getYear() > 1999).toString());
    return newerVehicles;
  }
}
