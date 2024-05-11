package datosAbiertos.ProyectoGrado.Exception;

import datosAbiertos.ProyectoGrado.Message.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalException {

    @ExceptionHandler(Message.class)
    public ResponseEntity<String> ListaVacia(Message e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }

}
