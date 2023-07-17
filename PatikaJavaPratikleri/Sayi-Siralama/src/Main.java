import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.println("First number:");
        a = input.nextInt();

        System.out.println("Second number:");
        b = input.nextInt();

        System.out.println("Third number:");
        c = input.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("Order is: " + a + "<" + b + "<" + c);
            } else {
                System.out.println("Order is: " + a + "<" + c + "<" + b);
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("Order is: " + b + "<" + a + "<" + c);
            } else {
                System.out.println("Order is: " + b + "<" + c + "<" + a);
            }

        } else if ((c < a) && (c < b)) {
            if (a < b) {
                System.out.println("Order is: " + c + "<" + a + "<" + b);
            } else {
                System.out.println("Order is: " + c + "<" + b + "<" + a);
            }

        }

    }
}