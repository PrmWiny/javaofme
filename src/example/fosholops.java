package example;

import java.util.Scanner;

public class fosholops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = "moo";
        String password = "chth";

        System.out.print("Username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Password: ");
        String passwordInput = scanner.nextLine();

        if(usernameInput.equals(username) && passwordInput.equals(password)) {

                System.out.println("Success!");
        }
        System.out.println("invalid username or password !");

        /*else {
            System.out.print("Password: ");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            if(line.equals(password)) {
                System.out.println("Success!");
                break;
            }
        }*/

    }
}
