import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;
        Scanner input = new Scanner(System.in);
        int entry = 3;
        int balance = 1500;
        int select;

        while (entry > 0) {
            System.out.println("Enter username:");
            username = input.nextLine();
            System.out.println("Enter password:");
            password = input.nextLine();

            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to Kodluyoruz Bank!");
                do {
                    System.out.println("Please enter a number to continue.");
                    System.out.println("1- Add money \n2- Take money \n3- Learn your balance \n4- Log out");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Please enter the amount:");
                            int amount = input.nextInt();
                            balance += amount;
                            break;
                        case 2:
                            System.out.println("Please enter the amount:");
                            int amount2 = input.nextInt();
                            if (amount2 >= balance) {
                                balance -= amount2;
                            } else {
                                System.out.println("Insufficient balance");
                            }
                            break;
                        case 3:
                            System.out.println("Your balance is: " + balance);
                            break;
                    }
                }
                while (select != 4);
                System.out.println("See you later!");
                break;
            } else {
                System.out.println("Username or password incorrect, please try again.");
                entry--;
                if (entry == 0) {
                    System.out.println("Your account has been blocked.");
                }
            }
        }


    }
}
