import java.util.Scanner;

   public class AccountTest
   {
      public static void main(String[] args)
      {
        Account account1 = new Account("Jane Green", 50.00);


         // display initial balance of each object
         System.out.printf("%s balance: $%.2f%n",
            account1.getName(), account1.getBalance());

         Scanner input = new Scanner(System.in);
         System.out.print("Add: "); // prompt
         double depositAmount = input.nextDouble(); // obtain user input
        account1.deposit(depositAmount); // add to account1's balance

         // display balances
         System.out.printf("%s balance: $%.2f%n",
            account1.getName(), account1.getBalance());


      }
  }
