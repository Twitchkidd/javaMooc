
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        Account mattsAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("My account", 0.00);
        mattsAccount.withdrawal(100.00);
        myAccount.deposit(100.00);
        System.out.println(mattsAccount.toString());
        System.out.println(myAccount.toString());
    }
}
