import java.util.Scanner;

//计算每个雇员每周工作的小时数
/*
*   1.二维数组
*   2.输入信息
*   3.计算每个员工的总工时
*   4.降序：总工时和二维数组同时进行冒泡排序
*   5.输出
* */
public class Exercise26 {
    public static void main(String[] args) {
        int employeeWorkHour[][] = new int[8][7];
        //输入工时
        Scanner input = new Scanner(System.in);
        //创建一个数组储存每个员工的总工时
        int[] totalTime = new int[8];
        for (int i = 0; i < employeeWorkHour.length; i++) {
            System.out.printf("请输入第%d位的一周工时：\n", i);
            for (int j = 0; j < employeeWorkHour[i].length; j++) {
                employeeWorkHour[i][j] = input.nextInt();
                totalTime[i] += employeeWorkHour[i][j];
            }
        }
        //调用方法
        sort(employeeWorkHour, totalTime);
        //输出工时
        System.out.print("\t\t\tSu\tM\tT\tW\tTh\tF\tSa");
        for (int i = 0; i < employeeWorkHour.length; i++) {
            System.out.print("Employee" + i + "\t");
            for (int j = 0; j < employeeWorkHour[i].length; j++) {
                System.out.print(employeeWorkHour[i][j] + "\t");
            }
            System.out.println();
        }
    }
    //创建一个方法进行排序
    public static int[][] sort(int employeeWorkHour[][], int[] totalTime){
        int temp1 = 0;
        int[] temp2 = new int[8];
        for (int i = 0; i < totalTime.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                if(totalTime[j] >totalTime[j + 1]){
                    temp1 = totalTime[j];
                    totalTime[j] = totalTime[j + 1];
                    totalTime[j + 1] = temp1;

                    temp2 = employeeWorkHour[j];
                    employeeWorkHour[j] = employeeWorkHour[j + 1];
                    employeeWorkHour[j + 1] = temp2;

                }
            }
        }
        return employeeWorkHour;
    }
}
