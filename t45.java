import decorator.AutoElectricoFeature;
import decorator.Automovil;
import decorator.CarroEstandar;

public class t45 {
    
    public static void main(String[] args){

        Automovil carro = new AutoElectricoFeature(new CarroEstandar("Chevy"));
        carro.start();
        carro.accel();
        carro.stop();
    }
}
