package oop6_Abstract;

class Cat extends Animal {
    private String name;

    public void makeSound() {

        this.name = "cat";
        System.out.println("The "+ this.name +" says: bark");
    }
}
