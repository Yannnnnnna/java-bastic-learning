package Experiment06.Exercise03;



public class Account {
    private int id;     //用户ID
    private double balance;     //余额
    private double annualInterestRate;      //年利率
    private java.util.Date dateCreated;     //开户日期

    //默认账户
    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    //特定账户

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new java.util.Date();
    }

    //修改器和访问器

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualLnterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }




    //从账户qu特定的金额
    public void withDraw(double withdraw) {
        balance -= withdraw;
    }

    //像账户中存特定的金额
    public void deposit(double dep) {
        balance += dep;
    }

    //打印信息
    public String toString() {
        return "ID为：" + id + "\n" +
                "余额为：" + balance + "\n" +
                "年利率为：" + annualInterestRate + "\n" +
                "开户日期为：" + dateCreated + "\n";
    }

}
