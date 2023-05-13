package Experiment06.Exercise03;

public class CheckingAccount extends Account{
    private double overdraftLimit;

    public CheckingAccount(int id, double balance, double annualInterestRate, double overdraftLimit) {
        super(id, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    public void withDraw(double withdraw) {
        double money = super.getBalance() - withdraw;
        if(money < (-overdraftLimit)){
            System.out.println("您的透支额度不足，请重新输入。。");
        }else{
            super.setBalance(money);
        }

    }

    @Override
    public String toString() {
        return "此卡为信用卡\n" + super.toString() + "透支额度为：" + overdraftLimit + "\n";
    }
}
