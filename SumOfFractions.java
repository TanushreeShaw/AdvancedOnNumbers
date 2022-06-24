import java.util.*;
public class SumOfFractions 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int numerator1,numerator2,denominator1,denominator2,x,y,i,gcd=0,lcm1=0,lcm2=0;
        System.out.println("Numerator 1:");
        numerator1=in.nextInt();
        System.out.println("Numerator 2:");
        numerator2=in.nextInt();
        System.out.println("Denominator 1:");
        denominator1=in.nextInt();
        System.out.println("Denominator 2:");
        denominator2=in.nextInt();
        x=(numerator1*denominator2)+(numerator2*denominator1);
        y=denominator1*denominator2;
        for(i=1;i<=x && i<=y;i++)
        {
            if(x%i==0 && y%i==0)
                gcd=i;
        }
        lcm1=x/gcd;
        lcm2=y/gcd;

        if(lcm2==1)
            System.out.println("The Sum of Fractions : "+numerator1+"/"+denominator1+" and "+numerator2+"/"+denominator2+" is: "+lcm1+".");
        else
            System.out.println("The Sum of Fractions : "+numerator1+"/"+denominator1+" and "+numerator2+"/"+denominator2+" is: "+lcm1+"/"+lcm2+".");
    }
}
