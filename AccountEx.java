public class AccountEx {

    public static void main(String[] args) {
        Account account = new Account("123455","Priyanka",1000);
        account.deposit(1200);
        account.printAccountDetails();
//        account.deposit(-1200);
//        account.printAccountDetails();
        try {
            account.withdrawl(500);
            account.printAccountDetails();
            account.withdrawl(7000);
        }catch (InsufficientBalance ex)
        {
            System.err.println(ex.getMessage());
        }

    }
}
