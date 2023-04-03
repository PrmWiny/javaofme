package collect;

import oop5_INPUTANDOUTPUT_comp.Customer;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class litSetMab {
//เอาไว้เก็บ obj ต่างๆไว้รวมกัน เก็บการการประมวลผล รับข้อมูล ส่งออกข้อมูล
    //list เรียงลำดับการทำงาน เช่น หยิบบอลสีแดง หยิบบอลสีขาว ก็จะทำเรียงกัน แยกเป็นสองสิ่ง เก็บคล้าย array แต่ไม่ต้องกังวลเรื่องขนาด
    //set เหมือนเซ็ทในคณิต กลุ่มของข้อมูล มากองรวมกัน ไม่สนใจลำดับ เช่น หยิบบอลสีแดง หยิบบอลสีขาว ทำรวมกัน ไม่สนลำดับ
    //map เข้าถึงข้อมูลจาก KEY เช่นดูจาก KEYS (1) คล้าย array มากๆ เช่น KEYS:จำนวนสมาชิก -> VALUES:10 (คน)

    public static void main(String[] args) {

        //GENERIC LIST ทำให้ปลอดภัยมากขึ้น
        ArrayList<Customer> list = new ArrayList<Customer>();

        list.add(new Customer("A"));
        list.add(new Customer("B"));

        list.get(0);

        System.out.println(list.get(0).getName());
        System.out.println(list.get(1).getName());

    }
        //simple array
        /*String[] ary = new String[5];
        ary[0] = " asd";
        ary[1] = " asd2";

        System.out.println(ary[0]);*/

    //arraylist
        //NOT LOOP JUST SIMPLE SOUT
        /*ArrayList list = new ArrayList ();

        list.add("John");
        list.add("Joh");
        list.add("Jim");
        list.add("Jay");


            System.out.println(list.get(1));
        }*/

        //Generic LIST (คือตัวที่มี <> ด้านใน ARRAYLIST)
        //loop for SOUT all ARRAYLIST
        /*ArrayList<String> myList = new ArrayList<String>();
        myList.add("ads1");
        myList.add("elasd1134nt2");
        myList.add("eleasffhjgnt3");

        for(String element : myList) {
            System.out.println(element);*/
        }


