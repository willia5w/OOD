package Problem3;

public class Vegetable extends Perishable {
  private String name;

  public Vegetable(String type, Double pricePerUnit, Integer quantityAvailable, Integer orderDate, Integer expirationDate) {
    super(type, pricePerUnit, quantityAvailable, orderDate, expirationDate);
  }
}
