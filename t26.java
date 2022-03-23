import java.util.LinkedList;
import java.util.ListIterator;

public class t26 {

    public static void main(String[] args){

        LinkedList lista = new LinkedList();

        lista.add("Hola");
        lista.add("que");
        lista.add("tal");
        lista.add("me");
        lista.add("llamo");
        lista.add("Jorge");

        ListIterator iterador = lista.listIterator();

        while(iterador.hasNext())
        {
            System.out.println(iterador.next());
        }
    }
    
}
