package example;

import java.util.Scanner;

public class dowhite {

    public static void main(String[] args){
        String password = "pass1";
        String inputPassword;
        do
        {
            System.out.print("Enter your password: ");
            Scanner scanner = new Scanner(System.in);
            inputPassword = scanner.nextLine();
            System.out.println("Invalid");
        }

        while(!password.equals(inputPassword));

        System.out.println("Correct password!");

    }
}
