class b
{
a obj;
b(a obj)
{
this.obj=obj;
}
void display()
{
System.out.println(obj.data);
}
}
class a
{
int data=10;
a()
{
b b1=new b(this);
b1.display();
}
public static void main(String args[])
{
a a1=new a();
}
}
