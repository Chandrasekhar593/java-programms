import java.util.Scanner;
public class digitextract
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char ch=str.charAt(0);
String str1="";
for(int i=0;i<=str.length()-1;i++)
{
ch=str.charAt(i);
if(ch >='0' && ch<='9')
{
str1=str1+ch;
}
}
System.out.println(str1);
}
}