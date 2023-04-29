public class Exercise05 {
    public static void main(String[] args) {
        StackOfIntegers_ stackOfIntegers = new StackOfIntegers_(120);

        int[] arr = stackOfIntegers.getArr();
        for (int i = stackOfIntegers.count - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}

class StackOfIntegers_ {
    int[] arr;
    int num;
    int count;

    public StackOfIntegers_(int num) {
        this.num = num;
    }

    public boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] getArr() {
        arr = new int[num / 2];
        count = 0;
        for (int i = 2; i < num; i++) {
            if (isPrime(i)) {
                arr[count] = i;
                count++;
            }
        }
        return arr;
    }
}
