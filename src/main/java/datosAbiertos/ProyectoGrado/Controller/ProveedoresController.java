package datosAbiertos.ProyectoGrado.Controller;

import datosAbiertos.ProyectoGrado.Dto.DepartamentoResponse;
import datosAbiertos.ProyectoGrado.Dto.DepartamentoResponseDto;
import datosAbiertos.ProyectoGrado.Dto.NitResponse;
import datosAbiertos.ProyectoGrado.Service.IProveedoresService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/data/proveedor")


public class ProveedoresController {
    @Autowired
    private IProveedoresService iProveedoresService;
    @ApiOperation(value = "Buscar por departamento")


    @GetMapping("/departamento/{departamento}")
    public ResponseEntity<DepartamentoResponse> findByDepartamento(@PathVariable String departamento){
        DepartamentoResponse response = iProveedoresService.findByDepartamento(departamento);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/nit/{nit}")
    public ResponseEntity<NitResponse> findByNit(@PathVariable String nit){
        NitResponse response = iProveedoresService.findByNit(nit);
        return ResponseEntity.ok(response);
    }


}
