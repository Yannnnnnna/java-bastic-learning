package Experiment06.Exercise06;

import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.Date;

public class Exercise06 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Date());
        list.add(new String());
        list.add(new Circle());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }

    }
}
