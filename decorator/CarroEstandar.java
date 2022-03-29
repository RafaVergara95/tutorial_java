package decorator;

public class CarroEstandar implements Automovil{

    private String nombre;

    public CarroEstandar(String s){
        nombre = s;
    }

    public void accel(){
        System.out.println("acceleracion estandar");
    }

    public void stop(){
        System.out.println("Frenar");
   
    }
    public void start(){
        System.out.println("Prendiendo el carro");
    }
}