package LabAssignment2And3;

/**
 * Class Restaurant contains information about a restaurant and it's name, address, and status.
 *
 */
public class Restaurant {
  private String name;
  private String address;
  private Boolean openClosed;
  private Menu menu;

  /**
   * Creates a restaurant given it's name, address, and status.
   *
   * @param name the restaurant's name
   * @param address the restaurant's address
   * @param openClosed the restaurant's status
   * @param menu the restaurant's status
   */
  public Restaurant (String name, String address, Boolean openClosed, Menu menu) {
    this.name = name;
    this.address = address;
    this.openClosed = openClosed;
  }

  /**
   * @return the name of the restaurant
   */
  public String getName() {
    return name;
  }

  /**
   * @param name sets the name of the restaurant
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the address of the restaurant
   */
  public String getAddress() {
    return address;
  }

  /**
   * @param address sets the address of the restaurant
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * @return the status of the restaurant
   */
  public Boolean getOpenClosed() {
    return openClosed;
  }

  /**
   * @param openClosed sets the status of the restaurant
   */
  public void setOpenClosed(Boolean openClosed) {
    this.openClosed = openClosed;
  }

  /**
   * @return the status of the restaurant
   */
  public Menu getMenu() {
    return menu;
  }

  /**
   * @param menu sets the status of the restaurant
   */
  public void setMenu(Menu menu) {
    this.menu = menu;
  }
}
