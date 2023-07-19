import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        num = input.nextInt();
        do {
            i *= 4;
            j *= 5;
            if (num >= i && num >= j) {
                System.out.println(i);
                System.out.println(j);
            }
        }
        while (num >= i && num >= j);
    }
}