package com.mibanco.CrearClienteCDTDigital.ts.utils;

import com.mibanco.CrearClienteCDTDigital.ts.dao.entity.ClienteCdtDigitalEntity;
import com.mibanco.CrearClienteCDTDigital.ts.gen.type.ClienteCDTDigitalType;
import jakarta.enterprise.context.ApplicationScoped;
import org.modelmapper.ModelMapper;

@ApplicationScoped
public class CrearClienteDigitalMapper {
    public ClienteCDTDigitalType clienteEntityToType(ClienteCdtDigitalEntity clienteCDTDigitalEntity) {
        return new ModelMapper().map(clienteCDTDigitalEntity, ClienteCDTDigitalType.class);
    }

    public ClienteCdtDigitalEntity clienteTypeToEntity(ClienteCDTDigitalType clienteCDTDigitalType) {
        return new ModelMapper().map(clienteCDTDigitalType, ClienteCdtDigitalEntity.class);
    }
}
