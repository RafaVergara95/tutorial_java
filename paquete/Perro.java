package paquete;

public class Perro extends Animal{
    public Perro(){
        super();
        setNombre("Perro");
    }

    public void moverse(){
        System.out.println("El perro se esta moviendo");
    }
}
