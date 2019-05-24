package Problem3;

/**
 * Represents a non-perishable food item and contains information such as price per unit,
 * quantity currently available, and the maximum quantity allowed for order
 *
 */
public abstract class NonPerishable {
  public String type;
  public Double pricePerUnit;
  public Integer quantityAvailable;
  private static Integer maxOrderQuantity = 250;

  /**
   * Creates a NonPerishable food object given it's type, price per unit,
   * and available quantity
   *
   * @param type the type of the non-perishable food item
   * @param pricePerUnit the price per unit of the non-perishable food item
   * @param quantityAvailable the available quantity of the non-perishable food item
   */
  public NonPerishable(String type, Double pricePerUnit, Integer quantityAvailable) {
    this.type = type;
    this.pricePerUnit = pricePerUnit;
    this.quantityAvailable = quantityAvailable;
  }

  /**
   * Get food type
   * @return food type
   */
  public String getType() {
    return type;
  }

  /**
   * Get food price per unit
   * @return  food price per unit
   */
  public Double getPricePerUnit() {
    return pricePerUnit;
  }

  /**
   * Get quantity of food item available
   * @return quantity of food item available
   */
  public Integer getQuantityAvailable() {
    return quantityAvailable;
  }

  /**
   * Get maximum allowed quantity of food item available for order
   * @return maximum allowed quantity of food item available for order
   */
  public static Integer getMaxOrderQuantity() {
    return maxOrderQuantity;
  }


}
