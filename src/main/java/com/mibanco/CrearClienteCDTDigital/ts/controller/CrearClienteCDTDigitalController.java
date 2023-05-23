package com.mibanco.CrearClienteCDTDigital.ts.controller;


import com.mibanco.CrearClienteCDTDigital.ts.dao.entity.ClienteCdtDigitalEntity;
import com.mibanco.CrearClienteCDTDigital.ts.gen.contract.V1CrearClienteCDTDigital;
import com.mibanco.CrearClienteCDTDigital.ts.gen.type.ClienteCDTDigitalType;
import com.mibanco.CrearClienteCDTDigital.ts.service.contract.CrearClienteCDTDigitalService;
import com.mibanco.CrearClienteCDTDigital.ts.utils.ApplicationException;
import com.mibanco.CrearClienteCDTDigital.ts.utils.CrearClienteDigitalMapper;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static com.mibanco.CrearClienteCDTDigital.ts.constants.Constans.ERROR_SERVICIO;


public class CrearClienteCDTDigitalController implements V1CrearClienteCDTDigital {
    private static final Logger LOG = LoggerFactory.getLogger(CrearClienteCDTDigitalController.class);

    @Inject
    CrearClienteCDTDigitalService crearClienteCdtDigitalService;

    @Inject
    CrearClienteDigitalMapper clienteMapper;


    @Override
    public List<ClienteCDTDigitalType> crearClienteCdtDigital(ClienteCDTDigitalType clienteCDTDigitalType) {
        LOG.info("Inicia crearClienteCdtDigitalController");
        try {
            ClienteCdtDigitalEntity clienteCDTDigitalEntity = clienteMapper.clienteTypeToEntity(clienteCDTDigitalType);
            clienteCDTDigitalType = crearClienteCdtDigitalService.crearClienteCdtDigital(clienteCDTDigitalEntity);

            LOG.info("Termina crearClienteCdtDigitalController ");
            return List.of(clienteCDTDigitalType);

        } catch (ApplicationException e) {

            LOG.error(ERROR_SERVICIO + e.getMessage() + " ClienteCDTDigitalController");
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage() + " ClienteCDTDigitalController");

        }
    }
}
