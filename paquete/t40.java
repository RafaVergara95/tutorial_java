package paquete;

public class t40 {
    
    public static void main(String[] args){
        System.out.println(toInt("110101010111"));
    }

    public static int toInt(String bin){

        int result = 0;
        char binario[]= bin.toCharArray();
        for(int i =0; i< binario.length; i++, result <<=1){  //0000 0001 (1)<< 0000 0010 (2)

            
            result |= (binario[i] == '0')?0:1; 
        } 
        result >>= 1;
        return result;
    }

}
