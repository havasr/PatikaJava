import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int k = input.nextInt();

        for (int i = 0; i <= k; i++){
            if(i%4 == 0 && i%3 == 0){
                System.out.println(i);
            }
        }
    }
}