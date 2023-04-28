

public class Exercise06 {
    public static void main(String[] args) {
        //调用类
        StopWatch stopWatch = new StopWatch();

        //创建一个数组储存随机数
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100000);
        }
        //开始计数
        stopWatch.start();
        System.out.println("开始时间为：" + stopWatch.getStartTime());
        //开始排序
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        //排序结束，记录结尾时间
        stopWatch.stop();
        System.out.println("结束时间为：" + stopWatch.getEndTime() + "毫秒");
        //打印执行时间
        System.out.println(stopWatch.getElapsedTime());
    }
}
class StopWatch{
    private long startTime;
    private long endTime;
    //访问构造器方法访问
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    //无参构造器，使用当前时间初始化startTime


    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }
    public void start(){
        this.startTime = System.currentTimeMillis();

    }
    public void stop(){
        endTime = System.currentTimeMillis();

    }
    public long getElapsedTime(){
        return endTime - startTime;
    }
}
