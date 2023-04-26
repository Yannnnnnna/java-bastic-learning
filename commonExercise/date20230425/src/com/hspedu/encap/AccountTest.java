package com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Jack");
        account.setBenefit(60);
        account.setCode("123456");
        account.print();
    }
}
