package datosAbiertos.ProyectoGrado.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
//@NoArgsConstructor @AllArgsConstructor

public class ProponenteResponse {

    private String mensaje;

    List<ProponenteResponseDto>proponenteResponseDtos;
    public ProponenteResponse(String mensaje){
        this.mensaje = mensaje;
    }
}
