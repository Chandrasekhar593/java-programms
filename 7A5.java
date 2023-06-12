class A5
{
A5(){
this(5);
System.out.println("hello a");
}
A5(int x)
{
System.out.println(x);
}
}
class TestThis6
{
public static void main(String args[])
{
A5 a=new A5();
}

}