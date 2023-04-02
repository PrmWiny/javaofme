package example;

import java.util.Scanner;

public class swiss {

    public static void main(String[] args){
        System.out.print("Enter your choice 1-3 :");

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1 :
                System.out.println("Hello");
                break;
            case 2 :
                System.out.println("WORLD");
                break;
            case 3 :
                System.out.println("Hello WORLD");
                break;
            default:
                System.out.println("invalid user input");

                main(args);
        }

    }
}
