import model.Account;

public class Main {

    public static void printAccount(Account acc) {
        System.out.println("Id: " + acc.getId());
        System.out.println("Name: " + acc.getHolder());
        System.out.println("Balance: $" + acc.getBalance());
    }

    // POJO = plain old java objects
//    public static void depositInAccount(Account acc, double amountToDeposit) {
//        acc.setBalance(acc.getBalance() + amountToDeposit);
//    }

    public static void main(String[] args) {
        Account acc1 = new Account(1, "John", 300);
        Account acc2 = new Account(2, "Martha", 500);

        // deposit
        acc1.deposit(100);
        acc2.deposit(150);

        printAccount(acc1);
    }
}