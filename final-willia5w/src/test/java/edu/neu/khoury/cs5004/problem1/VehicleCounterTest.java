package edu.neu.khoury.cs5004.problem1;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class VehicleCounterTest {
  private Vehicle vehicle1;
  private Vehicle vehicle2;
  private Vehicle vehicle3;
  private Vehicle vehicle4;
  ArrayList <Vehicle> vehicleList = new ArrayList <>();


  @Before
  public void setUp() throws Exception {
    vehicle1 = new Vehicle("ford", "focus", 2000, Color.gray);
    vehicle2 = new Vehicle("chevy", "silverado", 2010, Color.pink);
    vehicle3 = new Vehicle("honda", "accord", 1988, Color.yellow);
    vehicle4 = new Vehicle("ford", "taurus", 1997, Color.red);
    vehicleList.add(vehicle1);
    vehicleList.add(vehicle2);
    vehicleList.add(vehicle3);
    vehicleList.add(vehicle4);
  }

  @Test
  public void countVehicles() {
    Map<Vehicle, Long> testVehicleMap = VehicleCounter.countVehicles(vehicleList);
    Long numFords = 2L;
    assertEquals(numFords, testVehicleMap.get(vehicle1));
  }
}