public class Mulcatch1
{
public static void main(String args[])
{

int a[]=new int[5];
a[0]=11;a[1]=5;a[2]=0;a[3]=33;a[4]=44;
try{
for(int i=0;i<=5;i++)
System.out.println(100/a[i]);
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