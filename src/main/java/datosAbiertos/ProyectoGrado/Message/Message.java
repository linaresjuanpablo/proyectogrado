package datosAbiertos.ProyectoGrado.Message;

public class Message extends RuntimeException{

public static String  VACIOEMPRESA = "La empresa no se encuentra registrada";

public Message(String message){
super(message);
}

}
