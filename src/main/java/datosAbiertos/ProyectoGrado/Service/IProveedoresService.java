package datosAbiertos.ProyectoGrado.Service;

import datosAbiertos.ProyectoGrado.Dto.DepartamentoResponse;

public interface IProveedoresService {

   DepartamentoResponse findByDepartamento(String departamento);
}
