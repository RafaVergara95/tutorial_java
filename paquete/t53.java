package paquete;

public class t53 {

    interface Suma{
        public Integer sumarDosNumeros(Integer a, Integer b);
    }
    public static void main(String [] args){

        Suma suma = (a,b) -> a + b;
        System.out.println(suma.sumarDosNumeros(10, 35));
    }
}
