import java.util.Scanner;
class print_stars
{
public static void print(int i,char c)
{
int k=0;
for(k=1;k<=i;k=k+1)
{
System.out.println(c);
}
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int j=s.nextInt();
char c=s.next().charAt(0);
print(j,c);
System.out.println(" ");
}
}

