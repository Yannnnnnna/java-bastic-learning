package Experiment06.Exercise10;

import java.util.ArrayList;

public class MyStack extends ArrayList {
    private ArrayList<String> list = new ArrayList<>();

    public MyStack() {

    }

    public MyStack(ArrayList<String> list) {
        this.list = list;
    }

    public boolean isEmpty(){
        return list.isEmpty();

    }
    public int getSize(){
        return list.size();
    }
    public String peek(){
        return list.get(getSize() -1);
    }
    public String pop(){
        String o = list.get(getSize() -1);
        list.remove(getSize() - 1);
        return o;
    }
    public void push(String o){
        list.add(o);
    }
    public String toString(){
        return "stack: " + list.toString();
    }


}
