import paquete.Bicicleta;
import paquete.Carro;

public class t46 {
    
    public static void main(String[] args){

        Carro c = new Carro();
        Bicicleta b = new Bicicleta();

        c.avanzar();
        b.avanzar();
        b.sentarse();
    }
}
