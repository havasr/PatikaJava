import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        int sum = 0;

        Scanner input = new Scanner(System.in);


        do {
            System.out.println("Enter number:");
            sayi = input.nextInt();
            if (sayi % 4 == 0 && sayi % 2 == 0) {
                sum += sayi;
            }

        } while (sayi % 2 == 0);


        System.out.println("The sum is: " + sum);

    }
}