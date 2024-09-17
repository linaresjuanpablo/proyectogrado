package datosAbiertos.ProyectoGrado.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter

public class NitResponse {

    private String mensaje;
    List<NitResponseDto>nitResponseDtos;

    public NitResponse(String mensaje){

        this.mensaje = mensaje;
    }
}
