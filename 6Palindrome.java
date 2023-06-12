import java.util.Scanner;
public class Palindrome
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=0;
int n=a;
while(a>0)
{
b=b*10+(a%10);
a=a/10;
}
System.out.println(b);
if(n==b)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}

