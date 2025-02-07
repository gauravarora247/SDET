import java.util.*;
public class ques2_29jan {
public static void main(String args[])
{
    //maximum of two number without using function
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the value of num1 ");
//    int num1  =  sc.nextInt();
//    System.out.println("Enter the value of num2 ");
//    int num2  =  sc.nextInt();
//    if(num1>=num2)
//    {
//        System.out.println(num1 +" " + "is a greater number ");
//    }
//    else
//    {
//        System.out.println(num2 +" "+ "is a greater number ");
//    }

    //Calculating using max function
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of num1 ");
    int num1  =  sc.nextInt();
    System.out.println("Enter the value of num2 ");
    int num2 =  sc.nextInt();

    int max =  Math.max(num1,num2);
    System.out.println("Max of two number is " + max);

}
}
