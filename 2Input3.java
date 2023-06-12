import java.util.Scanner;
class Input3{
    public static void main(String args[])
	{
	  Scanner scob = new Scanner(System.in);
	  System.out.print("Enter a Number :");//5
	  double num1;
	  num1 = scob.nextDouble();
	  System.out.print("Enter a Number :");//7
	  double num2;
	  num2 = scob.nextDouble();
	  // num1 = 5,num2 = 7
	  System.out.println(num1+"+"+num2+"="+(num1+num2));
	 }
	}