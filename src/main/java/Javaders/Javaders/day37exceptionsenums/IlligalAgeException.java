package Javaders.Javaders.day37exceptionsenums;

public class IlligalAgeException extends  RuntimeException {
    //Olusturdugumuz Class'i RunTimeException'in Child' i yaparsak o class RunTimeException olur ama
    // Exception Class'in childí yaparsak Compile Time Exception olur
    public IlligalAgeException(){
        super();
    }
    public IlligalAgeException(String message){
        super(message);
    }

}
