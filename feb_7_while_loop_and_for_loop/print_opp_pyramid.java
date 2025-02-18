import java.util.*;
public class print_opp_pyramid {

    public static void main (String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=num;j>=0;j--)
            {
            System.out.print("*");

            }
            num--;
            System.out.println();
        }

    }
}
