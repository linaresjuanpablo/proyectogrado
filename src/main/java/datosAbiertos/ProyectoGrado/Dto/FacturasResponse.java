package datosAbiertos.ProyectoGrado.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;




@Setter
@Getter
public class FacturasResponse {

    private String mensaje;

    private List<FacturasResponseDto> facturasResponseDto;

    public FacturasResponse(String mensaje) {
        this.mensaje = mensaje;
    }
}
