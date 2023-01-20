class BankAcc
{
	// class variable declaration
	String name, acc_number, type;
	float balance = 0;
	
	BankAcc(String n, String num, String type, float amount)
	{
		this.name = n;
		this.acc_number = num;
		this.type = type;
		this.balance = amount;
	}
	
	/*
	To deposit an amount between 500 and 50000
	*/
	void deposit(float amount)
	{
		if(amount >= 500 && amount <= 50000) {
			this.balance += amount;
		}
	}
	
	void withdraw(float amount) 
	{
		if(this.balance > amount) 
		{
			this.balance = this.balance - amount;
		}else 
		{
			System.out.println("Your current balance is " + this.balance+ " You can withdraw less than your current balance");
		}
	}	
	
	void display()
	{
		System.out.println("Name: " + this.name);
		System.out.println("Current Balance: " + this.balance);
	}
	
	
	public static void main(String args[])
	{
		BankAcc acc = new BankAcc("Rahim", "Acc-123", 
		"Savings", 500);
		acc.display();
		
		// deposit
		System.out.println("Deposit of 700 TAKA");
		float deposit = 700;
		acc.deposit(deposit);
		acc.display();
		
		// withdraw
		System.out.println("Withdraw of 1000 TAKA");
		acc.withdraw(1000);
		acc.display();
		
	}


}