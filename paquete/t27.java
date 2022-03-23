package paquete;

public class t27 implements Runnable{
    Thread t;
    String nombre;

    public t27(){
        t = new Thread(this,"Hilo 1");
        t.start();
    }
    public t27(String nombre){
        this.nombre = nombre;
        t = new Thread(this,"Hilo 1");
        t.start();
    }
    public void run(){
        try{
            for(int i =0; i< 200; i++){
                System.out.println(nombre+"  - valor: " +i);
                Thread.sleep(500);
            }
            
        }catch(InterruptedException e){};
    }
}
