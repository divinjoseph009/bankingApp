public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.createAccount(100, "Divin");
        bank.createAccount(101, "Sam");
        bank.createAccount(102, "Edmund");
        bank.createAccount(2000, "Rais");
        System.out.println(bank.getAccountByNumber(1));
        bank.transferMoney(4, 3, 100);
    }
}
