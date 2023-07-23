import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = input.nextInt();


        for(int i = 1; i < num; i++){
            if (num%i == 0){
                sum +=i;
                }
        }
        if(num==sum){
            System.out.println("This number is a perfect number!");
        } else{
            System.out.println("This number is not a perfect number.");
        }
    }
}