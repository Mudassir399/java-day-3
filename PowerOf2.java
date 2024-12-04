import java.util.*;
public class PowerOf2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if ((n&(n-1))==0)
        {
            System.out.println("is power of 2");

        }
        else
        {
            System.out.println("is not power of 2"); 
        }
    }



}