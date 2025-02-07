import java.util.*;


public class Vowels_and_consonants_29jan {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().toLowerCase().charAt(0);

        if(Character.isLetter(ch))
        {
            if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                System.out.println(ch + " " + "is a vowel ");
            }
            else
            {
                System.out.println(ch + "is a consonant");
            }
        }

    }

}
