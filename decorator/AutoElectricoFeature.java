package decorator;

public class AutoElectricoFeature extends AutomovilDecorador {

    public AutoElectricoFeature(Automovil auto){
        super(auto);
    }
    public void accel() {
        System.out.println("Iniciando electricamente");
        getAuto().accel();
    }

    public void stop(){
        System.out.println("Controlando frenos electronicos");
        getAuto().stop();
    }

    public void start(){
        getAuto().start();
        System.out.println("iniciar sistema operativo");
    }
}