public class Account implements IAccount{
    public int getAccountNumber() {
        return accountNumber;
    }
//    public void setAccountNumber(int accountNumber) {
//        this.accountNumber = accountNumber;
//    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    private int accountNumber;
    private static int nextAccountNumber = 1;
    private String accountHolderName;
    private double balance;

    Account(double balance){
        this.balance = balance;
        this.accountNumber = nextAccountNumber++;
    }

    public void deposit(Account account, double depositAmount){
        account.balance += depositAmount;
    }
    public void withdraw(Account account, double withdrawAmount){
        if (withdrawAmount <= account.balance) {
            account.balance -= withdrawAmount;
        }
        else {
            System.out.println("Insufficient funds");
        }
    }
    public double getBalance(Account account){
        System.out.println("Account balance:" + account.balance);
    return account.balance;}

    public String toString() {
        return "name: " + accountHolderName + ", " + "Account Number: " + accountNumber + ", " + "Account Balance: " + balance;
    }



}
