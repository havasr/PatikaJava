import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the distance(km) you're going:");
        int distance = input.nextInt();

        if (distance > 0) {
            System.out.println("Please enter your age:");
            int age = input.nextInt();
            if (age > 0) {
                System.out.println("Please enter ticket type: 1 for 'One Way' / 2 for 'Two Way'");
                int travelType = input.nextInt();
                if (travelType == 1 || travelType == 2) {
                    double pricePerKm = 0.10;
                    double initialFlightPrice = pricePerKm * distance;
                    double priceOfFlight = 0;

                    if (travelType == 2) {
                        priceOfFlight = (initialFlightPrice * 2) * 0.8;
                    } else {
                        priceOfFlight = initialFlightPrice;
                    }

                    if (age < 12) {
                        priceOfFlight = priceOfFlight * 0.5;
                    } else if (age >= 12 && age <= 24) {
                        priceOfFlight = priceOfFlight * 0.9;
                    } else if (age > 65) {
                        priceOfFlight = priceOfFlight * 0.7;
                    } else {
                        priceOfFlight = priceOfFlight;
                    }

                    System.out.println("You're flight price is " + priceOfFlight);

                } else {
                    System.out.println("Wrong input, try again.");
                }
            } else {
                System.out.println("Wrong input, try again.");
            }
        } else {
            System.out.println("Wrong input, try again.");
        }

    }
}