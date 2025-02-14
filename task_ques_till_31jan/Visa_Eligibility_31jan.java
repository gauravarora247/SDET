import java.util.*;
public class Visa_Eligibility_31jan {


    public static boolean check_visa_eligibility(int age , boolean  visa_status)
    {

        if(age < 0)
        {
            System.out.println("Visa invalid");
            return false;

        }

       return (age >= 18 && visa_status);

    }
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age  ");
    int age =  sc.nextInt();

    boolean visa_status = sc.nextBoolean()  ;

    boolean canTravel = check_visa_eligibility(age,visa_status);

    if(canTravel)
    {
        System.out.println("Visa valid");
    }
    else
    {
        System.out.println("Visa Invalid");
    }
}
}
