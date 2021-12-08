public class Account {

    String accountNumber;
    String accountHolderName;
    double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount)
    {
         if(amount<0)
         {
              throw new BadFormatException("Amount Can not be negative for deposit");
         }

         balance+= amount;
    }

    public double withdrawl(double amount) throws InsufficientBalance
    {

        if(amount<0)
        {
            throw new BadFormatException("Amount Can not be negative for deposit");
        }
        if(amount>balance)
        {
            throw new InsufficientBalance("Available Balance : Rs "+balance+" requested for withdrawl : "+amount+" so thransaction can not be completed");
        }

        balance-=amount;
        return balance;
    }

    public void printAccountDetails()
    {
        System.out.println(accountNumber+"   "+accountHolderName+"   "+balance);
    }
}
