import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 0, digitNum = 0, numCount = 0;

        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        while (a != 0) {
            a /= 10;
            numCount++;
        }
        digitNum = numCount;
        System.out.println("Number of digits is: " + digitNum);
    }
}