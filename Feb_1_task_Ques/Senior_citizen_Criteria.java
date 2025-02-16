import java.util.*;

public class Senior_citizen_Criteria {

    public static String SeniorCitizencheck(int age  )
    {
        String value = "";
        if(age <=12 )
        {
            value =  "Child";
        }
        else if(age <= 19)
        {
            value = "Teenage";
        }
        else if (age <= 64)
        {
            value = "Adult";
        }
        else
        {
            value = "Senior citizen";
        }

        return value;
    }
    public static void main (String [] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age ");
        int age =  sc.nextInt();
        String  result  =  SeniorCitizencheck(age);
        System.out.println(result);
    }
}
