import java.util.Scanner;
class Palindrome1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int a=str.length()-1;
char ch=sc.next().charAt(a);
String s="";
for(int i=a;i>=0;i--)
{
ch=str.charAt(i);
s=s+ch;
}
if(str.equals(s))
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not Palindrome");
}
}
}
