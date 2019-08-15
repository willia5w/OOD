package edu.neu.khoury.cs5004.problem1;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a list of Vehicles, this class gets counts for each unique make in the list.
 */
public class VehicleCounter {

  /**
   * Returns a Map of the unique vehicle makes in the list with their count of appearance in the list.
   * @param vehicles a list of vehicles
   * @return a Map containing each unique vehicle make in the list as keys and their count as their value
   */
    public static Map<Vehicle, Long> countVehicles(List<Vehicle> vehicles) {
      return vehicles.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
