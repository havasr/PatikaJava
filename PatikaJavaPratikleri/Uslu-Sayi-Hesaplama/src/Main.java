import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k,result;

        Scanner input = new Scanner(System.in);
        System.out.println("Base number:");
        n = input.nextInt();

        System.out.println("Exponent number:");
        k = input.nextInt();
        result = 1;

        for(int i = 1; i <= k; i++){
            result *= n;
        }

        System.out.println("The result is:\n" + result);

    }
}