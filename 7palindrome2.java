import java.util.Scanner;
class Palindrome2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String str1="";
int ascii;
for(int i=str.length()-1;i>=0;i--)
{
if (str.charAt(i)>='A' && str.charAt(i)<='Z')
{
ascii=str.charAt(i);
ascii+=32;
str1=str1+(char)ascii;
}
else
{
str1=str1+str.charAt(i);
}
}
System.out.println("str1:"+str1);
str=str1;
String rev="";
for(int i=str.length()-1;i>=0;i--)
{
rev=rev+str.charAt(i);
}
if(str.equals(rev))
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}
}