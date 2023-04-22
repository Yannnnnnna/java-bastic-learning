import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bank = input.nextInt();
        int limit = input.nextInt();
        //输入银行余额
        double []balance = new double[bank];
        double [][]borrowers = new double[bank][bank];
        for (int i = 0; i < bank; i++) {
            balance[i] = input.nextDouble();
            int numOfBorrowerBanks = input.nextInt();
            for (int j = 0; j < numOfBorrowerBanks; j++) {
                int borrowBank = input.nextInt();
                borrowers[i][borrowBank] = input.nextDouble();
            }
        }
        //打印银行贷款情况
        print(borrowers);
        double[] amount = totalAmount(balance, borrowers);
        //打印总共金额
        print(amount);


        System.out.println("\n处于危险的银行：");
        for (int num = 0; num < bank; num++) {
            //判断是否小于限制值
            boolean []isDanger = new boolean[bank];
            for (int i = 0; i < bank; i++) {
                if (amount[i] > limit) {
                    isDanger[i] = true;
                } else {
                    isDanger[i] = false;
                }
            }
            //小于限制值的银行相关的值设为0
            double [][]nextBorrowers = bankChange(isDanger, borrowers);
            amount = totalAmount(balance, nextBorrowers);

        }
        for (int i = 0; i < bank; i++) {
            if (amount[i] < limit) {
                System.out.println(i + " ");
            }
        }


    }

    public static void print(double[][] borrowers) {
        for (int i = 0; i < borrowers.length; i++) {
            for (int j = 0; j < borrowers[i].length; j++) {
                System.out.print(borrowers[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[] amount) {
        for (int i = 0; i < amount.length; i++) {
            System.out.print(amount[i] + " ");
        }
    }

    public static double[] totalAmount(double []balance, double [][]borrowers) {
        double[] amount = new double[balance.length];
        for (int i = 0; i < balance.length; i++) {
            amount[i] = balance[i];
            for (int j = 0; j < borrowers[i].length; j++) {
                amount[i] += borrowers[i][j];
            }

        }
        return amount;
    }

    public static double[][] bankChange(boolean []isDanger, double[][] borrowers) {
        for (int i = 0; i < isDanger.length; i++) {
            if (!isDanger[i]) {
                for (int j = 0; j < borrowers.length; j++) {
                    borrowers[j][i] = 0;
                }
            }
        }
        return borrowers;
    }
}