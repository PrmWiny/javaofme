package oop3;

public class OOP3 {
    public static void main(String[] args) {

        Calculation cal = new Calculation();
        newCalcu ncal = new newCalcu();

        //System.out.println(cal.addition(1,2));
        //System.out.println(cal.subtraction(1,2));

        System.out.println("- - - - - -  - - - - - - - - - - - - - - - -");
        String a = cal.subtraction(10, 5);
        System.out.println("- - - - - -  - - - - - - - - - - - - - - - -");
        String b = cal.subtraction(9, 1);
        System.out.println("- - - - - -  - - - - - - - - - - - - - - - -");
        String c = ncal.multiply(9, 1);
        System.out.println("- - - - - -  - - - - - - - - - - - - - - - -");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
