package com.mibanco.CrearClienteCDTDigital.ts.command;

import com.mibanco.CrearClienteCDTDigital.ts.gen.type.ClienteCDTDigitalType;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class IntegracionClienteCDTDigital {

    List<ClienteCDTDigitalType> lista=new ArrayList<ClienteCDTDigitalType>();

    public void crearClienteCDTDigital(ClienteCDTDigitalType clienteCDTDigitalType) {
        lista.add(clienteCDTDigitalType);
    }

}
