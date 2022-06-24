import java.util.*;
public class SumOfTwoPrimes 
{
    public static int Prime(int num)
    {
        int c=0,i;
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                c++;
            }
        }

        if(c==2)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int num,s1,s2,i,flag=0;
        System.out.println("Enter a Number:");
        num=in.nextInt();
        for(i=2;i<=num/2;i++)
        {
            if(Prime(i)==1)
            {
                if(Prime(num-i)==1)
                {
                    s1=i;
                    s2=num-i;
                    System.out.println("The Number "+num+" can be Expressed in Terms of "+s1+" + "+s2+".");
                    flag=1;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("The Number cannot be Expressed as a Sum of Two Prime Numbers.");
        }
    }
}