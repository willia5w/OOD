package Problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SmartThermostatTest {
  private Bathroom bathroom;
  private Bedroom bedroom;
  private LivingRoom livingRoom;
  private SmartThermostat smartThermostat;


  @Before
  public void setUp() throws Exception {
    bathroom = new Bathroom(60, 58,70);
    bedroom = new Bedroom(60, 60,68);
    livingRoom = new LivingRoom(60, 60,72);
    smartThermostat = new SmartThermostat(bathroom,
        bedroom, livingRoom);
  }

  @Test
  public void getBathroom() {
    Bathroom expectedBathroom = smartThermostat.getBathroom();
    assertEquals(expectedBathroom.getCurrentTemp(), bathroom.getCurrentTemp());
  }

  @Test
  public void getBedroom() {
    Bedroom expectedBedroom = smartThermostat.getBedroom();
    assertEquals(expectedBedroom.getCurrentTemp(), bedroom.getCurrentTemp());
  }

  @Test
  public void getLivingRoom() {
    LivingRoom expectedLivingRoom = smartThermostat.getLivingRoom();
    assertEquals(expectedLivingRoom.getCurrentTemp(), livingRoom.getCurrentTemp());
  }

  @Test
  public void setHouseTemp() {
  }
}