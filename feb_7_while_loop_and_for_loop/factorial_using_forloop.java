import java.util.*;
public class factorial_using_forloop {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        int fact = 1;
        for(int i=1;i<=num;i++)
        {
            fact *= i;
        }

        System.out.println("Factorial of a number is "+fact);
    }
}
