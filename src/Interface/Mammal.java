package Interface;

public class Mammal implements Animal_interface {

    @Override
        public void eat() {
            System.out.println("I'm eating");
        }

    @Override
    public void travel() {
        System.out.println("I'm sleeping");


    }

    public int noOflegs(){
        return 0;
    }
}
