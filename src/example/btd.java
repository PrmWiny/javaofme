





package example;

import java.util.Scanner;

public class btd {//start

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("NATION FOOD (Thai/American):");
        String inputFoodtype = scanner.nextLine();

//if else method

        if(inputFoodtype.equals("Thai"))
        {
            System.out.print("THAI TASTE FOOD (Spicy/Salty):");
            String inputFlavor = scanner.nextLine();
            if(inputFlavor.equals("Spicy")){
                System.out.println("Tom yum");
            }
            else if (inputFlavor.equals("Salty")) {
                System.out.println("Fried Pork");
            }
        }

        else if(inputFoodtype.equals("American"))
        {
            System.out.print("AMERCAN TASTE FOOD (Spicy/Salty):");
            String inputFlavor = scanner.nextLine();
            if(inputFlavor.equals("Salty")){
                System.out.println("French Fries");
            }
            else if(inputFlavor.equals("Spicy")) {
                System.out.println("New Orleans Chicken");
            }
        }


    }//end public static void main
}//end public class btd