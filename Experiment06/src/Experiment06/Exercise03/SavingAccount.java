package Experiment06.Exercise03;

public class SavingAccount extends Account{
    public SavingAccount() {

    }

    public SavingAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    public void withDraw(double withdraw) {
        double money = super.getBalance() - withdraw;
        if(money < 0){
            System.out.println("您的余额不足，请重新输入。。");
        }else{
            super.setBalance(money);
        }

    }

    @Override
    public String toString() {
        return "此卡为储蓄卡\n" + super.toString();
    }
}
