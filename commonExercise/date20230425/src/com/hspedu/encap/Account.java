package com.hspedu.encap;

public class Account {
    public String name;
    int benefit;
     private String code;

    public Account() {

    }

    public Account(String name, int benefit, String code) {
        this.setName(name);
        this.setBenefit(benefit);
        this.setCode(code);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len = name.length();
        if(len >= 2 && len <= 4){
            this.name = name;
        }else {
            System.out.println("你输入的名字长度有误，请重新输入");
            this.name = "Fault";
        }

    }

    public int getBenefit() {
        return benefit;
    }

    public void setBenefit(int benefit) {
        this.benefit = benefit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if(code.length() != 6){
            System.out.println("你输入的密码长度有误，请重新输入");
            this.code = "000000";
        }else{
            this.code = code;
        }

    }
    public void print(){
        System.out.println(name + code + benefit);
    }
}
