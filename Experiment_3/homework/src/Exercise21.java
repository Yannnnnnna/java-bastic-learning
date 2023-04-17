/*
游戏：储物柜难题
创建一个方法 1.一个数组储存一百个柜子的开关状态
            2.第几个学生
            3.返回数组（boolean类型）
            4.循环，从第n个学生开始，每除以n就改变柜子的开关状态

*/
public class Exercise21 {
    public static void main(String[] args) {
        boolean[] cupboard = new boolean[100];
        int student = 100;
        for (int i = 1; i <= student; i++) {
            cabinet(cupboard, i);
        }

        for (int i = 0; i < cupboard.length; i++) {
            if(cupboard[i]){
                System.out.println(i + 1);
            }
        }
    }
    public static void cabinet(boolean cupboard[] , int student){

            for (int j = student - 1; j < cupboard.length; j++) {
                if((j + 1) % student == 0){
                    cupboard[j] = !cupboard[j];
                }
            }

    }
}

