class Account
{
    String name, accnumber, type;
    double balance = 0;

   Account(String n, String num, String type, double amount)
   {
       this.name = n;
       this.accnumber = num;
       this.type = type;
       this.balance = amount;
   }
   void depAmount(double amount)
   {
       if(amount >= 500)
       {
           this.balance += amount;
       }
       else
       {
           System.out.println("You can't deposit below $500 ");
       }
   }
   void withdraw(double amount)
   {
       if(this.balance > amount)
       {
           this.balance = this.balance - amount;
       }
       else{
        System.out.println("Your current balnce is" + this.balance+ "You can withdraw less than your current balance");
       }
   }
   void computeInterest(double amount)
   {
       this.balance = this.balance + ((5/100) * this.balance);
   }

   void showBalance()
   {
      System.out.println("Current Balance:" + this.balance);
   }

   public static void main(String args[])
   {
       Account curr = new Account("Swastika", "Ac-207" , "Savings" , 7000);
       curr.showBalance();
       double currbalance = 7000;
       curr.computeInterest(currbalance);
       curr.showBalance();
       System.out.println("Deposit of 1000 Taka:");
       curr.depAmount(1000);
       curr.showBalance();
       System.out.println("Withdraw of 2000 Taka:");
       curr.withdraw(2000);
       curr.showBalance();
   }
}
