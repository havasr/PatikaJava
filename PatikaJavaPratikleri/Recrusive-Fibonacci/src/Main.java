import java.util.Scanner;

public class Main {
    static int fib(int n){
        if (n==1 || n==2){
            return 1;
        }
        return  fib(n-1)+ fib(n-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        System.out.println("The Fibonacci element is: " + fib(num));


    }
}