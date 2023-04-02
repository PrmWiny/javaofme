package oop;

import java.util.Scanner;

public class OOP {
    public static void main(String[] args) throws InterruptedException {

        Car car1 = new Car();
        car1.carx();

    }

    private static String newCar() {
        return "Your";
    }
    private static String ab(){
        Scanner scanner = new Scanner(System.in);
        String carName = scanner.nextLine();

        return carName;
    }
    private static String ac(){
        Scanner scanner = new Scanner(System.in);
        String carLic = scanner.nextLine();

        return carLic;
    }

}
