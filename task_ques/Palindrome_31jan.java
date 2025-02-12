import java.util.*;

public class Palindrome_31jan {

    public static boolean isPalindrome(int num )
    {
        int original_num =  num;
        int sum =  0;
        while(num>0)
        {
            int rem = num%10;
            sum = sum * 10 + rem;
            num /= 10;
        }
        if(original_num == sum)
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
        System.out.println("Enter the value of num ");
        int num = sc.nextInt();

        if(isPalindrome(num))
        {
            System.out.println(num + " " + "is Palindromic");
        }
        else
        {
            System.out.println(num + " " + "is not Palindromic");
        }
    }
}
