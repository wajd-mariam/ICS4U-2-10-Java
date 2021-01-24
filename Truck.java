/*
* The Truck.java is a subclass for Vehicles.java file.
* 
* @author  Wajd Mariam
* @version 1.0
* @since   2021/01/4
*/

// Truck class
public class Truck extends Vehicles {

  // fields
  private String licensePlateNumber;
  private int tireNumber;
  
  /**
   * Method that calculates the car speed while accelerating.
   */
  public Truck(String colorTruck) {
    super(colorTruck);
    this.color = colorTruck;
    licensePlateNumber = "";
    this.tireNumber = 4;
  }  

  // Setting license plate number Method
  public void licensePlateSetter(String licensePlate) {
    this.licensePlateNumber = licensePlate;
  }
  
  // Getter to return license plate number:
  public String licensePlateGetter() {
    return this.licensePlateNumber;
  }
  
  // Method returning the honk noise.
  public String provideAir() {
    return "HONK HONK";
  }
    
  // Method returning the number of tires:
  public String truckTires() {
    return "Your truck got " + this.tireNumber + " tires";
  }
}
