

public class t44 {
    
    public static void  main(String[] args){

        Logger logger_1 = Logger.getInstance();
        Logger logger_2 = Logger.getInstance();

        logger_1.setValue("Mensaje");
        System.out.println(logger_2.getValue());
        
    }
}
