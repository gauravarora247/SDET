import java.util.*;
public class Equilateral_triangle {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side 1 ");
        double side1 = sc.nextDouble();
        System.out.println("Enter the side 2");
        double side2 = sc.nextDouble();
        System.out.println("Enter the side3 ");
        double side3 = sc.nextDouble();

        if(side1 == side2 && side2 == side3)
        {
            System.out.println("Yes it is an equilateral Triangle");
        }
        else
        {
            System.out.println("No it is not an equilateral Triangle");
        }

    }
}
