package datosAbiertos.ProyectoGrado.Dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class ProponenteResponseDto {
    private String id_procedimiento;
    private String fecha_publicacion;
    private String nombre_procedimiento;
    private String nit_entidad;
    private String codigo_entidad;
    private String entidad_compradora;
    private String proveedor;
    private String nit_proveedor;
    private String codigo_proveedor;

    public ProponenteResponseDto(String id_procedimiento, String fecha_publicacion, String nombre_procedimiento,
                                 String nit_entidad, String codigo_entidad, String entidad_compradora,
                                 String proveedor, String nit_proveedor, String codigo_proveedor){
        this.id_procedimiento=id_procedimiento;
        this.fecha_publicacion=fecha_publicacion;
        this.nombre_procedimiento = nombre_procedimiento;
        this.nit_entidad = nit_entidad;
        this.codigo_entidad = codigo_entidad;
        this.entidad_compradora = entidad_compradora;
        this.proveedor = proveedor;
        this.nit_proveedor = nit_proveedor;
        this.codigo_proveedor = codigo_proveedor;

    }


}
