package source;

import java.util.Stack;

public class t31 {
    public static void main(String args[]){
        Pila pila = new Pila(3);
        pila.push("1");
        pila.push("2");
        pila.push("3");
        pila.push("4"); 

        System.out.println(pila.peek());
        System.out.println(pila.empty());
        System.out.println(pila.pop());
        System.out.println(pila.empty());
    }
}
