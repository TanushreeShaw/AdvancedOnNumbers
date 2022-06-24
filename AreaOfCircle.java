import java.util.*;
public class AreaOfCircle 
{
    public static double Area(Float r)
    {
        double area=0.0;
        area=3.14*r*r;
        return area;
    } 
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        double area=0.0;
        float radius;
        System.out.println("Enter the Radius of the Circle:");
        radius=in.nextFloat();
        area=Area(radius);
        System.out.println("Area of the Circle is: "+area+" Units.");
    }
}