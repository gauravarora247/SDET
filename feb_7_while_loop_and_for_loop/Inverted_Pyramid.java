import java.util.*;
public class Inverted_Pyramid {

    public static void main (String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num ");
        int num =  sc.nextInt();

        for(int i=0;i<num;i++)
        {

            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0 ; j< (2 * (num-i)-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
