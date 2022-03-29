

import java.util.Arrays;
import java.util.Scanner;

public class t17 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x[][];
        x = new int [5][3];

        for (int i = 0; i < x.length; i++){

            for (int j = 0; j < x[i].length; j++){
                x[i][j] = j+i;
            }
            System.out.println(Arrays.toString(x[i]));
        }
        

    }
}