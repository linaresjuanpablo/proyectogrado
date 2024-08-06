package datosAbiertos.ProyectoGrado.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor @NoArgsConstructor
@Table(name = "facturas")

public class Facturas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String estado;
    private String fecha_de_entrega;
    private String fecha_estiamda_de_pago;
    private String fecha_factura;
    private String id_contrato;
    private String id_pago;
    private String notas;
    private String numero_de_factura;
    private String pago_confirmado;
    private String radicado;
    private String usuario_pago;
    private String valor_a_pagar;
    private String valor_neto;
    private String valor_total;


}
