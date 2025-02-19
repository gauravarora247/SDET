import java.util.*;
public class Smallest_in_array {

//    public static int find_secondsmallest (int arr[])
//    {
//        int size = arr.length;
//
//        Arrays.sort(arr);
//
//        return arr[1];
//
//
//    }
//    public static void main(String[] args )
//    {
//
//     int arr[] =  {111,13,25,9,34,1};
//
//     int second_smallest = find_secondsmallest(arr);
//    System.out.println("Second smallest is "+second_smallest);
//    }


    //another way of finding the second smallest element in the array


    public static int find_secondsmallest(int arr[])
    {
        int size =  arr.length;

        int smallest =  Integer.MAX_VALUE;

        for(int i=0;i<size;i++)
        {
            if(arr[i]<smallest)
            {
                smallest =  arr[i];
            }
        }

        int Second_smallest =  Integer.MAX_VALUE;

        for(int i=0;i<size;i++)
        {
            if(arr[i]<Second_smallest && arr[i] > smallest)
            {
                Second_smallest =  smallest;
            }
        }
        return Second_smallest;
    }


    public static void main (String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int num = sc.nextInt();
        int arr[] = new int [num];
        System.out.println("Enter the elements of array ");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]  = sc.nextInt();
        }
        int second_smallest = find_secondsmallest(arr);

        System.out.println("Second smallest element in the array is "+second_smallest);



    }

}
