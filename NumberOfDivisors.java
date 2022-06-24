import java.util.*;
public class NumberOfDivisors 
{
    public static int Divisors(int num) 
    {
        int i,count=0;
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count=count+1;
            }
        }
        return count;
    }

    public static void Count(int num, int n) 
    {
        int c=0,i;
        System.out.println("Numbers having "+n+" Divisors: ");
        for(i=1;i<=num;i++)
        {
            if(Divisors(i)==n)
            {
                c=c+1;
                System.out.println(i);
            }
        }
        System.out.println("Number of "+n+" Divisors in "+num+" is: "+c);
    }
    
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int num,n;
        System.out.println("Enter the Number to find Divisors: ");
        num=in.nextInt();
        System.out.println("Enter the Number of Divisors to find the Count: ");
        n=in.nextInt();
        Count(num, n);
    }
}