import java.util.*;

public class ques4 {

    public static boolean isPalindrome(String name)
    {
        int length =  name.length();
          boolean isPalindrome =  true;
        for(int i=0;i<=length/2;i++)
        {
         if(name.charAt(i)!=name.charAt(length-i-1))
         {
             isPalindrome =  false;
             break;
         }
        }
        return isPalindrome;

    }
    public static void main(String[] args )
    {

//        for(int i=1;i<=100;i++)
//        {
//            if(i%3==0)
//            {
//                System.out.println("Fizz");
//            }
//            else if(i%5 == 0)
//            {
//                System.out.println("Buzz");
//            }
//            else if ((i % 3 == 0) && (i % 5 == 0))
//            {
//                System.out.println("FizzBuzz");
//            }
//            else
//            {
//                System.out.println("Neither divisible by 3 nor by 5 ");
//            }
//        }

 // palindrome of string
        System.out.println("Enter the string ");
        Scanner sc = new Scanner(System.in);
        String name  =  sc.nextLine();
    boolean palindrome =     isPalindrome(name);
     if(palindrome)
     {
         System.out.println("It is a palindromic string ");
     }
     else
     {
         System.out.println("It is not a palindromic string ");
     }
    }
}
