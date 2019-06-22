package edu.neu.ccs.cs5004.problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FleetManagerTest {
  private FleetManager fleetManager;
  private Boat boat;
  private Train train;
  private Bus bus;

  @Before
  public void setUp() throws Exception {
    fleetManager = new FleetManager();
  }

  @Test
  public void driveTest() {
    boat = new Boat("1", 10.0f, 15.0f);
    assertEquals(fleetManager.drive(10, boat), new TripReport(boat, 10.0f, 1));
  }

  @Test
  public void drive1() {
    train = new Train("1", 10.0f, 15.0f);
    assertEquals(fleetManager.drive(300,10, boat), new TripReport(boat, 10.0f, 1));
  }

  @Test
  public void drive2() {
    bus = new Bus("1", 10.0f, 15.0f);
    assertEquals(fleetManager.drive(300, 10, boat), new TripReport(boat, 10.0f, 1));
  }

  @Test
  public void drive3() {
    boat = new Boat("1", 10.0f, 15.0f);
    assertEquals(fleetManager.drive(300, 10, boat), new TripReport(boat, 10.0f, 1));
  }
}