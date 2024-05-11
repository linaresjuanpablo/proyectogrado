package datosAbiertos.ProyectoGrado.Service;

import datosAbiertos.ProyectoGrado.Dto.DepartamentoResponse;
import datosAbiertos.ProyectoGrado.Dto.NitResponse;

public interface IProveedoresService {

   DepartamentoResponse findByDepartamento(String departamento);
   NitResponse findByNit(String nit);
}
