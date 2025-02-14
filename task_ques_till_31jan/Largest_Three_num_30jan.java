import java.util.*;
public class Largest_Three_num_30jan {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1 ");
        int num1 =  sc.nextInt();
        System.out.println("Enter the value of num2 ");
        int num2 =  sc.nextInt();
        System.out.println("Enter the value of num3  ");
        int num3 =  sc.nextInt();

        if(num1 >= num2 && num1 >= num3 )
        {
            System.out.println(num1 + " " + "is the greatest ");
        }
        else if (num2 >=  num1 && num2 >= num3)
        {
            System.out.println(num2 + " " + "is the greatest ");
        }
        else
        {
            System.out.println(num3 + " " + "is the greatest  ");
        }

    }
}
