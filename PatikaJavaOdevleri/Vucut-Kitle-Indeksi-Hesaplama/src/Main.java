import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kilo;
        double boy,indeks;

        System.out.println("Vücut Kitle İndeksi için");

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu (kg) giriniz:");
        kilo = input.nextInt();

        System.out.println("Lütfen boyunuzu (m) giriniz:");
        boy = input.nextDouble();

        indeks = kilo / (boy * boy);
        System.out.println("Vücut indeksiniz: " + indeks);

    }
}