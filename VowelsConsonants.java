import java.util.*;
public class VowelsConsonants
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        char ch='\0';
        System.out.println("Enter a Character:");
        ch=in.next().charAt(0);

        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println(ch+" is a Vowel.");
        }
        else if(ch>='0'&&ch<='9')
        {
            System.out.println(ch+" is a Digit.");
        }
        else if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z'))
        {
            System.out.println(ch+" is a Consonant.");
        }
        else
        {
            System.out.println(ch+" is a Special Character.");
        }
    }
}