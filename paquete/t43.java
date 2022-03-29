package paquete;

import java.util.InputMismatchException;
import java.util.Scanner;


public class t43 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int x;

        System.out.println("Dame un valor numerico:");

        try{

            x = scanner.nextInt();
            System.out.println(x);
        }catch(Exception e){

            System.out.println("No me diste un valor numerico");
        }
        finally {
            System.out.println("Proceso terminado");
        }
    }

}
