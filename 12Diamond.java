import java.util.Scanner;
class Diamond
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int a=sc.nextInt();
for(int i=a/2,j=1;j<=a;i--,j+=2)
{
System.out.println();
for(int k=0;k<i;k++)
{
System.out.print(" ");
}
for(int l=0;l<j;l++)
{
System.out.print(ch);
}
for(int m=0;m<i;m++)
{
System.out.print(" ");
}
}
for(int q=a-2,p=1;p<a;q-=2,p++)
{
System.out.println();
for(int r=0;r<p;r++)
System.out.print(" ");
for(int s=0;s<q;s++)
System.out.print(ch);
for(int t=0;t<p;t++)
System.out.print(" ");
}






}
}

