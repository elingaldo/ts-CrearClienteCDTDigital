package com.mibanco.CrearClienteCDTDigital.ts.service.impl;

import com.mibanco.CrearClienteCDTDigital.ts.dao.contract.CrearClienteCDTDigitalDAO;
import com.mibanco.CrearClienteCDTDigital.ts.dao.entity.ClienteCdtDigitalEntity;
import com.mibanco.CrearClienteCDTDigital.ts.gen.type.ClienteCDTDigitalType;
import com.mibanco.CrearClienteCDTDigital.ts.service.contract.CrearClienteCDTDigitalService;
import com.mibanco.CrearClienteCDTDigital.ts.utils.ApplicationException;
import com.mibanco.CrearClienteCDTDigital.ts.utils.CrearClienteCdtDigitalValidator;
import com.mibanco.CrearClienteCDTDigital.ts.utils.CrearClienteDigitalMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@ApplicationScoped
public class CrearClienteCDTDigitalServiceImpl implements CrearClienteCDTDigitalService {

    private static final Logger LOG = LoggerFactory.getLogger(CrearClienteCDTDigitalServiceImpl.class);

    @Inject
    CrearClienteCDTDigitalDAO crearClienteCdtDigitalDAO;

    @Inject
    CrearClienteDigitalMapper crearClienteMapper;

    @Inject
    CrearClienteCdtDigitalValidator crearClienteCdtDigitalValidator;

    @Transactional
    @Override
    public ClienteCDTDigitalType crearClienteCdtDigital(ClienteCdtDigitalEntity clienteCDTDigitalEntity) {
        LOG.info("Inicia creación de datos crearClienteCDTDigitalSvcImpl");
        try {
            ClienteCDTDigitalType clienteCDTDigitalType = crearClienteMapper.clienteEntityToType(clienteCDTDigitalEntity);
            crearClienteCdtDigitalValidator.verificarDatosClienteCdtDigital(clienteCDTDigitalType);

            crearClienteCdtDigitalDAO.persist(clienteCDTDigitalEntity);

            LOG.info("Termina creación de datos crearClienteCDTDigitalSvcImpl");
            return clienteCDTDigitalType;
        } catch (ApplicationException e) {

            LOG.error( e + " en crearClienteCDTDigitalSvcImpl");
            throw new ApplicationException( e.getMessage() + " crearClienteCDTDigitalSvcImpl");
        }
    }
}
