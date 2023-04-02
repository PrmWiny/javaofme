package oop4;

public class OOP4 {
    public static void main(String[] args){

        String say = "Car TYPE : ";
        String speed = "Speed : ";

        Cat cat1 = new Cat();

        System.out.print(say);
        cat1.say();
        System.out.print(speed);
        cat1.walk();

        Chicken chicken1 = new Chicken();

        System.out.print(say);
        chicken1.say();
        System.out.print(speed);
        chicken1.walk();

        Dog dog1 = new Dog();

        System.out.print(say);
        dog1.say();
        System.out.print(speed);
        dog1.walk();

    }

}
