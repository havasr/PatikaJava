import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.println("Please enter your guess: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Please enter a number between 0 and 100");
                if (isWrong) {
                    right++;
                    System.out.println("Too many wrong inputs. Guesses left: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Another wrong input will deduct your guesses.");
                }
                continue;
            }
            if (selected == num2) {
                System.out.println("Congrats you got the right number! It is: " + num2);
                isWin = true;
                break;
            } else {
                wrong[right] = selected;
                right++;
                System.out.println("Unfortunately the number you guessed is not correct.");
                if (selected > num2) {
                    System.out.println("The number you selected is bigger than the secret number.");
                } else {
                    System.out.println("The number you selected is smaller than the secret number.");
                }
                System.out.println("You have " + (5 - right) + "guesses left");
            }
        }
        if (!isWin && !isWrong) {
            System.out.println("You have lost.");
            System.out.println("Here are your guesses: " + Arrays.toString(wrong));
        }
    }
}