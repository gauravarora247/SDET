import java.util.*;
public class sum_10_natural_number {

    public static void main (String [] args )
    {
        int sum = 0;
        Scanner sc  = new Scanner(System.in);
        for(int i=1;i<=10;i++)
        {
            sum += i;

        }
        System.out.println("sum of first 10 natural numbers "+sum);
    }
}
