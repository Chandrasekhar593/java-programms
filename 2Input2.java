import java.util.Scanner;
class Input2{
    public static int add(int a,int b)
	{
	   return a+b;
	  }
	public static int sub(int a,int b)
	{
	   return a-b;
	  }
	 public static int mul(int a,int b)
	{
	   return a*b;
	  }
	 public static double div(int a,int b)
	{
	   return a/b;
	  }
	  public static double mod(int a,int b)
	{
	   return a%b;
	  }
    public static void main(String args[])
	{
	  Scanner scob = new Scanner(System.in);
	  System.out.print("Enter a Number :");//5
	  int num1;
	  num1 = scob.nextInt();
	  System.out.print("Enter a Number :");//7
	  int num2;
	  num2 = scob.nextInt();
	  // num1 = 5,num2 = 7
	  System.out.println(num1+"+"+num2+"="+add(num1,num2));
	  System.out.println(num1+"-"+num2+"="+sub(num1,num2));
	  System.out.println(num1+"*"+num2+"="+mul(num1,num2));
	  System.out.println(num1+"/"+num2+"="+div(num1,num2));
	  System.out.println(num1+"%"+num2+"="+mod(num1,num2));
	 }
	}