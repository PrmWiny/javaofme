package example;

import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("INPUT PRICE：");
        double price = input.nextDouble();
        double tax = 0.07;
        double totalPrice = price * (1 + tax);
        System.out.println("TOTAL PRICE：" + totalPrice);
    }
}
