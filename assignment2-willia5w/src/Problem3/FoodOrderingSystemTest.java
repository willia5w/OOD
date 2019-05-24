package Problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FoodOrderingSystemTest {
  private Meat meat;
  private Fruit fruit;
  private Vegetable vegetable;
  private Rice rice;
  private Pasta pasta;
  private Integer nonPerishableCount = 250;
  private Integer perishableCount = 100;
  private FoodOrderingSystem foodOrderingSystem;

  @Before
  public void setUp() throws Exception {
    meat = new Meat("Turkey", 1.0, 1, 1, 4);
    fruit = new Fruit("Cherry", 1.0, 1, 1, 4);
    vegetable = new Vegetable("Cucumber", 1.0, 1, 1, 4);
    rice = new Rice("Wild", 1.0, 1);
    pasta = new Pasta("Bowtie", 1.0, 1);
    foodOrderingSystem = new FoodOrderingSystem(meat, fruit, vegetable, rice, pasta);
  }

  @Test
  public void getMeat() {
    Meat expectedMeat = foodOrderingSystem.getMeat();
    assertEquals(1, expectedMeat.getQuantityAvailable(),0);
  }

  @Test
  public void getFruit() {
    Vegetable  expectedVegetable = foodOrderingSystem.getVegetable ();
    assertEquals(1, expectedVegetable .getQuantityAvailable(),0);
  }

  @Test
  public void getVegetable() {
    Fruit expectedFruit = foodOrderingSystem.getFruit();
    assertEquals(1, expectedFruit.getQuantityAvailable(),0);
  }

  @Test
  public void getRice() {
    Rice expectedRice = foodOrderingSystem.getRice();
    assertEquals(1, expectedRice.getQuantityAvailable(),0);
  }

  @Test
  public void getPasta() {
    Pasta expectedPasta = foodOrderingSystem.getPasta();
    assertEquals(1, expectedPasta.getQuantityAvailable(),0);
  }

  @Test
  public void getNonPerishableCount() {
  }

  @Test
  public void getPerishableCount() {
  }

  @Test
  public void reducePerishable() {
  }

  @Test
  public void reduceNonPerishable() {
  }
}