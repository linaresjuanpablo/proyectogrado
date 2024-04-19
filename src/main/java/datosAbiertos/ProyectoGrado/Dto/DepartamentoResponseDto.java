package datosAbiertos.ProyectoGrado.Dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class DepartamentoResponseDto {
    private String nombre;
    private String codigo;
    private String municipio;

    public DepartamentoResponseDto (String nombre, String codigo, String municipio){
        this.nombre = nombre;
        this.codigo = codigo;
        this.municipio = municipio;
    }

}
