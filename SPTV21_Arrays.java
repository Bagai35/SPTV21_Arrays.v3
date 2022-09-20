import java.util.Random;

public class SPTV21_Arrays {
    public static void main(String[] args) {
        System.out.println("========Демонстрация массивов========");
        int[] arr1 = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(10);
        }
        int sum = 0;
        int max = arr1[1];
        int min = arr1[1];
        System.out.println("[");
        for (int j : arr1) {
            System.out.printf("%2d,", j);
            sum += j;
            if (j > max) {
                max = j;
            }
            {
                if (j < min) {
                    min = j;
                }
            }
        }
        System.out.println("]");
        System.out.println("sum = " + sum);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("========Демонстрация массивов[] []========");
        int arr2[][] = new int[10][10];
        int sum1 = 0;
        int Str1 = 0;
        int Str2 = 0;
        int x=arr2.length;
        int s=0;
        int linesum=0;
        int max1 = 0;
        int min1 = 0;
        int d = 0;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = random.nextInt(2);
                if (min1 > arr2[i][j]) min1 = arr2[i][j];
                if (max1 < arr2[i][j]) max1 = arr2[i][j];
                sum1 += arr2[i][j];


            }
        }
        for (int[] ints : arr2) {
            for (int j = 0; j < ints.length; j++) {
                System.out.printf("%4d", ints[j]);


            }
            System.out.println();
        }
        Str1 += arr2[0][0]+arr2[1][1]+arr2[2][2]+arr2[3][3]+arr2[4][4]+arr2[5][5]+arr2[6][6]+arr2[7][7]
                +arr2[8][8]+arr2[9][9];
        Str2 += arr2[0][9]+arr2[1][8]+arr2[2][7]+arr2[3][6]+arr2[4][5]+arr2[5][4]+arr2[6][3]+arr2[7][2]
                +arr2[8][1]+arr2[9][0];

        {while(s<x){
            for (int i=0;i<x;i++){
                linesum+=arr2[i][s];
            }
            s++;
            System.out.println("Сумма елементов столбца " +s+ " равна: " +linesum);
            linesum=0;}System.out.println();

        {
            while(d<x){
                for (int i=0;i<x;i++){
                    Str1+=arr2[d][i];
                }
                d++;
                System.out.println("Сумма елементов строки " +s+ " равна: " +Str1);
                Str1=0;
            }
        }
        }


        System.out.println("max = "+max1);
        System.out.println("min = "+min1);
        System.out.println("summ = " + sum1);
        System.out.println("ЛВ ПН = "+Str1);
        System.out.println("ПВ ЛН = "+ Str2);


    }
}

