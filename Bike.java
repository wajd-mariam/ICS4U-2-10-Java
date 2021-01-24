/*
* The Bike.java is a subclass for Vehicles.java file.
* 
* @author  Wajd Mariam
* @version 1.0
* @since   2021/01/4
*/

// Airplane class
public class Bike extends Vehicles {
  
  // fields
  private float cadence;
  private int tireNumber;
  
  /**
   * Method that calculates the car speed while accelerating.
   */ 
  public Bike(String colorBike) {
    super(colorBike);
    this.color = colorBike;
    cadence = 0;
    this.tireNumber = 2;
  }  

  // Method to calculate cadence
  public float cadenceGetter() {
    cadence = (speedGetter() * 8);
    return cadence;
  }
  
  // Method returning the bell ring noise.
  public String ringBell() {
    return "RING RING";
  }
    
  // Method returning the number of tires:
  public String bikeTires() {
    return "Your bike got " + this.tireNumber + " tires";
  }
}
