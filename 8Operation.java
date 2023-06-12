public class Operation
{
int square(int n)
{
return n*n;
}
}
class G
{
double pi=3.14d;
double area(int radius)
{
Operation op=new Operation();
int rsquare;
rsquare=op.square(radius);
return pi*rsquare;
}
public static void main(String args[])
{
G c=new G();
double result=c.area(10);
System.out.println(result);

}
}

