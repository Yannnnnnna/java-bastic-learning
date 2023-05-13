package com.edu.poly_.polyparameter_;

public class Manager extends Employee{
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    public void manage(){
        System.out.println("经理正在工作。。。");
    }

    @Override
    public int getAnnual() {
        return super.getAnnual() + bonus;
    }
}
