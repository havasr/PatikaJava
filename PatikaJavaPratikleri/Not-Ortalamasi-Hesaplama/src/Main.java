import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.println("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.println("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.println("Müzik Notunuz: ");
        muzik = input.nextInt();

        double notOrtalama = ((mat + fizik + kimya + turkce + tarih + muzik) / 6.0);

        System.out.println("Not Ortalamanız: " + notOrtalama);

        System.out.println(notOrtalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");

        }
    }
