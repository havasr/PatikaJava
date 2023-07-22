import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        System.out.println("Here, a diamond for you.");

        for(int i=(n-(n/3));i <=n;i++) {
            for(int j=1;j <=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k <=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 0; i--) {
            for (int k = 1; k <= (n-i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}