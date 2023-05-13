package Experiment06.Exercise08;

import java.util.ArrayList;
import java.util.Date;

public class NewAccount {
    private int id;     //用户ID
    private double balance;     //余额
    private double annualInterestRate;      //年利率
    private java.util.Date dateCreated;     //开户日期
    private String name;        //客户名字
    private ArrayList<Transaction> transactions;


    //默认账户
    public NewAccount() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    //特定账户

    public NewAccount(int id, double balance, double annualInterestRate,
                       String name) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date();
        this.name = name;
        transactions = new ArrayList<>();
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
        transactions.add(new Transaction('w', withdraw, balance, "从账户中取钱"));
    }

    //像账户中存特定的金额
    public void deposit(double dep) {
        balance += dep;
        transactions.add(new Transaction('D', dep, balance, "向账户中存钱"));
    }

    //打印信息
    public String toString() {
        return "ID为：" + id + "\n" +
                "余额为：" + balance + "\n" +
                "年利率为：" + annualInterestRate + "\n" +
                "开户日期为：" + dateCreated + "\n" +
                transactions.toString();
    }

}



