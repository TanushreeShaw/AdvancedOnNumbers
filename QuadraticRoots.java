import java.util.*;
public class QuadraticRoots 
{
    public static void Roots(double a, double b, double c) 
    {
        double d=0.0, root1=0.0, root2=0.0;

        d=(b*b)-(4*a*c);
        if(d>0)
        {
            System.out.println("Roots are Real and Different.");
            root1=(-b+(Math.sqrt(d)))/(2*a);
            root2=(-b-(Math.sqrt(d)))/(2*a);
            System.out.println("Roots are: "+root1+" and "+root2);
        }
        if(d==0)
        {
            System.out.println("Roots are Real and Equal.");
            root1=(-b)/(2*a);
            root2=(-b)/(2*a);
            System.out.println("Roots are: "+root1+" and "+root2);
        }
        if(d<0)
        {
            System.out.println("Roots are Complex and Different.");
            root1=(-b)/(2*a);
            root2=(-b)/(2*a);
            System.out.println("Roots are: "+root1+"+i and "+root2+"-i");
        }
    }

    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter the Coefficients A, B and C: ");
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        if(a==0)
        {
            System.out.println("A cannot be 0.");
        }
        else
        {
            Roots(a, b, c);
        }
    }
}
