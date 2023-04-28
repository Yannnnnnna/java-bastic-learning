import java.util.Date;

public class Exercise07 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withDraw(2500);
        account.deposit(3000);
        System.out.println("余额：" + account.getBalance()
                + " 月利息：" + account.getMonthlyInterestRate() * 100 + "% "
                + " 开户日期：" + account.getDateCreated());

    }
}

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    //默认账户
    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    //特定账户
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
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
    //datecreat 的访问器

    public Date getDateCreated() {
        return dateCreated;
    }

    //返回月利率
    public double getMonthlyInterestRate() {
        return getAnnualLnterestRate() / 100 / 12;
    }

    //从账户去特定的金额
    public void withDraw(double withdraw) {
        balance -= withdraw;
    }

    //像账户中存特定的金额
    public void deposit(double dep) {
        balance += dep;
    }
}
