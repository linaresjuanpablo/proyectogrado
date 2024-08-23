package datosAbiertos.ProyectoGrado.Service.Impl;

import datosAbiertos.ProyectoGrado.Dto.NitResponse;
import datosAbiertos.ProyectoGrado.Dto.NitResponseDto;
import datosAbiertos.ProyectoGrado.Dto.ProponenteResponse;
import datosAbiertos.ProyectoGrado.Dto.ProponenteResponseDto;
import datosAbiertos.ProyectoGrado.Model.Proponentes;
import datosAbiertos.ProyectoGrado.Repository.ProponentesRepository;
import datosAbiertos.ProyectoGrado.Service.IProponentesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class ProponenteServiceImpl implements IProponentesService {

    @Autowired
    private ProponentesRepository proponentesRepository;


    @Override
    public ProponenteResponse findByNitPro(String nitPro) {
        ProponenteResponse proponenteResponse = new ProponenteResponse();
        List<ProponenteResponseDto> proponenteResponseDtos = new ArrayList<>();
        List<Proponentes> list = proponentesRepository.findByNitPro(nitPro);
        if (list == null || list.isEmpty()){
            System.out.println("no hay datos");
        }

        for (Proponentes dto: list){
            ProponenteResponseDto responseDto = new ProponenteResponseDto("","","",
                    "","","","","","");
            responseDto.setId_procedimiento(dto.getId_procedimiento());
            responseDto.setFecha_publicacion(dto.getFecha_publicacion());
            responseDto.setNombre_procedimiento(dto.getNombre_procedimiento());
            responseDto.setNit_entidad(dto.getNit_entidad());
            responseDto.setCodigo_entidad(dto.getCodigo_entidad());
            responseDto.setEntidad_compradora(dto.getEntidad_compradora());
            responseDto.setProveedor(dto.getProveedor());
            responseDto.setNit_proveedor(dto.getNit_proveedor());
            responseDto.setCodigo_proveedor(dto.getCodigo_proveedor());

            proponenteResponseDtos.add(responseDto);
        }
        proponenteResponse.setProponenteResponseDtos(proponenteResponseDtos);

        return proponenteResponse;
    }
}