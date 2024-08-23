package datosAbiertos.ProyectoGrado.Service.Impl;

import datosAbiertos.ProyectoGrado.Dto.DepartamentoResponse;
import datosAbiertos.ProyectoGrado.Dto.DepartamentoResponseDto;
import datosAbiertos.ProyectoGrado.Dto.NitResponse;
import datosAbiertos.ProyectoGrado.Dto.NitResponseDto;
import datosAbiertos.ProyectoGrado.Message.Message;
import datosAbiertos.ProyectoGrado.Model.Proveedores;
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

        for (DepartamentoResponseDto dto: list){
            DepartamentoResponseDto responseDto = new DepartamentoResponseDto("","","");
            responseDto.setNombre(dto.getNombre());
            responseDto.setCodigo(dto.getCodigo());
            responseDto.setMunicipio(dto.getMunicipio());

            departamentoResponseDto.add(responseDto);
        }
        departamentoResponse.setDepartamentoResponseDto(departamentoResponseDto);
        return departamentoResponse;
    }

    @Override
    public NitResponse findByNit(String nit) {
        NitResponse nitResponse = new NitResponse();
        List<NitResponseDto> nitResponseDtos = new ArrayList<>();
        List<Proveedores> list = proveedoresRepository.findByNit(nit);
        if (list == null || list.isEmpty()){
            //System.out.println("no hay datos");
            throw new Message("La empresa no esta registrada");
        }
        NitResponseDto responseDto = new NitResponseDto("","","","","");
        for (Proveedores dto: list){
            responseDto.setNombre(dto.getNombre());
            responseDto.setDepartamento(dto.getMunicipio());
            responseDto.setDepartamento(dto.getDepartamento());
            responseDto.setTipo_empresa(dto.getTipo_empresa());
            responseDto.setNombre_representante_legal(dto.getNombre_representante_legal());

            nitResponseDtos.add(responseDto);
        }
        nitResponse.setNitResponseDtos(nitResponseDtos);


        return nitResponse;
    }
}
