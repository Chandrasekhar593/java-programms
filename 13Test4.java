import java.util.*;
import java.io.*;
class Test4 extends Exception
{
Test4(int c)
{
System.out.println("marks should be positive");
c=0;
System.out.println(c);
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name:");
        String str=sc.nextLine();
        System.out.println("enter your roll number:");
        int a=sc.nextInt();
        System.out.println("enter your marks:");
        int b=sc.nextInt();
        try
        {
            if(b<0)
            {
              throw new Test4(b);  
            }
        }
        catch(Exception e)
        {
            System.out.println("marks should be positive");
        }

    }
}