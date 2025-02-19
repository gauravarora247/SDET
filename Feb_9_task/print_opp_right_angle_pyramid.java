import java.util.*;
public class print_opp_right_angle_pyramid {

    public static void main(String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int num = sc.nextInt();

        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
