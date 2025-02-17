import java.util.*;

public class Print1_to_10 {

    public static void main (String [] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num  =  sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            System.out.println(i);
        }
    }
}
