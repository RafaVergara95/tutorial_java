

class Main {
    
    public static void main(String[] args) {

        int minutos = 0;
        int segundos = 0;
        for (minutos=0; minutos <60; minutos++){

            System.out.println(minutos+":"+segundos);
            delaySegundo();
        }
    }

    private static void delaySegundo(){

        try{
            Thread.sleep(1000);
        }catch(InterrupedException e){}
    }
}
