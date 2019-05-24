package Problem3;

/**
 * This class represents a container/list for food items to be ordered
 */
public class FoodOrderingSystem {
  private Meat meat;
  private Fruit fruit;
  private Vegetable vegetable;
  private Rice rice;
  private Pasta pasta;
  private Integer nonPerishableCount = 250;
  private Integer perishableCount = 100;

  /**
   * @param meat the meat
   * @param fruit the fruit
   * @param vegetable the vegetable
   * @param rice the rice
   * @param pasta the pasta
   */
  public FoodOrderingSystem (Meat meat, Fruit fruit, Vegetable vegetable, Rice rice, Pasta pasta) {
    this.meat = meat;
    this.fruit = fruit;
    this.vegetable = vegetable;
    this.rice = rice;
    this.pasta = pasta;
  }

  /**
   * Get meat information from food ordering system
   * @return meat information from food ordering system
   */
  public Meat getMeat() {
    return meat;
  }

  /**
   * Get meat information from food ordering system
   * @return meat information from food ordering system
   */
  public Fruit getFruit() {
    return fruit;
  }

  /**
   * Get meat information from food ordering system
   * @return meat information from food ordering system
   */
  public Vegetable getVegetable() {
    return vegetable;
  }

  /**
   * Get meat information from food ordering system
   * @return meat information from food ordering system
   */
  public Rice getRice() {
    return rice;
  }

  /**
   * Get meat information from food ordering system
   * @return meat information from food ordering system
   */
  public Pasta getPasta() {
    return pasta;
  }

  /**
   * Get current count of non-perishable items in order
   * @return current count of non-perishable items in order
   */
  public Integer getNonPerishableCount() {
    return nonPerishableCount;
  }

  /**
   * Get current count of perishable items in order
   * @return current count of perishable items in order
   */
  public Integer getPerishableCount() {
    return perishableCount;
  }

  /**
   * Update quantity of perishable food items currently in system to stay under limit
   * @param orderedQuantity amount of perishable items being added to order
   */
  public void reducePerishable(Integer orderedQuantity) {
    perishableCount = perishableCount - orderedQuantity;
  }

  /**
   * Update quantity of non-perishable food items currently in system to stay under limit
   * @param orderedQuantity amount of non-perishable items being added to order
   */
  public void reduceNonPerishable(Integer orderedQuantity) {
    nonPerishableCount = nonPerishableCount - orderedQuantity;
  }
}
