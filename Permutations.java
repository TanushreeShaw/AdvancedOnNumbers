import java.util.*;
public class Permutations 
{
    public static int Factorial(int num)
    {
        if(num==0)
            return 1;
        else
            return (num*Factorial(num-1));
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,r,num1,num2,result=0;
        System.out.println("Enter the Value of N:");
        n=in.nextInt();
        System.out.println("Enter the Value of R:");
        r=in.nextInt();
        num1=Factorial(n);
        num2=Factorial(Math.abs(n-r));
        result=num1/num2;
        System.out.println("Permutations in which n people can occupy r seats in a classroom is: "+result);

    }
}