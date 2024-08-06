package datosAbiertos.ProyectoGrado.Dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class FacturasResponseDto {
    private String id_contrato;
    private String estado;
    private String numero_de_factura;
    private String usuario_pago;
    private String valor_a_pagar;
    private Double totalVentaDia;


    public FacturasResponseDto (String id_contrato, String estado,String numero_de_factura,
                                String usuario_pago, String valor_a_pagar, Double totalVentaDia){
        this.id_contrato = id_contrato;
        this.estado = estado;
        this.numero_de_factura = numero_de_factura;
        this.usuario_pago = usuario_pago;
        this.valor_a_pagar = valor_a_pagar;
        this.totalVentaDia = totalVentaDia;
    }


}


