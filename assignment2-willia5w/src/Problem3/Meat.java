package Problem3;

public class Meat extends Perishable {
  private String name;

  public Meat(String type, Double pricePerUnit, Integer quantityAvailable, Integer orderDate, Integer expirationDate,
              String name) {
    super(type, pricePerUnit, quantityAvailable, orderDate, expirationDate);
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
