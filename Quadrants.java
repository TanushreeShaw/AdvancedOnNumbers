import java.util.*;
public class Quadrants
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int x,y;
        
        System.out.println("Enter the Value of X:");
        x=in.nextInt();
        System.out.println("Enter the Value of Y:");
        y=in.nextInt();

        if(x>0 && y>0)
            System.out.println("First Quagrant.");
        else if(x<0 && y>0)
            System.out.println("Second Quagrant.");
        else if(x<0 && y<0)
            System.out.println("Third Quagrant.");
        else if(x>0 && y<0)
            System.out.println("Fourth Quagrant.");
        else
        System.out.println("Origin.");
    }
}