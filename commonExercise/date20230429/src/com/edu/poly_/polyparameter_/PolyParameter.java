package com.edu.poly_.polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {
        Employee employee = new Employee("jack", 5000);
        System.out.println(employee.getName() + " " + employee.getAnnual());

        employee = new CommonEmployee("mary", 3000);
        showEmpAnnual(employee);
        testWork(employee);

        employee = new Manager("yanna", 20000, 300000);
        showEmpAnnual(employee);
        testWork(employee);
    }

    public static void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    public static void testWork(Employee e) {
        if (e instanceof CommonEmployee) {
            ((CommonEmployee) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        }
    }
}
