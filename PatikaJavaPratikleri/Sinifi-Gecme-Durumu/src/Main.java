import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, gecmeNotu = 55, toplamNot = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz:");
        mat = input.nextInt();
        if (mat > 0 && mat <= 100) {
            toplamNot += mat;
        } else {
            System.out.println("Matematik notunu hatalı girdiniz. Ortalamaya dahil edilmeyecektir.");
        }

        System.out.println("Fizik notunuz:");
        fizik = input.nextInt();
        if (fizik > 0 && fizik <= 100) {
            toplamNot += fizik;
        } else {
            System.out.println("Fizik notunu hatalı girdiniz. Ortalamaya dahil edilmeyecektir.");
        }

        System.out.println("Türkçe notunuz:");
        turkce = input.nextInt();
        if (turkce > 0 && turkce <= 100) {
            toplamNot += turkce;
        } else {
            System.out.println("Türkçe notunu hatalı girdiniz. Ortalamaya dahil edilmeyecektir.");
        }

        System.out.println("Kimya notunuz:");
        kimya = input.nextInt();
        if (kimya > 0 && kimya <= 100) {
            toplamNot += kimya;
        } else {
            System.out.println("Kimya notunu hatalı girdiniz. Ortalamaya dahil edilmeyecektir.");
        }

        System.out.println("Müzik notunuz:");
        muzik = input.nextInt();
        if (muzik > 0 && muzik <= 100) {
            toplamNot += muzik;
        } else {
            System.out.println("Müzik notunu hatalı girdiniz. Ortalamaya dahil edilmeyecektir.");
        }

        double ortalama = toplamNot / 5.0;
        System.out.println("Ortalamanız: " + ortalama);
        if (ortalama >= gecmeNotu) {
            System.out.println("Tebrikler! Sınıfı geçtiniz.");
        } else {
            System.out.println("Sınıfta kaldınız.");
        }
    }
}