import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birinciKenar, ikinciKenar, ucuncuKenar, cevreYarisi;
        double alan;

        System.out.println("Üçgenin alanını hesaplamak için");
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen birinci kenar uzunluğunu giriniz: ");
        birinciKenar = input.nextInt();
        System.out.println("Lütfen ikinci kenar uzunluğunu giriniz: ");
        ikinciKenar = input.nextInt();
        System.out.println("Lütfen üçüncü kenar uzunluğunu giriniz: ");
        ucuncuKenar = input.nextInt();

        cevreYarisi = (birinciKenar + ikinciKenar + ucuncuKenar) / 2;
        alan = Math.sqrt(cevreYarisi * (cevreYarisi - birinciKenar) * (cevreYarisi - ikinciKenar) * (cevreYarisi - ucuncuKenar));
        System.out.println("Üçgenin alanı: " + alan);

    }
}