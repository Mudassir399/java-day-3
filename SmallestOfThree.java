import java.util.*;
public class SmallestOfThree
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if ((a<b)&&(a<c))
        {
            System.out.println("smallest is a:"+a);
        }
        else if ((b<a)&&(b<c))
        {
            System.out.println("smallest is b:"+b);
        }
        else
        {
            System.out.println("smallest is c:"+c);
        }
    }
}