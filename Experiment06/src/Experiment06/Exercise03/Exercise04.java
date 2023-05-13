package Experiment06.Exercise03;

public class Exercise04 {
    public static void main(String[] args) {
        Account account = new Account(10001, 10000,0.05);
        SavingAccount savingAccount = new SavingAccount(10002, 20000, 0.05);
        CheckingAccount checkingAccount = new CheckingAccount(10003, 5000, 0.05,5000);

        System.out.println(account.toString());
        System.out.println(savingAccount.toString());
        System.out.println(checkingAccount.toString());

        savingAccount.withDraw(50000);
        System.out.println(savingAccount.toString());

        checkingAccount.withDraw(20000);
        System.out.println(checkingAccount.toString());
    }

}
