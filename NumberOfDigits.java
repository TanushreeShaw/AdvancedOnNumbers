import java.util.*;
public class NumberOfDigits
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int len=0,num,i,count=0;
        String str="";
        System.out.println("Enter a Number:");
        num=in.nextInt();
        str=Integer.toString(num);
        len=str.length();

        for(i=0;i<len;i++)
        {
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
            {
                count=count+1;
            }
            else
            {
                count=0;
            }
        }

        if(count>0)
        {
            System.out.println("Number of Digits in the Number "+num+" is: "+count);
        }
        else
        {
            System.out.println("Not a Valid Number: "+num);
        }
    }
}