import java.util.*;
public class MultipleOf4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if ((n&(n-2))==0)
        {
            System.out.println("is multiple of 4");

        }
        else
        {
            System.out.println("is not multiple of 4"); 
        }
    }



}