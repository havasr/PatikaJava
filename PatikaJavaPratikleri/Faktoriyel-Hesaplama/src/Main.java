import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNum = input.nextInt();

        System.out.println("Enter second number:");
        int secondNum = input.nextInt();

        long facFirstNum = 1;
        long facSecondNum = 1;
        long facSubNum = 1;


        for (int i = 1; i <= firstNum; i++){
            facFirstNum = facFirstNum * i;
        }

        System.out.println("The factorial of the first number is: "+facFirstNum );

        for (int j = 1; j <= secondNum; j++){
            facSecondNum = facSecondNum * j;
        }

        System.out.println("The factorial of the second number is: "+facSecondNum );


        for (int k = 1; k <= (firstNum-secondNum); k++){
            facSubNum = facSubNum * k;
        }

        long combination = facFirstNum/(facSecondNum*(facSubNum));

        System.out.println("The result is for C("+firstNum+","+secondNum+") is: "+ combination);

    }
}