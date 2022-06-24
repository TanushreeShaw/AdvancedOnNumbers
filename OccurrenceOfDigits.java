import java.util.*;
public class OccurrenceOfDigits 
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int num,n,d=0,count=0,num1;
        System.out.println("Enter a Number");
        num=in.nextInt();
        System.out.println("Enter a Digit to find its Occurrence:");
        n=in.nextInt();
        num1=num;
        while(num>0)
        {
            d=num%10;
            if(d==n)
            {
                count=count+1;
            }
            num=num/10;
        }
        if(count>0)
        {
            System.out.println("Occurrence of "+n+" in "+num1+" is: "+count);
        }
        else
        {
            System.out.println("Digit is not there in the given Number");
        }
    }
}