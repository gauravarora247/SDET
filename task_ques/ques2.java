import java.util.*;


public class ques2 {

    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num");
       int num =  sc.nextInt();
//
//        if(num >= 90 && num <= 100)
//        {
//            System.out.println("A");
//        }
//        else if (num >= 80  &&  num <= 89)
//        {
//            System.out.println("B");
//        }
//        else if(num >= 70 && num <= 79)
//        {
//            System.out.println("C");
//        }
//        else if(num >= 60  && num  <= 69)
//        {
//            System.out.println("D");
//        }
//        else if(num >= 0 && num <= 59)
//        {
//            System.out.println("F");
//        }

        //Using ternary Operator

        String grade = (num >= 90  && num <= 100) ? "A" :
                        (num >= 80 && num  <= 89) ? "B" :
                                (num >= 70  && num <= 79) ? "C":
                                        (num >=60 && num  <= 69 ) ? "D" :
                                                (num >= 0 && num <= 59) ? "F" : "invalid Input";
        System.out.println(grade);






    }
}
