package com.edu.Extend_;

public class PC extends Computer{
    private String brand;

    public PC(String CPU, String memory, String disk, String brand) {
        super(CPU, memory, disk);//调用父类的有参构造方法
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String printfInfo(){
        return getDetails() + " brand: " + brand;
    }
}
