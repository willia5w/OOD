package edu.neu.khoury.cs5004.problem1;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class VolkswagenVehiclesFilter {

    private List<Vehicle> vehicles = new ArrayList<>();

    public VolkswagenVehiclesFilter(List<Vehicle> vehicles) {
      this.vehicles = vehicles;
    }

    public VolkswagenVehiclesFilter(Vehicle vehicle1, Vehicle vehicle2, Vehicle vehicle3){
      this.vehicles.add(vehicle1);
      this.vehicles.add(vehicle2);
      this.vehicles.add(vehicle3);
    }

    public List<String> filterVWvehicles(){
      List<String> vwOnly = new ArrayList<>();
      vwOnly.add(
          vehicles.stream().collect(
              Collectors.groupingBy(
                  Function.identity())).toString());
      return vwOnly;
    }
}
