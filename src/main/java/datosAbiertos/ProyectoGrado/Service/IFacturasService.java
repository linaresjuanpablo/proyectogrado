package datosAbiertos.ProyectoGrado.Service;

import datosAbiertos.ProyectoGrado.Dto.FacturasResponse;

public interface IFacturasService {

    FacturasResponse findByFacturasDia(String ano, String mes, String dia);

    FacturasResponse findByFacturasMes(String mes);
}
