import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00, toplamUcret;

        Scanner input = new Scanner(System.in);
        System.out.println("Armut - Kaç Kilo?");
        armutKilo = input.nextInt();

        System.out.println("Elma - Kaç Kilo?");
        elmaKilo = input.nextInt();

        System.out.println("Domates - Kaç Kilo?");
        domatesKilo = input.nextInt();

        System.out.println("Muz - Kaç Kilo?");
        muzKilo = input.nextInt();

        System.out.println("Patlıcan - Kaç Kilo?");
        patlicanKilo = input.nextInt();

        toplamUcret = (armutFiyat * armutKilo) + (elmaFiyat * elmaKilo) + (domatesFiyat * domatesKilo) + (muzFiyat * muzKilo) + (patlicanFiyat * patlicanKilo);
        System.out.println("Toplam Ücret: " + toplamUcret);
    }
}