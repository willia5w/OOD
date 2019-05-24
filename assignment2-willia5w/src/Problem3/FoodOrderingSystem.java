package Problem3;

/**
 * This class represents a container/list for food items to be ordered
 */
public class FoodOrderingSystem {
  private Integer nonPerishableCount = 250;
  private Integer perishableCount = 100;

  public void reducePerishable(Integer orderedQuantity) {
    perishableCount = perishableCount - orderedQuantity;
  }

  public void reduceNonPerishable(Integer orderedQuantity) {
    nonPerishableCount = nonPerishableCount - orderedQuantity;
  }
}
