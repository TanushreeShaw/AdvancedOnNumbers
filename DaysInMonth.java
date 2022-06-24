import java.util.*;
public class DaysInMonth 
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int year,month;
        System.out.println("Enter a Year:");
        year=in.nextInt();
        System.out.println("Enter the Month Number to get the Number of Days:");
        month=in.nextInt();
        if((year%4==0 && month==2) && ((year%100!=0 || year%400==0) && month==2))
        {
            System.out.println("Number of Days is 29.");
            System.out.println("It is a Leap Year.");
        }
        else if(month==2)
        {
            System.out.println("Number of Days is 28.");
            System.out.println("It is Not a Leap Year.");
        }
        else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
        {
            System.out.println("Number of Days is 31.");
        }
        else if(month==4||month==6||month==9||month==11)
        {
            System.out.println("Number of Days is 30.");
        }
        else
        {
            System.out.println("Invalid Data!!");
        }
    }
}