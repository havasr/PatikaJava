import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] list = {-2, 5, 12, -5, 33, 2, -12};
        //[-12, -5, -2, 2, 5, 12, 33]

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between " + list[0] + " and " + list[list.length-1]);
        int choice = input.nextInt();

        boolean identical = false;

        int smallNum = list[0];
        int bigNum = list[0];

        for (int i = 0; i < list.length; i ++){
            if (choice == list[i]) {
                identical = true;
            } else if (choice > list[i]){
                smallNum = list[i];
                bigNum = list[i+1];
            }
        }

        if (identical){
            System.out.println("Your number is in the list!");
        } else {
            System.out.println("The closest numbers to your number are: " + smallNum + " and "+ bigNum);
        }
    }
}