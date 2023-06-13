import java.util.Scanner;
class A
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int a=0;
int b=1;
int sum=0;
for(int i=1;i<=s;i++)
{
System.out.println();
for(int j=1;j<=i;j++)
{
System.out.print(sum+" ");
a=b;
b=sum;
sum=a+b;

}
}
}
}
