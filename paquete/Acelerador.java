package paquete;

import java.util.ArrayList;

public class Acelerador implements SujetoObservable {
    
    private ArrayList<Observador> observadores;

    public Acelerador() {
        observadores = new ArrayList<Observador>(); 
    }

    public void pisarElAcelerador(){
        //vas a subir la potencia del motor..
        notificar();
    }

    public void enlazarObservador(Observador o) {
        observadores.add(o); 
    };
    

    public void notificar(){
        for(Observador o:observadores){o.update();}
    }
}
