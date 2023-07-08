import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km ;
        double toplamUcret;

        System.out.println("Kaç km gittiniz?");
        Scanner input = new Scanner(System.in);
        km = input.nextInt();

        toplamUcret = 10 + (km * 2.20);

        System.out.println(toplamUcret > 20 ? toplamUcret : 20);
    }
}