package source;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        x=1;
        switch(x){

            case 0:
                System.out.println("X es 0");
                break;
            case 1:
                System.out.println("x es 1");
                break;
            case 2:
                System.out.println("x es 2");
                break;
            default:
                System.out.println("este es un mensaje por defecto");
        }
    }
    
}
