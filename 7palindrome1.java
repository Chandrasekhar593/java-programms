import java.util.Scanner;
class Palindrome1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
int a=str.length()-1;
char ch=str.charAt(a);
String s="";
for(int i=a;i>=0;i--)
{
ch=str.charAt(i);
s=s+ch;
}
if(str.equalsIgnoreCase(s))
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not Palindrome");
}
}
}
