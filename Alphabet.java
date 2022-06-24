import java.util.*;
public class Alphabet 
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        char ch='\0';
        System.out.println("Enter a Character:");
        ch=in.next().charAt(0);

        if(ch>='a'&&ch<='z')
            System.out.println(ch+" is a Lower Case Alphabet.");
        else if(ch>='A'&&ch<='Z')
            System.out.println(ch+" is an Upper Case Alphabet.");
        else
            System.out.println(ch+" is Not an Alphabet.");
    }
}