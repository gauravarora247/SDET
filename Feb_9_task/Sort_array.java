import java.util.*;
public class Sort_array {

    public static void main (String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
    int arr[] = {12,34,10,1,100,3,4,32};
    int size =  arr.length;
       int left  = 0;
       int right  = size-1;

       while(left<right)
       {
           int temp = arr[left];
           arr[left] =  arr[right];
           arr[right] =  temp;
           left++;
           right--;
       }

       for(int i=0;i<size;i++)
       {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
}
