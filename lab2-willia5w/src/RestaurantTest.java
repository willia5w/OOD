package LabAssignment2And3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RestaurantTest {
  private Menu menu;
  private Restaurant restaurant;

  @Before
  public void setUp() throws Exception {
    menu = new Menu("Pizza", "Cake", "Soda", "Beer");
    restaurant = new Restaurant("Dan's", "Seattle", Boolean.FALSE, menu);
  }

  @Test
  public void getName() {
    assertEquals("Dan's", restaurant.getName());
  }

  @Test
  public void setName() {
    String newName = "Joe's";
    restaurant.setName(newName);
    assertEquals("Joe's", restaurant.getName());
  }

  @Test
  public void getAddress() {
    assertEquals("Seattle", restaurant.getAddress());
  }

  @Test
  public void setAddress() {
    String newAddress = "NYC";
    restaurant.setAddress(newAddress);
    assertEquals("NYC", restaurant.getAddress());
  }

  @Test
  public void getOpenClosed() {
    assertEquals(Boolean.FALSE, restaurant.getOpenClosed());
  }

  @Test
  public void setOpenClosed() {
    Boolean newStatus = Boolean.TRUE;
    restaurant.setOpenClosed(newStatus);
    assertEquals(true, restaurant.getOpenClosed());
  }

//  @Test
//  public void getMenu() {
//    Menu currentMenu = restaurant.getMenu();
//    assertEquals("Pizza", currentMenu.getMeals());
//  }

  @Test
  public void setMenu() {
    Menu newMenu = new Menu("Burger", "Icecream", "Juice", "Wine");
    assertEquals("Burger", newMenu.getMeals());
  }
}