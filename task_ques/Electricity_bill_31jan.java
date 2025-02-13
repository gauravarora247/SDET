import java.util.*;

public class Electricity_bill_31jan {

    public static double Electricity_bill(int no_of_units)
    {
       double result;

       if(no_of_units <= 0 )
       {
           return 0;
       }

       if(no_of_units <= 100)
       {
           result =  no_of_units * 0.50;
       }
       else if(no_of_units <= 200)
       {
           result = (100 * 0.50)+ (no_of_units - 100) * 0.75;

       }
       else if(no_of_units <= 300)
       {
           result = (100 * 0.50) + ((200 - 100) * 0.75) + (no_of_units - 200) * 1.20;
       }
       else
       {
           result  = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) +  ((no_of_units -300) * 1.50);
       }

       return result;
    }

    public static void main (String args[])
    {
        System.out.println("Enter the number of units ");
        Scanner sc = new Scanner(System.in);
        int no_of_units = sc.nextInt();

        double result_new  =  Electricity_bill(no_of_units);
        System.out.println("Electricity bill is  " + " "+result_new);
    }
}
