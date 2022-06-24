import java.util.*;
public class NumberToWords 
{
    // Strings at index 0 is not used, it is to make array
    // indexing simple
    static String one[]={"","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine ","Ten ",
                        "Eleven ","Twelve ","Thirteen ","Fourteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Nineteen "};
    static String ten[]={"","", "Twenty ","Thirty ","Fourty ","Fifty ","Sixty ","Seventy ","Eighty ","Ninety "};

    // n is 1- or 2- digit number
    public static String NumbertoWords(int n, String s) 
    {
        String str="";
        // if n is more than 19, divide it

        if(n>19)
        {
            str=str+ten[n/10]+one[n%10];
        }
        else
        {
            str=str+one[n];
        }

        // if n is non-zero
        if(n!=0)
        {
            str=str+s;
        }

        return str;
    }

    // Function to print a given number in words
    public static String ConvertToWords(int n) 
    {
        String str="";
        // handles digits at thousands and tens thousands
        // places (if any)
        str=str+NumbertoWords((int)(n/1000), "Thousand ");

        // handles digit at hundreds places (if any)
        str=str+NumbertoWords((int)((n/100)%10), "Hundred ");

        if(n>100 && n%100>0)
        {
            str=str+"and ";
        }
        // handles digits at ones and tens places (if any)
        str=str+NumbertoWords((int)(n%100), "");
        return str;
    }

    // Driver code
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int n,len=0;
        String st="";
        System.out.println("Enter a Number:");
        n=in.nextInt();
        st=Integer.toString(n);
        len=st.length();

        if(len>4)
        {
            System.out.println("Number should be less than 10000.");
        }
        else
        {
            System.out.println("Answer is: "+ConvertToWords(n)+".");
        }
    }
}
