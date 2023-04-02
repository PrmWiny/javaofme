package oop5_INPUTANDOUTPUT_comp;

import java.util.Scanner;

public class Customer {
    private String inputRun;
    private String inputName;
    private String name;
    private String lastName;
    private String address;
    public Customer(String name, String lastName, String address){
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public void Show(){
        System.out.println("YOUR INFORMATION");
        System.out.println("UR NAME : " + inputName);
        System.out.println("UR Speed : " +inputRun);
    }

    public Customer(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("NAME : ");
        setInputName(scanner.nextLine());


    }

    public void Run(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Speed : ");
        setInputRun(scanner.nextLine());

    }



    //public void Run(){
    //    System.out.println("Hello " + name);
    //}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInputRun() {
        return inputRun;
    }

    public void setInputRun(String inputRun) {
        this.inputRun = inputRun;
    }

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }
}
