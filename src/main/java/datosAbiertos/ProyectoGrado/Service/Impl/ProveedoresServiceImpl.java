package datosAbiertos.ProyectoGrado.Service.Impl;

import datosAbiertos.ProyectoGrado.Dto.DepartamentoResponse;
import datosAbiertos.ProyectoGrado.Dto.DepartamentoResponseDto;
import datosAbiertos.ProyectoGrado.Repository.ProveedoresRepository;
import datosAbiertos.ProyectoGrado.Service.IProveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProveedoresServiceImpl implements IProveedoresService {

    @Autowired
    private ProveedoresRepository proveedoresRepository;


    //servicio de consulta de proveedores por departamento
    @Override
    public DepartamentoResponse findByDepartamento(String departamento) {

        DepartamentoResponse departamentoResponse = new DepartamentoResponse();
        List<DepartamentoResponseDto> departamentoResponseDto = new ArrayList<>();
        List<DepartamentoResponseDto> list = proveedoresRepository.findByDepartamento(departamento);
        if (list == null || list.isEmpty()){
            System.out.println("no hay datos");
        }
        //String s = "";
        //DepartamentoResponseDto responseDto = new DepartamentoResponseDto();
        DepartamentoResponseDto responseDto = new DepartamentoResponseDto("","","");

        for (DepartamentoResponseDto dto: list){
            responseDto.setNombre(dto.getNombre());
            responseDto.setCodigo(dto.getCodigo());
            responseDto.setMunicipio(dto.getMunicipio());

            departamentoResponseDto.add(responseDto);
        }

        departamentoResponse.setDepartamentoResponseDto(departamentoResponseDto);

        return departamentoResponse;
    }




}
