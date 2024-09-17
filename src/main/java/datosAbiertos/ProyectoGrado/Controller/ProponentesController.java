package datosAbiertos.ProyectoGrado.Controller;

import datosAbiertos.ProyectoGrado.Dto.ProponenteResponse;
import datosAbiertos.ProyectoGrado.Message.Message;
import datosAbiertos.ProyectoGrado.Service.IProponentesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/data")

public class ProponentesController {

    @Autowired
    private IProponentesService iProponentesService;

    @GetMapping("/proponentes/{nitPro}")
    public ResponseEntity<ProponenteResponse>findByNitPro(@PathVariable String nitPro){
        ProponenteResponse response = iProponentesService.findByNitPro(nitPro);
        return ResponseEntity.ok(response);
        /*try {
            ProponenteResponse response = iProponentesService.findByNitPro(nitPro);
            return ResponseEntity.ok(response);
        }catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ProponenteResponse(Message.VACIOEMPRESA));

        }*/
    }


}
