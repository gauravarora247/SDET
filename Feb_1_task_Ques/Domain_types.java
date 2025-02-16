import java.util.*;
public class Domain_types {


 public static String geturltype(String url)
 {
     String [][] domaintypes = {
             {".com","Commercial website"},
     {".org","Non-profit organization"},
     { ".edu", "Educational institution"},
     {".gov", "Government website"},
     {".net", "Network-related website"},
     {".info", "Informational website"},
     };


     for(String[] domain :domaintypes)
     {
         if(url.endsWith(domain[0]))
         {
             return domain[1];
         }
     }
     return "Invalid input";

 }


public static void main (String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the url type ");
    String url =  sc.nextLine();
    String result  = geturltype(url);
    System.out.println("Website type is  "+result);
}

}
