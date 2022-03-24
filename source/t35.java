package source;

public class t35 {
    public static void  main(String args[]){
        ListaEnlazada lista = new ListaEnlazada();

        System.out.println("Esta vacia: "+ lista.estaVacia());

        lista.addPrimero(6);
        lista.addPrimero(5);
        lista.addPrimero(4);
        lista.addPrimero(3);
        lista.addPrimero(2);
        lista.addPrimero(1);

        //lista.cortar(3);
        //lista.eliminar(2);
        //lista.eliminarPrimero();

        System.out.println("Primero: "+lista.obtener(0));
        System.out.println("Ultimo: "+lista.obtener(lista.size()-1));
        System.out.println("Tamanio: "+lista.size());
        System.out.println("Esta vacia: "+lista.estaVacia());
    }
}
