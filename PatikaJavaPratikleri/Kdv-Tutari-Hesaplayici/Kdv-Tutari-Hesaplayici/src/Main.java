import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double fiyat, kdvOrani = 0, kdvTutari;
        Scanner input = new Scanner(System.in);
        System.out.println("Ürün fiyatını giriniz:");
        fiyat = input.nextDouble();

        if (fiyat > 0 && fiyat < 1000) {
            kdvOrani = 0.18;
        } else if (fiyat >= 1000) {
            kdvOrani = 0.08;
        }
        kdvTutari = fiyat * kdvOrani;

        System.out.println("KDV'li fiyat: " + (fiyat + kdvTutari));
        System.out.println("KDV tutarı: " + (kdvTutari));

    }
}