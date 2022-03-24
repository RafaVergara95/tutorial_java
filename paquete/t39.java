package paquete;

public class t39 {
    
    public static void main(String args[]){

        String user, pass, reppass;
        user = "Jorge1990";
        pass = "123";
        reppass = "123";

        MiHelper h = new MiHelper();

        try{
            h.validarPassword(pass,reppass);
        }catch(CustomException e){
            System.out.println("No se puede registrar un usuario debido a:" 
            + e.getMessage());
        }
    }
}
