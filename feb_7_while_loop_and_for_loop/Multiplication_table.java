import java.util.*;
public class Multiplication_table {
    //using for loop
    //    public static void main (String [] args )
//    {
//        Scanner sc = new Scanner(System.in);
//        int num =  sc.nextInt();
//
//        for(int i=1;i<=10;i++)
//        {
//            System.out.println(num + "X"+ i + "=" +" "+num*i);
//        }
//    }

    //using while loop
    public static void main (String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num ");
        int num = sc.nextInt();
        int i = 0;
        while(i <= 10)
        {
            System.out.println(num + "X" + i +"=" + num*i);
            i++;
        }

    }
}
