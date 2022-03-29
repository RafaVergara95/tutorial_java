package source;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class t52 {
    
    static boolean esPar(Integer n){
        return n % 2 == 0; 
    }
    public static void main(String[] args){

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9); 
        //enonctrar los numeros pares y guardarlos en un arrayList
        List<Integer> resultados = new ArrayList<Integer>();
        //funcional , declarativo. Que quiero hacer?
        resultados = numeros.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toList());

       for(int i=0; i< numeros.size(); i++)
            if( numeros.get(i) % 2 == 0)// es par
                resultados.add(numeros.get(i));
        
                System.out.println(resultados);
    }

}
