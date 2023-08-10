import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a row number: ");
        int rowNumber = input.nextInt();
        System.out.println("Please enter a column number: ");
        int colNumber = input.nextInt();

        Minesweeper mine = new Minesweeper(rowNumber, colNumber);

        mine.run();
    }
}