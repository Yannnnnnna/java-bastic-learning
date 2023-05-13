public class Exercise08 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        //把数字传入数组
        for (int i = 1; i < 21; i++) {
            queue.enqueue(i);
        }
        //把数字移除数组，并打印
        while (queue.getSize() != 0){
            System.out.println(queue.dequeue());
        }
    }
}

class Queue {
    //先进后出
    private int[] element;
    private int size;

    public Queue() {
        element = new int[8];
    }

    //加入队列
    public void enqueue(int v) {
        if (size == element.length) {
            int[] newElement = new int[size * 2];
            System.arraycopy(element, 0, newElement, 0, size);
            element = newElement;
        }
        element[size] = v;
        size++;
    }

    //移除元素并返回元素
    public int dequeue() {
        int temp = element[0];
        int[] newElement = new int[element.length - 1];
        System.arraycopy(element, 1, newElement, 0, size - 1);
        element = newElement;
        size--;
        return temp;
    }

    //判断队列是否为空
    public boolean empty() {
        return element == null;
    }
    //返回队列大小
    public int getSize(){
        return size;
    }

}