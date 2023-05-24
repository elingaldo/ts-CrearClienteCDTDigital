package com.mibanco.CrearClienteCDTDigital.ts.service.contract;

import com.mibanco.CrearClienteCDTDigital.ts.gen.type.ClienteCDTDigitalType;
import com.mibanco.CrearClienteCDTDigital.ts.gen.type.CrearClienteCDTDigitalOutput;


public interface CrearClienteCDTDigitalService {

    CrearClienteCDTDigitalOutput crearClienteCDTDigital(ClienteCDTDigitalType clienteCDTDigitalEntity);
}
