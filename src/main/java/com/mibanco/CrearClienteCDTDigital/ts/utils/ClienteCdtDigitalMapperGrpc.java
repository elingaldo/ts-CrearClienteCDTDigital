package com.mibanco.CrearClienteCDTDigital.ts.utils;

import com.mibanco.CrearClienteCDTDigital.ts.gen.type.ClienteCDTDigitalType;
import com.mibanco.clienteCdtDigital.ts.ClienteCdtDigitalGrpc;
import jakarta.enterprise.context.ApplicationScoped;
import org.modelmapper.ModelMapper;

@ApplicationScoped
public class ClienteCdtDigitalMapperGrpc {


    public ClienteCDTDigitalType clienteGrpcToType(ClienteCdtDigitalGrpc clienteCdtDigitalGrpc) {
        var retorno = new ModelMapper().map(clienteCdtDigitalGrpc, ClienteCDTDigitalType.class);
        System.out.println(" _8_8-*_8-*-8_*-8-*_*-8_*_8-8_*-8**   respuesta del modelMapper" + retorno);
        return retorno;
    }

    public ClienteCdtDigitalGrpc clienteCDTDigitalToGrpc(ClienteCDTDigitalType clienteCDTDigitalType) {
        return new ModelMapper().map(clienteCDTDigitalType, ClienteCdtDigitalGrpc.class);
    }



}
