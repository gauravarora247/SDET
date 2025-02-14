import java.util.*;
public class Divisible_by_5_and_11 {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num ");
        int num = sc.nextInt();

        if((num % 5 == 0)   &&  (num % 11 == 0)  )
        {
            System.out.println(num + " is divisible by both 5 and 11 ");
        }
        else
        {
            System.out.println( num + " is not divisble by both 5 and 11 ");
        }
    }
}
