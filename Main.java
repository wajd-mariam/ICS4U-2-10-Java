/*
* The Main.java program lets the user change truck and bike's 
* information, and take them for a ride.
* 
* @author  Wajd Mariam
* @version 1.0
* @since   2021/01/4
*/

// Imports Java Classes:
import java.util.Scanner;


class Main {
  public static void main(String[] args) {
      
    // Declaring variables used:
    String licensePlate = "";
    String vehicleColor = "";
    int userSpeed = 0;
    
    // Try Catch Statement for catching input error:
    try {
      
      // Declaring Scanner:
      final Scanner licenseInput = new Scanner(System.in);
      final Scanner colorInput = new Scanner(System.in);
      final Scanner speedInput = new Scanner(System.in);
      
      // Input / Process / Output

      // Truck
      
      // Getting truck color:
      System.out.print("Enter the color of your truck: ");
      vehicleColor = colorInput.nextLine();
      
      // Initializing user's truck:
      Truck userTruck = new Truck(vehicleColor);
      // Printing truck's color:
      System.out.println("Your truck's color is: " + userTruck.colorGetter());
      
      
      // Getting bike color:
      System.out.print("Enter the color of your bike: ");
      vehicleColor = colorInput.nextLine();
      
      // Initializing user's bike:
      Bike userBike = new Bike(vehicleColor);
      // Printing bike's color:
      System.out.println("Your Bike's color is: " + userBike.colorGetter());
      
      // Setting license plate number for truck:
      System.out.println("");
      System.out.println("Enter your truck's license plate number: ");
      licensePlate = licenseInput.nextLine();
      // Setting the input:
      userTruck.licensePlateSetter(licensePlate);
      // Returning the license plate number: 
      System.out.println("Your truck's license plate number is: " + userTruck.licensePlateGetter());
      
      // Returning number of tires:
      // Truck:
      System.out.println("");
      System.out.println("Number of tires:");
      System.out.println(userTruck.truckTires());
      // Bike: 
      System.out.println(userBike.bikeTires());
      
      // Changing speed of the truck:
      // Acceleration
      System.out.println("");
      System.out.println("Go take your truck for a ride!");
      System.out.println("How fast do you want to go? in KM/H");
      userSpeed = speedInput.nextInt(); 
      // Returning speed:
      System.out.println("Your truck is travelling at " 
                         + userTruck.accelerationCalculation(userSpeed) + " KM/H");
      
      // Deceleration:
      System.out.println("There are traffic up head!");
      System.out.println("SLOW DOWN!");
      System.out.println("How much do you want to decrease your speed? in KM/H");
      userSpeed = speedInput.nextInt(); 
      // Honking the air horn:
      System.out.println("Honking the air horn: " + userTruck.provideAir());
      // Returning speed:
      System.out.println("Your truck is travelling at "
                         + userTruck.decreaseCalculation(userSpeed) + "KM/H");

      // Changing speed of the truck:
      // Acceleration
      System.out.println("");
      System.out.println("Now take your bike for a ride");
      System.out.println("How fast do you want to go? in KM/H");
      userSpeed = speedInput.nextInt(); 
      // Returning speed:
      System.out.println("Your bike is now travelling at " 
                         + userBike.accelerationCalculation(userSpeed) + "KM/H");
      // Returning cadence:
      System.out.println("Bike's cadence now is: " + userBike.cadenceGetter() + " RPM");
      
      // Deceleration:
      System.out.println("There are people up head!");
      System.out.println("SLOW DOWN!");
      System.out.println("How much do you want to decrease your speed? in KM/H");
      userSpeed = speedInput.nextInt(); 
      // Ringing the bell:
      System.out.println("Ringing the bell: " + userBike.ringBell());
      // Returning speed:
      System.out.println("Your bike is now travelling at "
                         + userBike.decreaseCalculation(userSpeed) + "KM/H");
      // Returning cadence:
      System.out.println("Bike's cadence now is: " + userBike.cadenceGetter() + " RPM");
      
    // Catches and tells the user what error occurred:
    } catch (NullPointerException e) {
      System.out.println("");
      System.out.println("ERROR: Your vehicles isn't able to do such thing!");
      // Error Catch Statement:
    } catch (Exception e) {
      System.out.print("");
      System.out.println("ERROR."); 
    }
  }
}
