package oop3;
public class Calculation {
    String zero = " ";
    public String addition(double x, double y) {
        double result = x + y;
        System.out.println("QUESTION : " + x + "+" + y);
        System.out.println("ANSWER : " + result);
        return zero;
    }
    public String subtraction(double x, double y) {
        double result = x - y;
        System.out.println("QUESTION : " + x + "-" + y);
        System.out.println("ANSWER : " + result);
        return zero;
    }
}