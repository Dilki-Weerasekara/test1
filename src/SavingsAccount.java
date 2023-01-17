public class SavingsAccount extends BankAccount {
    /**
     7	      Constructs a bank account with a given interest rate
     8	      @param rate the interest rate
     9	   */
	   public SavingsAccount(double rate)
	   {
              interestRate = rate;
        	   }
           /**
 16	      Adds the earned interest to the account balance.
 17   */
        	   public void addInterest()
   {
              double interest = getBalance() * interestRate / 100;
        	      deposit(interest);
        	   }

    private double interestRate;
}
