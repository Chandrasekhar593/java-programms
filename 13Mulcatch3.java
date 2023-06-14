public class Mulcatch3
{
public static void main(String args[])
{

try{
int a[]=new int[5];
a[5]=30/0;
}
catch(Exception e)
{
System.out.println("parent Exception occurs");
}
catch(ArithmeticException e)
{
System.out.println("Arithemetivc Exception occurs");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Arrayindexoutofboundexception");


System.out.println("rest of the code");}
}
}