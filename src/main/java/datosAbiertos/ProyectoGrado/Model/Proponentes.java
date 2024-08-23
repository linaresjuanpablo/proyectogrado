package datosAbiertos.ProyectoGrado.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor @AllArgsConstructor
@Table (name = "proponentes")

public class Proponentes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String id_procedimiento;
    private String fecha_publicacion;
    private String nombre_procedimiento;
    private String nit_entidad;
    private String codigo_entidad;
    private String entidad_compradora;
    private String proveedor;
    private String nit_proveedor;
    private String codigo_proveedor;
}
