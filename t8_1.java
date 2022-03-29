package source;

import java.util.Scanner;

public class t8_1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame un numero mayor a 0: ");

        int x;
        x = scanner.nextInt();

        //boleana -> true , false
        // > , < , >= , <= , == , !=
        
        String decision;

        decision = (x >= 0)?"Haz tomaado el camino de la luz..":"Haz tomado el camino del mal";

        System.out.println(decision);
    }
}