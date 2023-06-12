class A4
{
A4()
{
System.out.println("hello a");
}
A4(int x)
{
this();
System.out.println(x);
}
}
class TestThis5
{
public static void main(String args[])
{
A4 a=new A4(10);
}
}