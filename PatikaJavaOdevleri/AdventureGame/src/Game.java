import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to the Adventure Game!");
        System.out.println("Please enter your name: ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Welcome " + player.getName() + " !");
        System.out.println("Are you ready for a dark and misty adventure on this island?");
        System.out.println("Choose your character and enter their number to start: ");
        player.selectChar();
        player.selectLocation();



    }
}
