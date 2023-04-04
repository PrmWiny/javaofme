package solution.main;

import java.util.Arrays;
import java.util.Iterator;
import static solution.base.ToBeEnum.*;
import solution.base.ToBeLambda;
import solution.base.ToCompare;
import solution.base.ToIterate;

public class MainExam {

    // replace 999 with the last three digits of your student id.
    // replace YOUR_STUDENT_ID with your "student id inside a quote".
    private static final ToCompare[] cmps = { new ToCompare(999, "2000"),
        new ToCompare(-7, "Seven"), new ToCompare(-2, "Two"), 
        new ToCompare(-9, "Nine"), new ToCompare(-3, "Three") };
    
    // replace YOUR_FIRSTNAME with your firstname.
    // replace YOUR_LASTNAME with your lastname.
    private static final ToBeLambda[] lds = {
        new ToBeLambda("Kriengkrai", "Porkaew"),
        new ToBeLambda("Steve","Johnson"),
        new ToBeLambda("Joseph","Aliba"), 
        new ToBeLambda("Alice","Smith")
    };

    public static void main(String[] args) {
        exam01ToBeEnum();
        exam02ToCompare();
        exam03ToIterate();
        exam04Lambda();
        exam05Stream();
    }

    private static void exam01ToBeEnum() {
        System.out.println("EXAM01: ===============");

        /* EXAM01: change ToBeEnum class to ToBeEnum enum that consists of
        the following enum values: FRESHMAN, SOPHOMORE, JUNIOR, SENIOR */

        System.out.println("  " + FRESHMAN
                + " : " + FRESHMAN.getName()
                + " (" + FRESHMAN.getYear() + ")");

        System.out.println("  " + SOPHOMORE
                + " : " + SOPHOMORE.getName()
                + " (" + SOPHOMORE.getYear() + ")");

        System.out.println("  " + JUNIOR
                + " : " + JUNIOR.getName()
                + " (" + JUNIOR.getYear() + ")");

        System.out.println("  " + SENIOR
                + " : " + SENIOR.getName()
                + " (" + SENIOR.getYear() + ")");
    }

    private static void exam02ToCompare() {
        System.out.println("EXAM02: ===============");

        /* EXAM02.1: change ToCompare class to implement Comparable interface
        so that it can compare two ToCompare objects by their names. */

        /* EXAM02.2: implement compareByValue in the ToCompare class
        so that it can compare two ToCompare objects by thier values. */

        System.out.println("  Unsorted:");
        for (ToCompare cmp : cmps) 
            System.out.println("    " + cmp);

        /* EXAM02.3: call Arrays.sort() method so that it sorts 
        the cmps array by the name of ToCompare objects */
        Arrays.sort(cmps); // ANSWER 2.3
        System.out.println("  Sort by Name:");
        for (ToCompare cmp : cmps) 
            System.out.println("    " + cmp);

        /* EXAM02.4: call Arrays.sort() method and provide a comparator
        so that it sorts the cmps array by the values of ToCompare objects */
        Arrays.sort(cmps, ToCompare::compareByValue); // ANSWER 2.4
        System.out.println("  Sort by Value:");
        for (ToCompare cmp : cmps) 
            System.out.println("    " + cmp);
    }

    private static void exam03ToIterate() {
        System.out.println("EXAM03: ===============");

        /* EXAM03.1: change ToIterate<T> class to implement Iterable interface. */

        ToIterate<ToCompare> dataSet = ToIterate.of(cmps);

        /* EXAM03.2: use ToIterate's iterator to print all elements in the dataSet out. */
        Iterator<ToCompare> it = dataSet.iterator(); // ANSWER 3.2
        System.out.println("  Iterate:");
        while (it.hasNext()) 
            System.out.println("    " + it.next());
    }

    private static void exam04Lambda() {
        System.out.println("EXAM04: ===============");

        /* EXAM04.1: write a lambda expression for ToBeLambda.byFirstname. */
        // ANSWER 4.1 in ToBeLambda.java
        
        System.out.println("  Unsorted:");
        for (ToBeLambda ld : lds) 
            System.out.println("    " + ld);
        
        /* EXAM04.2: call Arrays.sort() method and provide a comparator
        so that it sorts the lds array by the firstname */
        Arrays.sort(lds, ToBeLambda.compareByFirstname); // ANSWER 4.2
        System.out.println("  Sorted by Firstname:");
        for (ToBeLambda ld : lds) 
            System.out.println("    " + ld);

        /* EXAM04.3: call Arrays.sort() method and provide a comparator
        so that it sorts the lds array by the firstname in a reverse order */
        Arrays.sort(lds, ToBeLambda.compareByFirstname.reversed()); // ANSWER 4.3
        System.out.println("  Sorted by Firstname in a reverse order:");
        for (ToBeLambda ld : lds) 
            System.out.println("    " + ld);
    }

    private static void exam05Stream() {
        System.out.println("EXAM05: ===============");

        /* EXAM05.1: use a stream to print all objects in the cmps array out. */
        System.out.println("exam05.1 ----------");
        Arrays.stream(cmps)
                .forEach(System.out::println);

        /* EXAM05.2: use a stream to select only the objects in the lds array 
        that the firstname ends with "e". print the result out. */
        System.out.println("exam05.2 ----------");
        Arrays.stream(lds)
                .filter(o -> o.evalFirstname(s -> s.endsWith("e")))
                .forEach(System.out::println);
    }
}
