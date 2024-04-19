package datosAbiertos.ProyectoGrado.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter

public class DepartamentoResponse {

    private List<DepartamentoResponseDto> departamentoResponseDto;
}
