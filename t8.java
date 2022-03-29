package source;

import java.util.Scanner;

public class t8 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame un numero mayor a 0: ");

        int x;
        x = scanner.nextInt();

        //boleana -> true , false
        // > , < , >= , <= , == , !=
        if(x > 0){

            System.out.println("Haz tomado el camino de la lux..");


        }else{

            System.out.println("Haz tomado el camino de la oscuridad y el mal..");
            
        }
    }
}