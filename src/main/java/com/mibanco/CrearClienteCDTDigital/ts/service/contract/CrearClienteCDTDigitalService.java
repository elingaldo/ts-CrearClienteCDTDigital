package com.mibanco.CrearClienteCDTDigital.ts.service.contract;

import com.mibanco.CrearClienteCDTDigital.ts.dao.entity.ClienteCdtDigitalEntity;
import com.mibanco.CrearClienteCDTDigital.ts.gen.type.CrearClienteCDTDigitalOutput;


public interface CrearClienteCDTDigitalService {

    CrearClienteCDTDigitalOutput crearClienteCDTDigital(ClienteCdtDigitalEntity clienteCDTDigitalEntity);
}
