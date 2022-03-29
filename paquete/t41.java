package paquete;

public class t41 {

    public static void main(String args[]){

        double startTime = System.nanoTime();

        /*String ingredientes[] = {
            "lechuga", "tomate", "cebolla","mosstaza", "pimiento"
        };
*/
        String ingredientes[] = new String[20];
        double n,k;
        n = ingredientes.length;
        k = 3;
        double nF = factorial(n);
        double nkF = factorial(n-k);
        double resultado = nF/nkF;
        System.out.println("Permutaciones: "+resultado);
 /*       double permutaciones = 0;
        for(int i =0; i < ingredientes.length; i++){

            for(int j =0; j < ingredientes.length; j++){

                for(int k =0; k < ingredientes.length; k++){
            
                    if(i != j && i != k && k != j){

                        permutaciones++;
                    }
                }

            }

        }
        System.out.println("Permutaciones: "+permutaciones);
*/
        double endTime = System.nanoTime();
        System.out.println("Tiempo en milisecs: "+(endTime-startTime)/1000000);
    }

    public static double factorial(double n){
        return (n == 0)?1:n*factorial(n-1);
    }

}
