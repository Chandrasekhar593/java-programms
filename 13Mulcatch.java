public class Mulcatch
{
public static void main(String args[])
{
try{
int a[]=new int[5];
a[5]=30/0;
}
catch(ArithmeticException e)
{
System.out.println("Arithemetivc Exception occurs");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Arrayindexoutofboundexception");
}
catch(Exception e)
{
System.out.println("parent Exception occurs");
}
System.out.println("rest of the code");
}
}