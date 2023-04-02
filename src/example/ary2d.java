package example;

import java.util.Arrays;

public class ary2d {

    public static void main(String[] args){
        String[][] ary = new String[5][5];

// Arrays.asList()
        ary[0][0] = "car1";
        ary[0][1] = "honda";
        ary[0][2] = "red";
        ary[0][3] = "100cc";
        ary[0][4] = "CT-2575";

        ary[1][0] = "car2";
        ary[1][1] = "honda";
        ary[1][2] = "blue";
        ary[1][3] = "150cc";
        ary[1][4] = "AC-6231";

//output for example
        System.out.println(Arrays.toString(ary[0]));
        System.out.println(Arrays.toString(ary[1]));
    }
}
