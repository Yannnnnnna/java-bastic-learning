import java.math.BigInteger;


public class Exercise14 {
    public static void main(String[] args) {
        //创建一个BigInteger对象来储存50位数字
        BigInteger num = new BigInteger("10000000000000000000000000000000000000000000000000");
        int count = 0;//用来计数符合要求的数字
        while (count < 10) {
            //用remainder进行取模运算  equals来判断是否相等
            //用BigInteger.ZERO避免创建一个新的对象
            if (num.remainder(new BigInteger("2")).equals(BigInteger.ZERO)
                    || num.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) {
                System.out.println(num);
                count++;
            }
            //数字加一
            num = num.add(BigInteger.ONE);
        }
//        BigInteger bigInteger = new BigInteger("1000000000000000000000000000000000000000000000000");
//        int count = 0;
//        while (count < 10){
//            if(bigInteger.remainder(new BigInteger("3")).equals(BigInteger.ZERO)
//            || bigInteger.remainder(new BigInteger("2")).equals(BigInteger.ZERO)){
//                count++;
//                System.out.println(bigInteger);
//            }
//            bigInteger = bigInteger.add(BigInteger.ONE);
//        }
    }
}