package datosAbiertos.ProyectoGrado.Controller;

import datosAbiertos.ProyectoGrado.Dto.DepartamentoResponse;
import datosAbiertos.ProyectoGrado.Dto.DepartamentoResponseDto;
import datosAbiertos.ProyectoGrado.Service.IProveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/data")

public class ProveedoresController {
    @Autowired
    private IProveedoresService iProveedoresService;

    @GetMapping("/departamento/{departamento}")
    public ResponseEntity<DepartamentoResponse> findByDepartamento(@PathVariable String departamento){
        DepartamentoResponse response = iProveedoresService.findByDepartamento(departamento);
        return ResponseEntity.ok(response);
    }

}
