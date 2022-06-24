import java.util.*;
// Java implementation to count decodings
public class DecodingSequence
{

// A Dynamic programming based function
// to count decodings in digit sequence
static int countDecodingDP(String digits, int n)
{
    // For base condition "01123"
    // should return 0
    if (digits.charAt(0) == '0')
    {
        return 0;
    }

    int count0 = 1, count1 = 1, count2;

    // Using last two calculated values,
    // calculate for ith index
    for(int i = 2; i <= n; i++)
    {
        int dig1 = 0, dig2, dig3 = 0;
        
        // Change boolean to int
        if(digits.charAt(i - 1) != '0')
        {
            dig1 = 1;
        }
        if(digits.charAt(i - 2) == '1')
        {
            dig2 = 1;
        }
        else
            dig2 = 0;
            
        if(digits.charAt(i - 2) == '2' && digits.charAt(i - 1) <= '7')
        {
            dig3 = 1;
        }
        count2 = dig1 * count1 +
                dig2 + dig3 * count0;
        
        count0 = count1;
        count1 = count2;
    }

    // Return the required answer
    return count1;
}
// Driver Code
public static void main(String[] args)
{
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a Sequence:");
    String digits = in.nextLine();
    int n = digits.length();

    // Function call
    System.out.println("the Total Possible Decodings of Sequence "+digits+" is: "+countDecodingDP(digits, n));
}
}