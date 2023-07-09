import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Etkinlik önerisi için sıcaklık giriniz:");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat <= 10) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat <= 15) {
            System.out.println("Sinemaya ve pikniğe gidebilirsiniz.");
        } else if (heat <= 25) {
            System.out.println("Piknik yapabilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}