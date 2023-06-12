import java.util.Scanner;
public class pattern1
{
public static void p(int a,char c)
{
int k=a;
char s=c;
for(int i=0;i<k;i++)
{
System.out.println();
for(int j=0;j<=i;j++)
{
System.out.print(s);
}
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
char ch=sc.next().charAt(0);
p(b,ch);
}
}