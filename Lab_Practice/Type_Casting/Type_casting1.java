import java.util.*;

public class Type_casting1 {
    public static void main (String[] args )
    {
//        byte b = 10;
//        int a = (int)b;
//        System.out.println(a);
//
//        int val = 100;
//        byte b = (byte)val;
//        System.out.println(b);

      /*  long phone_no = 98923829238l;
        short b = (short)phone_no;
        System.out.println(b);*/

        int course = 100;
        float GST = 18.4f;

        int total_int = course + (int)GST;
        float total = course + GST;
        System.out.println(total_int);
        System.out.println(total);
    }

}
