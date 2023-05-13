package com.edu.poly_.polyparameter_;

public class CommonEmployee extends Employee{
    public CommonEmployee(String name, int salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("普通员工正在工作。。。");
    }

    @Override
    public int getAnnual() {
        return super.getAnnual();
    }
}
