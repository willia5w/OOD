package LabAssignment2And3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MenuTest {
  private Menu menu;

  @Before
  public void setUp() throws Exception {
    menu = new Menu("Pizza", "Cake", "Soda", "Beer");
  }

  @Test
  public void getMeals() {
    assertEquals("Pizza", menu.getMeals());
  }

  @Test
  public void setMeals() {
    String newMeal = "Burger";
    menu.setMeals(newMeal);
    assertEquals("Burger", menu.getMeals());
  }

  @Test
  public void getDesserts() {
    assertEquals("Cake", menu.getDesserts());
  }

  @Test
  public void setDesserts() {
    String newDessert = "Icecream";
    menu.setDesserts(newDessert);
    assertEquals("Icecream", menu.getDesserts());
  }

  @Test
  public void getBeverages() {
    assertEquals("Soda", menu.getBeverages());
  }

  @Test
  public void setBeverages() {
    String newBeverages = "Juice";
    menu.setBeverages(newBeverages);
    assertEquals("Juice", menu.getBeverages());
  }

  @Test
  public void getDrinks() {
    assertEquals("Beer", menu.getDrinks());
  }

  @Test
  public void setDrinks() {
    String newDrinks = "Wine";
    menu.setDrinks(newDrinks);
    assertEquals("Wine", menu.getDrinks());
  }
}