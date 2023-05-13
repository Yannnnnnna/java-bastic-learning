package Experiment06.Exercise07;

import java.util.ArrayList;

public class Exercise07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(2);
        shuffle(list);
        System.out.println(list);

    }
    public static void shuffle(ArrayList<Integer> list){
        java.util.Collections.shuffle(list);
    }

}
