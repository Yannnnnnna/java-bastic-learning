package Experiment06.Exercise08;

import java.util.Date;
/*Transaction类用来为每笔交易创建一个对象
在银行账户类中，我们使用 Transaction 类型的对象来记录账户的交易历史记录，
这样就可以随时查看账户的交易记录，便于账户管理和财务分析等业务操作。
* */

public class Transaction {
    private Date date;
    private char type;      //"w"代表取款"d"代表存款
    private double amount;  //交易量
    private double balance;     //交易后新的余额
    private String description;     //交易的描述

    public Transaction(char type, double amount, double balance, String description) {
        date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "交易时间: " + date +
                "  存取款: " + type +
                "  交易量: " + amount +
                "  现余额: " + balance +
                "  交易描述: " + description + "\n";
    }
}
