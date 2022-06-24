import java.util.*;
public class ASCII_Characters 
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        char ch='\0';
        int chr=0;

        System.out.println("Enter a Character:");
        ch=in.next().charAt(0);
        chr=ch;
        System.out.print("ASCII Value of the Character "+ch+" is: "+chr);
    }
}