public class Exercise04 {
    public static void main(String[] args) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers(120);
        int[] arr = stackOfIntegers.factor();
        for (int i = stackOfIntegers.count - 1;  i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
class StackOfIntegers{
    int num;
    int[] arr;
    int count;
    //创建构造方法指定数字
    public StackOfIntegers(int num) {
        this.num = num;
    }
    //判断是否为数字
    public boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    //
    public int[] factor(){
        arr = new int[16];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j <= num; j++) {
                if(num % j == 0 && isPrime(j)){
                    arr[i] = j;
                    num /= j;
                    count++;
                    break;
                }
            }
            if(num ==1){
                break;
            }
        }
        return arr;
    }
}