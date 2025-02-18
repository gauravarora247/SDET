import java.util.*;
public class isprime {

public static void main (String[] args)
{
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    boolean isprime =  false;
    int count = 0;

    for(int i=1;i<=Math.sqrt(num);i++)
    {
        if(num%i==0)
        {
            count +=1;

            if(num/i!=i)
            {
                count +=1;
            }
        }
    }


}
}
