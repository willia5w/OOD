package Problem3;

/**
 * Represents a perishable food item and contains information such as type, price per unit,
 * quantity currently available, and the maximum quantity allowed for order
 *
 */
public abstract class Perishable extends NonPerishable{
  private String type;
  private Double pricePerUnit;
  private Integer quantityAvailable;
  private static Integer maxOrderQuantity = 100;
  private static Integer expirationTolerance = 10;
  private Integer orderDate;
  private Integer expirationDate;

  /**
   * Creates a Perishable food object given it's type, price per unit,
   * and available quantity
   *
   * @param type the type of the perishable food item
   * @param pricePerUnit the price per unit of the perishable food item
   * @param quantityAvailable the available quantity of the perishable food item
   */
  public Perishable(String type, Double pricePerUnit, Integer quantityAvailable,
                    Integer orderDate, Integer expirationDate) {
    this.type = type;
    this.pricePerUnit = pricePerUnit;
    this.quantityAvailable = quantityAvailable;
    this.orderDate = orderDate;
    this.expirationDate = expirationDate;
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

  /**
   * Get order date of the food item
   * @return order date of the food item
   */
  public Integer getOrderDate() {
    return orderDate;
  }

  /**
   * Get expiration date of the food item
   * @return
   */
  public Integer getExpirationDate() {
    return expirationDate;
  }

  public Boolean checkExpiration(Integer orderDate, Integer expirationDate) {
    try {
      if (expirationDate - orderDate >= expirationTolerance)
    }
    check {

    }
}
