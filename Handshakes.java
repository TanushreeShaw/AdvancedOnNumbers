import java.util.*;
public class Handshakes 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,result=0;
        System.out.println("Enter the Number of People:");
        num=in.nextInt();
        
        result=(num*(num-1))/2;
        System.out.println("Maximum Number of Handshakes: "+result);
    }
}
