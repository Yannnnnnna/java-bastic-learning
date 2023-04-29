package com.edu.Extend_;

public class NotePad extends Computer{
    private String color;
    public NotePad(String CPU, String memory, String disk, String color) {
        super(CPU, memory, disk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String print(){
        System.out.println("NotePad 的信息为：");
        return getDetails() + " color: " + color;
    }
}
