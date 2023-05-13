import java.math.BigInteger;

public class Exercise16 {
    public static void main(String[] args) {
        BigInteger num = new BigInteger(Long.toString(Long.MAX_VALUE)).add(new BigInteger("2"));
        int count = 0;
        while (count < 5){
            if(num.isProbablePrime(100)){
                System.out.println(num);
                count++;
            }
            num = num.add(new BigInteger("2"));
        }
    }
}
