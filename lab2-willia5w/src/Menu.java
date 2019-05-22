package LabAssignment2And3;

/**
 * Class Menu contains a variety of foods that make up a menu.
 *
 */
public class Menu {
  private String meals;
  private String desserts;
  private String beverages;
  private String drinks;

  /**
   * Creates a menu given a meal, dessert, beverage, and drink.
   *
   * @param meals the meals on the menu
   * @param desserts the desserts on the menu
   * @param beverages the beverages on the menu
   * @param drinks the drinks on the menu
   */
  public Menu(String meals, String desserts, String beverages, String drinks) {
    this.meals = meals;
    this.desserts = desserts;
    this.beverages = beverages;
    this.drinks = drinks;
  }


  /**
   * @return the meal on the menu
   */
  public String getMeals() {
    return meals;
  }

  /**
   * @param meals updates the meal on the menu
   */
  public void setMeals(String meals) {
    this.meals = meals;
  }

  /**
   * @return the dessert on the menu
   */
  public String getDesserts() {
    return desserts;
  }

  /**
   * @param desserts updates the dessert on the men
   */
  public void setDesserts(String desserts) {
    this.desserts = desserts;
  }

  /**
   * @return the beverage on the menu
   */
  public String getBeverages() {
    return beverages;
  }

  /**
   * @param beverages updates the beverage on the men
   */
  public void setBeverages(String beverages) {
    this.beverages = beverages;
  }

  /**
   * @return the drink on the menu
   */
  public String getDrinks() {
    return drinks;
  }

  /**
   * @param drinks updates the drink on the menu
   */
  public void setDrinks(String drinks) {
    this.drinks = drinks;
  }
}
