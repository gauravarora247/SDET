import java.util.*;

public class character_is_alphabet {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if((ch>='A' && ch <='Z') || (ch>='a' && ch <= 'z'))
        {
            System.out.println("Yes it is an alphabet ");
        }
        else
        {
            System.out.println("No it is not an alphabet ");

        }
    }
}
