package paquete;

//import java.util.ArrayList;

public class t51 {
    public static void main(String[] args){

        Motor v8 = new Motor();

        Acelerador x = new Acelerador();

        x.enlazarObservador(v8);

        x.pisarElAcelerador();
    }
}
