import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] num = {1.34, 1.42, 1.33, 1.44, 1.22, 1.57, 1.52, -1.24, 1.45, -1.31, 1.11, -1.12, 1.13, 1.14, 1.15};
        int numCount = 0;
        double allNum = 0.0;
        boolean check = false;
        for (double cast : num) {
            if (cast < 0) {
                check = true;
            } else if (cast > 0 && check) {
                numCount++;
                allNum += cast;
                System.out.println(cast);



            }
        }
        System.out.println(" среднее арифметическое число = " + allNum / numCount );
        for (int i = 0; i < num.length - 1 ; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num [j] > num [j + 1]){
                    double temp = num [j];
                    num [j] = num [j+1];
                    num [j+1] = temp;


                }

            }
            System.out.println(Arrays.toString((num)));

        }
        {

        }
    }
}