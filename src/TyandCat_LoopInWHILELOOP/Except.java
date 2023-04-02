package TyandCat_LoopInWHILELOOP;

import java.util.Scanner;

public class Except {

    /*public static void main(String[] args) {


            try {
                System.out.print("NUMBER : ");
                Scanner scanner = new Scanner(System.in);
                scanner.nextInt();
            }
            catch (Exception e) {
                System.out.println("Invalid input !");
                System.out.println("Try again");
                throw new try;
        }

    }*/

    /*public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInput = 0;

        while (true) { // loop until valid input is provided

            try {
                System.out.print("Please enter an integer: ");
                userInput = scanner.nextInt();
                break; // exit loop if input is valid
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                scanner.nextLine(); // clear the input buffer
            }

        }
        System.out.println("Correct !");
    }*/

    /*/public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print("Enter a number: ");
                    int num = scanner.nextInt();
                    validInput = true;

                    // do something with the input
                    System.out.println("You entered: " + num);

                } catch (Exception e) {
                    // input was not an integer, print error message and try again
                    System.out.println("Invalid input, please enter an integer.");
                    scanner.nextLine(); // clear the input buffer
                }
            }
        }*/
    }
