package com.mibanco.CrearClienteCDTDigital.ts.service.contract;

import com.mibanco.CrearClienteCDTDigital.ts.dao.entity.ClienteCdtDigitalEntity;
import com.mibanco.CrearClienteCDTDigital.ts.gen.type.ClienteCDTDigitalType;


public interface CrearClienteCDTDigitalService {

    ClienteCDTDigitalType crearClienteCdtDigital(ClienteCdtDigitalEntity clienteCDTDigitalEntity);
}
