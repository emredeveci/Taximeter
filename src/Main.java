import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        - This code will calculate a taxi fare based on the kilometers entered (2.20 Turkish Liras per kilometer)
        - The meter opens up with 10 Turkish Liras (initial charge)
        - The lowest fare cannot be lower than 20 Turkish Liras (minimum fare)
        */

        double pricePerKilometer = 2.20, initialCharge = 10, minimumFare = 20, distance = 0, fare = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance traveled in kilometers: ");
        distance = input.nextDouble();

        fare = initialCharge + (distance * pricePerKilometer);

        fare = Math.max(fare, minimumFare);
        System.out.println("Your taxi fare is: " + fare + " Turkish Liras");
    }
}
