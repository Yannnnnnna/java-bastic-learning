import java.util.Scanner;

//马尔科夫矩阵
public class Exercise32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double [][]matrix = new double[3][3];
        //输入值
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
                //判断是不是都大于零
                if(matrix[i][j] < 0){
                    System.out.println("It is not a Markov matrix.");
                    System.exit(1);
                }
            }
        }
       //判断每列是否和为一
        boolean bool = true;
        for (int i = 0; i < matrix.length; i++) {
            double sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            if(sum != 1){
                bool = false;
                break;
            }

        }
        if(bool){
            System.out.println("It is a Markov matrix.");
        }else{
            System.out.println("It is not a Markov matrix.");
        }

    }
}
