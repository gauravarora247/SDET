import java.util.*;
public class Year_month_days {

public static void main (String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of days ");
    int days  =  sc.nextInt();

    int years = days/365;
    int remainingdays = days%365;
    int months = remainingdays/30;
    int day = remainingdays%30;

    System.out.println("Years : "+ years);
    System.out.println("Months : "+ months);
    System.out.println("day: "+day);

}
}
