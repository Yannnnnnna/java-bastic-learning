
//        /*对于一个数x，其平方根可以通过求解方程f(y) = y^2 - x = 0的根来得到。
//        具体做法是，从一个初始值y0开始，不断迭代求解下一个值yn+1，
//        直到满足|yn+1 - yn| < ε，其中ε为一个足够小的正数。
//        每次迭代的公式为yn+1 = (yn + x / yn) / 2。*/
//

import java.math.BigInteger;

public class Exercise15 {
    public static void main(String[] args) {
        BigInteger num = new BigInteger(Long.toString(Long.MAX_VALUE)).add(BigInteger.ONE);
        int count = 0;
        while (count < 10) {
            BigInteger square = num.multiply(num);
            /*由于计算机中整数的表示范围是有限的，
            当平方数的值超过了这个范围时，它的值就会发生溢出，变成负数。
            这就导致了程序在计算小于 Long.MAX_VALUE 的平方数时，
            仍然会将它们误认为是大于 Long.MAX_VALUE 的平方数，并将它们输出。
             */
            if (square.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0 && isSquareNumber(square)) {
                System.out.println(square);
                count++;
            }
            num = num.add(BigInteger.ONE);
        }
    }
    public static boolean isSquareNumber(BigInteger num) {
        BigInteger x = num;
        while (x.multiply(x).compareTo(num) > 0) {
            x = x.add(num.divide(x)).divide(new BigInteger("2"));
        }
        return x.multiply(x).equals(num);
    }
}

