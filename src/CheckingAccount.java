public class CheckingAccount extends BankAccount{
    /**
     7	      Constructs a checking account with a given balance
     8	      @param initialBalance the initial balance
     9	   */
	   public CheckingAccount(int initialBalance)
	   {
        	      // construct superclass
        	      super(initialBalance);
                  // initialize transaction count
        	      transactionCount = 0;
        	   }

        	   public void deposit(double amount)
	   {
        	      transactionCount++;
        	      // now add amount to balance
        	      super.deposit(amount);
        	   }

        	   public void withdraw(double amount)
	   {
        	      transactionCount++;
        	      // now subtract amount from balance
        	      super.withdraw(amount);
        	   }

        	   /**
 34	      Deducts the accumulated fees and resets the
 35	      transaction count.
 36	   */
        	   public void deductFees()
	   {
              if (transactionCount > FREE_TRANSACTIONS)
            	      {
            	         double fees = TRANSACTION_FEE *
                    	            (transactionCount - FREE_TRANSACTIONS);
            	         super.withdraw(fees);
                  }
        	      transactionCount = 0;
           }

        	   private int transactionCount;

           private static final int FREE_TRANSACTIONS = 3;
   private static final double TRANSACTION_FEE = 2.0;
}
