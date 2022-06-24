public class PrimeNumbers 
{
    public static int Prime(int num) 
    {
        int c=0,i;
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                c++;
            }
        }

        if(c==2)
            return 1;
        else
            return 0;
    }

    public static void main(String args[]) 
    {
        int i;
        System.out.println("The Prime Numbers between 1 and 100 are:");
        for(i=1;i<=100;i++)
        {
            if(Prime(i)==1)
                System.out.println(i);
        }
    }
}