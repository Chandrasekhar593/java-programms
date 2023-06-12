import java.util.Scanner;
class pattern4
{
public static void p3(char ch1,int q)
{
for(int c=q;c>=1;c--)
{
System.out.println();
for(int d=1;d<=c;d++)
{
System.out.print(ch1);
}
}
}
public static void p2(char ch,int p)
{
for(int i=1;i<=p;i++)
{
System.out.println();
for(int j=1;j<=i;j++)
{
System.out.print(ch);
}
}
}
public static void p1(char c,int b)
{
System.out.println();
int x,y;
if(b%2==0)
{
x=b/2;
y=b/2;
p2(c,x);
p3(c,y);
}
else
{
x=b/2;
y=(b+1)/2;
p2(c,x);
p3(c,y);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int a=sc.nextInt();
p1(ch,a);
}
}