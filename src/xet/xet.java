package xet;

import java.util.*;

public class xet {
    public static void main(String[] args) {
        Set<Integer> set =new HashSet<Integer>();

        //ใส่ซ้ำก็ออกตัวเดียว มันไม่แยกกัน
        set.add(19);
        set.add(23);
        set.add(23);
        set.isEmpty();

        System.out.println(set);


    }
}
