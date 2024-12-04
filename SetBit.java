import java.util.*;
public class SetBit
{
    public static void main(String[] args)
    {
        int a=10;
        int pos=2;
        if ((a&(1<<pos))!=0)
        {
            System.out.println("set bit");

        }
        else
        {
            System.out.println("not set bit"); 
        }
    }



}