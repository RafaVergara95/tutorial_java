package paquete;

public class t28 {
    public static long getFactorial(long ln){

        if(ln == 0){
            return 1;
        }
        if(ln<0)
        {
            return -1;
        }
        return getFactorial(ln,ln);
    
    }
    public static long getFactorial(long ln, long last){
        System.out.println("Acumulado: "+ln);
        System.out.println("numero actual "+last);
        if(last ==1){
            return ln;
        }
        else{
            return getFactorial(ln*(last-1),last-1);
        }
    }
}
