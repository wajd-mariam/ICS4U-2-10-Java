/*
* The Vehicles.java is a superclass in the Main.java Program
* 
* @author  Wajd Mariam
* @version 1.0
* @since   2021/01/04
*/

abstract class Vehicles {
  
  // Creating Fields
  public String color;
  private float speed;
  private int maxSpeed;

  /**
   * Constructor.
   */  
  public Vehicles(String colorInput) {
    this.color = colorInput;
    this.speed = 0;
    this.maxSpeed = 120;
  }
  
  /**
   * Setter for color.
   */
  public void colorSetter(String userColor) {
    color = userColor;
  }
  
  /**
   * Getters for color.
   */
  public String colorGetter() {
    return color;
  }
  
  /**
   * Getter for the speed.
   */
  public float speedGetter() {
    return this.speed;
  }
  
  /**
   * Method that calculates the car speed while accelerating.
   */ 
  public float accelerationCalculation(int speedIncrease) throws Exception {
    // If speed is faster than max speed:
    if ((this.speed + speedIncrease) > this.maxSpeed) {
      throw null;
    } else {
      this.speed = this.speed + speedIncrease;
    } 
    return this.speed;
  }
  
  /**
   * Method that calculates the car speed while deceleration.
   */ 
  public float decreaseCalculation(int speedDecrease) throws Exception {
    // If speed is slower than 0:
    if ((this.speed - speedDecrease) < 0) {
      throw null;
    } else {
      this.speed = this.speed - speedDecrease; 
    } 
    return this.speed;
  }
}
