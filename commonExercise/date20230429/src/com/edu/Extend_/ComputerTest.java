package com.edu.Extend_;

public class ComputerTest {
    public static void main(String[] args) {
        //PC("intel", 16, 500, "IBM");
        PC pc = new PC("intel", "16G", "500G", "IBM");
        System.out.println(pc.printfInfo());
        pc.setCPU("AMD");
        System.out.println(pc.getDetails());
    }
}
