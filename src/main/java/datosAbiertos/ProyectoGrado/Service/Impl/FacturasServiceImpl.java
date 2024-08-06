package datosAbiertos.ProyectoGrado.Service.Impl;

import datosAbiertos.ProyectoGrado.Dto.FacturasResponse;
import datosAbiertos.ProyectoGrado.Dto.FacturasResponseDto;
import datosAbiertos.ProyectoGrado.Repository.FacturasRepository;
import datosAbiertos.ProyectoGrado.Service.IFacturasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class FacturasServiceImpl implements IFacturasService {

    @Autowired
    private FacturasRepository facturasRepository;


    @Override
    public FacturasResponse findByFacturasDia(String ano, String mes, String dia) {
        FacturasResponse facturasResponse = new FacturasResponse();
        List<FacturasResponseDto> facturasResponseDto = new ArrayList<>();
        List<Object[]> list = facturasRepository.findByFacturasDia(ano, mes, dia);
        Double totalVentaDia = facturasRepository.calculateSumByDia(ano, mes, dia);

        if (list == null || list.isEmpty()){
            System.out.println("no hay datos para mostrar");
        }
        for (Object[] dto: list){
        FacturasResponseDto result = new FacturasResponseDto("","","","",
                "", totalVentaDia );

        result.setId_contrato(((String) dto[0]));
        result.setEstado(((String) dto[1]));
        result.setNumero_de_factura(((String) dto[2]));
        result.setUsuario_pago(((String) dto[3]));
        result.setValor_a_pagar(((String) dto[0]));

        facturasResponseDto.add(result);
        }
        facturasResponse.setFacturasResponseDto(facturasResponseDto);
        return facturasResponse;

    }
    @Override
    public FacturasResponse findByFacturasMes(String mes) {
        FacturasResponse facturasResponse = new FacturasResponse();
        List<FacturasResponseDto> facturasResponseDto = new ArrayList<>();
        List<FacturasResponseDto> list = facturasRepository.findByFacturasMes(mes);
        Double totalVentaMes = facturasRepository.calcularSumByMes(mes);
        if (list == null || list.isEmpty()){
            System.out.println("no hay datos para ver");
        }
        for (FacturasResponseDto dto: list){
            FacturasResponseDto responseDto = new FacturasResponseDto("", "","","",
                    "", totalVentaMes);
            facturasResponseDto.add(responseDto);
        }
        facturasResponse.setFacturasResponseDto(facturasResponseDto);
        return facturasResponse;
    }


}
