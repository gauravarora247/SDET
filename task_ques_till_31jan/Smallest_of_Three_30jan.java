import java.util.*;


public class Smallest_of_Three_30jan {

//public static void main(String args[])
//{
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the value of num1 ");
//    int num1 =  sc.nextInt();
//    System.out.println("Enter the value of num2 ");
//    int num2  =  sc.nextInt();
//    System.out.println("Enter the value of num3 ");
//    int num3  =  sc.nextInt();
//
//    int smallest;
//
//    if (num1 <= num2 && num1 <= num3)
//    {
//        smallest  =  num1;
//    }
//    else if(num2 <=  num1 && num2 <= num3)
//    {
//        smallest =  num2;
//    }
//    else
//    {
//        smallest  =  num3;
//    }
//
//    System.out.println("Smallest number is  "+ ""+ smallest);
//
//}
    //finding smallest of threee using function
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1 ");
        int num1  =  sc.nextInt();
        System.out.println("Enter the value of num2  ");
        int num2 =  sc.nextInt();
        System.out.println("Enter the value of num3 ");
        int num3  = sc.nextInt();

        int smallest =  Math.min(num1,Math.min(num2,num3));
        System.out.println("Smallest of three number is " + smallest);

    }
}
