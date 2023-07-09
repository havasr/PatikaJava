import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, secim;
        double sonuc = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz:");
        n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz:");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                sonuc = (n1 + n2);
                break;
            case 2:
                sonuc = (n1 - n2);
                break;
            case 3:
                sonuc = (n1 * n2);
                break;
            case 4:
                sonuc = (n1 / n2);
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
                break;
        }

        System.out.println("Sonuç: " + sonuc);
    }
}