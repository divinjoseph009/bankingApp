import java.util.HashMap;

public class Bank {

    int accountNumber;
    String accountNameHolder;

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountNameHolder() {
        return accountNameHolder;
    }



    HashMap<Integer, Account> accountMap = new HashMap<Integer, Account>();

    public void createAccount(double balance) {
        if (!accountMap.containsKey(accountNumber)) {
            Account account = new Account(balance);
            accountMap.put(accountNumber, Account);
            System.out.println("Account created");
        }
        else {
            System.out.println("No!");
        }


    }

    public Account getAccountByNumber() {

        return null;
    }

    public void transferMoney() {

    }
}
