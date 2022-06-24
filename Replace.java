import java.util.*;
public class Replace 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int i,len=0,num,result=0;
        String str="",str1="";
        System.out.println("Enter an Integer Value:");
        num=in.nextInt();
        str=Integer.toString(num);
        len=str.length();
        for(i=0;i<len;i++)
        {
            if(str.charAt(i)=='0')
            {
                str1=str1+"1";
            }
            else
            {
                str1=str1+str.charAt(i);
            }
        }
        result=Integer.parseInt(str1);
        System.out.println("The Result is: "+result);
    } 
}
