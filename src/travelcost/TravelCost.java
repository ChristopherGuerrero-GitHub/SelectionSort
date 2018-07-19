
package travelcost;
import java.util.Scanner;

/**
 *
 * @author Christopher
 */
public class TravelCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //This program will display messages to user to get input distance,
        //mpg of vehicle, and price per gallon. Then calculate totalcost for trip.
        
        
        double distance, mpg, pricePerGallon, totalCost;
        String vehicleType;
        
        Scanner in = new Scanner(System.in);
                      
        System.out.println("Enter the total distance in miles: ");
        distance = in.nextDouble();
        
        System.out.println("Enter the mpg for the vehicle: ");
        mpg = in.nextDouble();
        
        System.out.println("Enter the price of one gallon of gas: ");
        pricePerGallon = in.nextDouble();
        
        totalCost = (distance/mpg)*pricePerGallon;
        
        System.out.println("Enter the vehicle type: ");
        vehicleType = in.next();
        
        System.out.printf("The trip is going to cost $%5.2f since you are driving"+
                " a " + vehicleType, totalCost);
        System.out.println();
        
                
    }
    
}
