import java.util.*;
public class Salary_EOY_31jan {


    public static double getActualSalary(int Salary,int eoy)
    {
        double final_salary;

        if(eoy < 1)
        {
            final_salary = Salary;
        }
        else if( eoy <= 3)
        {
            final_salary = 0.05 * Salary + Salary;
        }
        else if(eoy <= 6)
        {
            final_salary =  0.10 * Salary + Salary;
        }
        else {
            final_salary =  0.15* Salary + Salary;
        }
        return final_salary;
    }
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the salary");
    int Salary  =  sc.nextInt();
    System.out.println("Enter the eoy");
    int eoy = sc.nextInt();

    double Actual_salary =  getActualSalary(Salary,eoy);
     System.out.println("Actual Salary is "+ Actual_salary);

}
}
