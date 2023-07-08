import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, alpha;
        double pi = 3.14, alan;

        System.out.println("Dairenin diliminin alanını bulmak için:");
        Scanner input = new Scanner(System.in);

        System.out.println("Yarıçapı giriniz:");
        r = input.nextInt();

        System.out.println("Merkez açısının ölçüsünü giriniz:");
        alpha = input.nextInt();

        alan = (pi * (r*r) * alpha) / 360;
        System.out.println("Daire diliminin alanı: " + alan);

    }
}