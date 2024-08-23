package datosAbiertos.ProyectoGrado.Service;

import datosAbiertos.ProyectoGrado.Dto.ProponenteResponse;

public interface IProponentesService {

    ProponenteResponse findByNitPro (String nitPro);
}
