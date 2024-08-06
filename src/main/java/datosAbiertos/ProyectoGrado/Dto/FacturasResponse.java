package datosAbiertos.ProyectoGrado.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;




@Setter
@Getter
public class FacturasResponse {

    private List<FacturasResponseDto> facturasResponseDto;

}
