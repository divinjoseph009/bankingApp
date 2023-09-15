public interface IAccount {
    void deposit(Account account, double depositAmount);
    void withdraw(Account account, double withdrawAmount);
    double getBalance(Account account);
}
