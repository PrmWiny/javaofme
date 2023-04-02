package oop;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Car {

    public void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("WANNA DRIVE ? :");
        String inputKey = scanner.nextLine();

    }
    public void carx() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("WANNA DRIVE ? :");
        String inputKey = scanner.nextLine();

        //if else method
        if (inputKey.equals("Yes")) {
            start();

        } else if (inputKey.equals("No")) {
            stop();
        }

    }

    //class
    public void start()

        throws InterruptedException {
        System.out.println("Car : Opening");

        Thread.sleep(1000);
        System.out.println("Car : Bru");

        Thread.sleep(1000);
        System.out.println("Car : Bru Bru Bru");

        Thread.sleep(1000);
        System.out.println("Car : Bru Bru Bru SHH");

        Thread.sleep(500);
        System.out.println("Car : Engine is started");
    }
    public void stop () {
            System.out.println("Car : Leave me alone!");
        }
}

























