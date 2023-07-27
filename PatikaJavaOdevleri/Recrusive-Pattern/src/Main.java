import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        pattern(number, false, number);
    }
    public static int pattern(int num, boolean increase, int initialNum) {
        int variable;
        if (num > initialNum && increase) {
            return 1;
        }
        if (num <= 0) {
            increase = true;
        }
        if (increase) {
            variable = 5;
        } else {
            variable = -5;
        }
        System.out.print(num + " ");
        return pattern(num+variable, increase, initialNum);
    }
}