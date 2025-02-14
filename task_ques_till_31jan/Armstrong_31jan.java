import java.util.*;
public class Armstrong_31jan {

    public static boolean isArmstrong(int num)
    {
        int orignal_num  =  num;
        int count =  String.valueOf(num).length();
        int sum = 0;
        while(num>0) {
         int rem = num % 10;
         sum += Math.pow(rem, count);
         num /= 10;
     }

     if(sum == orignal_num)
     {
         return true;
     }
     else
     {
         return false;
     }

    }


    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        if(isArmstrong(num))
        {
            System.out.println("Yes it is an armstrong number ");
        }
        else
        {
            System.out.println("No it is not an armstring number ");
        }
    }
}
