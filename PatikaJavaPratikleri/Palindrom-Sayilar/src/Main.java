import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        if (isPalindrom(num)){
            System.out.println("The number "+num+" is a palindrom number");
        } else {
            System.out.println("The number "+num+" is not a palindrom number");
        }
    }
}