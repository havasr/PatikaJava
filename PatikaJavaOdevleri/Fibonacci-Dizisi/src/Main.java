import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        int firstNumber = 0;
        int secondNumber= 1;

        System.out.println(n+ " element fibonacci series: ");

        for(int i = 1; i <= n; i++){
            System.out.print(firstNumber+" ");
            int sum = firstNumber + secondNumber;
            firstNumber=secondNumber;
            secondNumber=sum;

        }
    }
}