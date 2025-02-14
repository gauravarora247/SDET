import java.util.*;
public class Atm_withdrawl_condition {

    public static void main(String args[])
    {
        int Account_Balance = 10000;
        System.out.println("Please tell the withdrawl amount");
        Scanner sc = new Scanner(System.in);
        int withdrawl_amount = sc.nextInt();

        int current_amount;

        if((withdrawl_amount >0) && (withdrawl_amount % 100 == 0) && (withdrawl_amount <= Account_Balance))
        {
            current_amount = Account_Balance - withdrawl_amount;
            System.out.println("Withdrwal successfull");
            System.out.println("Current Balance is " + current_amount);

        }
        else
        {
            System.out.println("Withdrwal fails");
        }

    }
}
