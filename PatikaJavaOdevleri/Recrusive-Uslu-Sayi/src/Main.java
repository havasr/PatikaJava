import java.util.Scanner;

public class Main {

    static int expo(int n, int a){
        if (a==1){
            return n;
        }
        return expo(n, a-1) * n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = input.nextInt();

        System.out.println("Result is: "+ expo(firstNumber, secondNumber));


    }
}