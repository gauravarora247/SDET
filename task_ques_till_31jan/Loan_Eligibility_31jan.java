import java.util.*;
public class Loan_Eligibility_31jan {


    public static String isEligible(int age, double salary , int credit_score)
    {
        //Age validation
        if(age<= 0 || age > 80)
        {
           return "Not eligible as age should be between 18 and 80";
        }

        if(age < 18)
        {
       return "Not eligible as age is less than 18";
        }
        //Salary validation
        if ( salary < 30000)
        {
            return "Not eligible for loan";
        }

        //Credit score validation

        if(credit_score < 650 || credit_score > 850)
        {
            return "Not eligible for loan";
        }



        return "Eligible for Loan";



    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age ");
        int age = sc.nextInt();
        System.out.println("Enter the salary");
        double salary = sc.nextDouble();
        System.out.println("Enter the credit score");
        int credit_score =  sc.nextInt();

       String result = isEligible(age,salary,credit_score);
       System.out.println(result);

    }
}
