// Java table for printing multiplication table
import java.util.Scanner;
class Day4series01{ 
    public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=0;i<=a;i++)
		{
	      if(i%b==0)
		  System.out.print(i);
	      if(i== a)
		  {
			  break;
		  }
	      if(i != a)
		  {
			  System.out.print(",");
		  }
		}// for loop ends
	}//main() ends
}//class ends
