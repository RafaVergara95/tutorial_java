package source;

import java.util.Stack;

public class t30 {
    public static void main(String args []){
        Stack pila = new Stack();

        pila.push("Mundo");

        pila.push("Hola");

        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.empty());

        //PUSH -- agregar un elemento
        //POP -- es para ssacar el elemento final
        //PEEK -- para ver ultimo elemento
        //EMPTY -- saber ssi la pila esta vacia
    }
}
