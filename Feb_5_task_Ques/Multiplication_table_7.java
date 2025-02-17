import java.util.*;
public class Multiplication_table_7 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num  =  sc.nextInt();
        int i=0;
        while(i<=10)
        {
            System.out.println(num +"" + "X" +"" + i +""+ "=" + "" +num*i);
            i++;
        }
    }
}
