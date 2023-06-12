// Java table for printing multiplication table
import java.util.Scanner;
class Day4table{ 
    public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		char space=' ';
		for(int i=0;i<=10;i++)
		{
	      System.out.print(a);
		  System.out.println(space+"*"+space+i+" = "+(a*i));
		}// for loop ends
	}//main() ends
}//class ends
