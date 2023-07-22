import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = input.nextInt();
        int digitNum = 0, digitValue = 0, sum = 0;

        while (number != 0){
            digitValue = number % 10;
            sum += digitValue;
            number /= 10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}