//java program to demonstarte the working if a banking system
class Account{
   int acc_no;
   String name;
   float amount;
   void insert(int a,String n,float amt)
   {
     acc_no =a;
	 name = n;
	 amount = amt;
	 System.out.println(a+" "+n+" "+amt);
   }
   //deposit method
   void deposit(float amt)
   {
     amount = amount + amt;
	 System.out.println(amt+" Deposited");
    }
	//check balance method
	void balance()
	{
	  System.out.println(amount+" balance");
	 }
	 // withdraw method
	 void withdraw(float amt)
   {
	   if(amount<amt)
	   {
		   System.out.println("Insufficient balance");
	   }
	   else{
		   amount = amount - amt;
		   System.out.println(amt+" withdrawn");
	   }
    }
}
class TestAccount{
	public static void main(String args[])
	{
	  Account a1=new Account();
	  a1.insert(1111,"raju",230000);
	  a1.deposit(500000);
	  a1.withdraw(2000);
	  a1.balance();
	  a1.withdraw(3000);
	  a1.balance();
	}
}
	  