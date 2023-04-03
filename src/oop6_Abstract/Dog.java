package oop6_Abstract;

class Dog extends Animal {
    private String name;

    public void makeSound() {

        this.name = "Dog";

        System.out.println("The "+ this.name +" says: bark");
    }
}