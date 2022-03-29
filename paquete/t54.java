package paquete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class t54 {
    public static void main(String[] args){
        //orden superior
        //es una funcion -> funcion como argumento o, regresar una funcion
        List<Integer> numeros = Arrays.asList(5,-5,2,-2,7,-7,0,12,-24,32,-64,128);
        BiFunction<
            List<Integer>,
            Predicate<Integer>,
            List<Integer>
            > filtrar;
        filtrar = (list,predicado) ->{
            List<Integer> resultado = new ArrayList<>();
            for(Integer i:list) if(predicado.test(i)) resultado.add(i);
            return resultado;
        };

        System.out.println(filtrar.apply(numeros,

        x -> x < 0 // numeros negativos
      //  x -> x >= 0 //numeros positivos mas el 0
      //  x -> x % 2 == 0 //numeros pares
        
        ));
    }
}
