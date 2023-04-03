package collect;

public class Customer{
    private String name;
    public Customer(){

    }

    public Customer(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
