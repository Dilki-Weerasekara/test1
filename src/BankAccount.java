public class BankAccount {
    /**
     8	      Constructs a bank account with a zero balance
     9	   */
   public BankAccount()
	   {
        	      balance = 0;
        	   }

        	   /**
 16	      Constructs a bank account with a given balance
 17	      @param initialBalance the initial balance
 18	   */
        	   public BankAccount(double initialBalance) {
        	      balance = initialBalance;
        	   }

           /**
 25	      Deposits money into the bank account.
 26	      @param amount the amount to deposit
 27	   */
          public void deposit(double amount)
   {
        	      balance = balance + amount;
           }

        	   /**
 34	      Withdraws money from the bank account.
 35	      @param amount the amount to withdraw
 36	   */
        	   public void withdraw(double amount)
   {
        	      balance = balance - amount;
        	   }

        	   /**
 43	      Gets the current balance of the bank account.
 44	      @return the current balance
 45	   */
        	   public double getBalance()
   {
        	      return balance;
        	   }

        	   /**
 52	      Transfers money from the bank account to another account
 53	      @param other the other account
 54	      @param amount the amount to transfer
 55	   */
        	   public void transfer(BankAccount other, double amount)
	   {
        	      withdraw(amount);
        	      other.deposit(amount);
           }
           private double balance;
}
