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

    public void createAccount(double balance, String accountNameHolder) {
        if (!accountMap.containsKey(accountNumber)) {
            Account account = new Account(balance);
            account.setAccountHolderName(accountNameHolder);
            accountMap.put(accountNumber, account);
            System.out.println("Account created");
        }
        else {
            System.out.println("Account already exists!");
        }


    }

    public Account getAccountByNumber() {

        return accountMap.get(accountNumber);
    }

    public void transferMoney() {


    }
}
