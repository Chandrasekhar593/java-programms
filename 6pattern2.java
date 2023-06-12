import java.util.Scanner;
class pattern2
{
public static void p1(char c,int col)
{
System.out.println();
for (int j=1;j<=col;j++)
System.out.print(c);
}
public static void p2(char c,int n)
{
for(int i=1;i<=n;i++)
{
p1(c,i);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
p2(ch,row);
}
}