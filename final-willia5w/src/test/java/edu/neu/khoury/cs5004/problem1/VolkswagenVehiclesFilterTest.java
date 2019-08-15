package edu.neu.khoury.cs5004.problem1;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.*;

public class VolkswagenVehiclesFilterTest {
  private VolkswagenVehiclesFilter volkswagenVehiclesFilter;
  private Vehicle vehicle1;
  private Vehicle vehicle2;
  private Vehicle vehicle3;

  @Before
  public void setUp() throws Exception {
    vehicle1 = new Vehicle("volkswagen", "jetta", 2018, Color.red);
    vehicle2 = new Vehicle("chevy", "silverado", 2010, Color.pink);
    vehicle3 = new Vehicle("volkswagen", "beetle", 1988, Color.yellow);
    volkswagenVehiclesFilter = new VolkswagenVehiclesFilter(vehicle1, vehicle2, vehicle3);
  }

  @Test
  public void filterVwVehicles() {
    List vwList = (List) volkswagenVehiclesFilter.filterVWvehicles();
    String expectedVwString = vehicle3.toString();
    String actualVwString = vwList.getItem(0);
    assertEquals(actualVwString, expectedVwString);
  }
}