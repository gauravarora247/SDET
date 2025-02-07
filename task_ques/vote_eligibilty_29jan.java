import java.util.*;

public class vote_eligibilty_29jan {

public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of num1");
    int age = sc.nextInt();
    if(age >=18)
    {
        System.out.println("You are eligible to vote ");

    }
    else
    {
        System.out.println("You are not eligible to vote ");
    }
}
}
