class A1{
void m()
{
System.out.println("hello m");
}
void n()
{
System.out.println("hello n");
this.m();
}
}
class TestThis4
{
public static void main(String args[])
{
A1 a=new A1();
a.n();
}
}