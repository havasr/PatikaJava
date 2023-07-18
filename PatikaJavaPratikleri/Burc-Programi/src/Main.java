import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int month, day;
        Scanner input = new Scanner(System.in);

        System.out.println("Doğdunuz ay (rakam olarak): ");
        month = input.nextInt();

        System.out.println("Doğdunuz gün: ");
        day = input.nextInt();

        LocalDate date = LocalDate.of(0, month, day);

        LocalDate kocStart = LocalDate.of(0, 3, 21);
        LocalDate kocEnd = LocalDate.of(0, 4, 20);
        LocalDate bogaStart = LocalDate.of(0, 4, 21);
        LocalDate bogaEnd = LocalDate.of(0, 5, 21);
        LocalDate ikizlerStart = LocalDate.of(0, 5, 22);
        LocalDate ikizlerEnd = LocalDate.of(0, 6, 22);
        LocalDate yengecStart = LocalDate.of(0, 6, 23);
        LocalDate yengecEnd = LocalDate.of(0, 7, 22);
        LocalDate aslanStart = LocalDate.of(0, 7, 23);
        LocalDate aslanEnd = LocalDate.of(0, 8, 22);
        LocalDate basakStart = LocalDate.of(0, 8, 23);
        LocalDate basakEnd = LocalDate.of(0, 9, 22);
        LocalDate teraziStart = LocalDate.of(0, 9, 23);
        LocalDate teraziEnd = LocalDate.of(0, 10, 22);
        LocalDate akrepStart = LocalDate.of(0, 10, 23);
        LocalDate akrepEnd = LocalDate.of(0, 11, 22);
        LocalDate yayStart = LocalDate.of(0, 11, 22);
        LocalDate yayEnd = LocalDate.of(0, 12, 21);
        LocalDate oglakStart = LocalDate.of(0, 12, 22);
        LocalDate oglakEnd = LocalDate.of(0, 1, 21);
        LocalDate kovaStart = LocalDate.of(0, 1, 21);
        LocalDate kovaEnd = LocalDate.of(0, 2, 19);
        LocalDate balikStart = LocalDate.of(0, 2, 20);
        LocalDate balikEnd = LocalDate.of(0, 3, 20);


        if ((date.compareTo(kocStart) >= 0) && (date.compareTo(kocEnd) <= 0)) {
            System.out.println("Koc Burcusun!");
        } else if ((date.compareTo(bogaStart) >= 0) && (date.compareTo(bogaEnd) <= 0)) {
            System.out.println("Boga Burcusun!");
        } else if ((date.compareTo(ikizlerStart) >= 0) && (date.compareTo(ikizlerEnd) <= 0)) {
            System.out.println("Ikizler Burcusun!");
        } else if ((date.compareTo(yengecStart) >= 0) && (date.compareTo(yengecEnd) <= 0)) {
            System.out.println("Yengec Burcusun!");
        } else if ((date.compareTo(aslanStart) >= 0) && (date.compareTo(aslanEnd) <= 0)) {
            System.out.println("Aslan Burcusun!");
        } else if ((date.compareTo(basakStart) >= 0) && (date.compareTo(basakEnd) <= 0)) {
            System.out.println("Basak Burcusun!");
        } else if ((date.compareTo(teraziStart) >= 0) && (date.compareTo(teraziEnd) <= 0)) {
            System.out.println("Terazi Burcusun!");
        } else if ((date.compareTo(akrepStart) >= 0) && (date.compareTo(akrepEnd) <= 0)) {
            System.out.println("Akrep Burcusun!");
        } else if ((date.compareTo(yayStart) >= 0) && (date.compareTo(yayEnd) <= 0)) {
            System.out.println("Yay Burcusun!");
        } else if ((date.compareTo(kovaStart) >= 0) && (date.compareTo(kovaEnd) <= 0)) {
            System.out.println("Kova Burcusun!");
        } else if ((date.compareTo(balikStart) >= 0) && (date.compareTo(balikEnd) <= 0)) {
            System.out.println("Balik Burcusun!");
        } else if ((date.compareTo(oglakStart) >= 0) || (date.compareTo(oglakEnd) <= 0)) {
            System.out.println("Oglak Burcusun!");
        } else {
            System.out.println("Yanlis giris yaptiniz.");
        }
    }

}
