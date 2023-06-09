import java.math.BigInteger;

public class Exercise19 {
    public static void main(String[] args) {

        BigInteger num = new BigInteger(Long.toString(Long.MAX_VALUE));
        int count = 0;
        while (count < 10) {

            if (num.remainder(new BigInteger("5")).equals(BigInteger.ZERO)
                    || num.remainder(new BigInteger("6")).equals(BigInteger.ZERO)) {
                System.out.println(num);
                count++;
            }
            //数字加一
            num = num.add(BigInteger.ONE);
        }
    }
}
