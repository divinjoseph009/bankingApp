import java.util.HashMap;

public class Bank {

//    int accountNumber;
    String accountNameHolder;

//    public int getAccountNumber() {
//        return accountNumber;
//    }

    public String getAccountNameHolder() {
        return accountNameHolder;
    }



    HashMap<Integer, Account> accountMap = new HashMap<Integer, Account>();

    public void createAccount(double balance, String accountNameHolder) {

            Account account = new Account(balance);
            account.setAccountHolderName(accountNameHolder);
            accountMap.put(account.getAccountNumber(), account);
            System.out.println("Account created");

    }

    public Account getAccountByNumber(int accountNumber) {

        return accountMap.get(accountNumber);
    }

    public void transferMoney() {


    }
}
