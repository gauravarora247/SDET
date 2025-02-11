import java.util.*;
public class Check_prime {

    public static boolean isPrime(int num )
    {
        if(num < 2)
        {
            return false;
        }

        int count  = 0;

        for(int i=1;i*i<=num;i++)
        {
            if(num%i==0)
            {
                count +=1;

                if(num/i!=i)
                {
                    count+=1;
                }
            }

        }

        if(count ==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the value of num  ");
        int num  = sc.nextInt();

        boolean result  =   isPrime(num);
        System.out.println("Result is " + result);
    }
}
