package com.mibanco.CrearClienteCDTDigital.ts.service.impl;

import com.mibanco.CrearClienteCDTDigital.ts.dao.contract.CrearClienteCDTDigitalDAO;
import com.mibanco.CrearClienteCDTDigital.ts.dao.entity.ClienteCdtDigitalEntity;
import com.mibanco.CrearClienteCDTDigital.ts.gen.type.ClienteCDTDigitalType;
import com.mibanco.CrearClienteCDTDigital.ts.gen.type.CrearClienteCDTDigitalOutput;
import com.mibanco.CrearClienteCDTDigital.ts.gen.type.NovedadCDTDigitalType;
import com.mibanco.CrearClienteCDTDigital.ts.service.contract.CrearClienteCDTDigitalService;
import com.mibanco.CrearClienteCDTDigital.ts.utils.ApplicationException;
import com.mibanco.CrearClienteCDTDigital.ts.utils.ClienteCdtDigitalValidator;
import com.mibanco.CrearClienteCDTDigital.ts.utils.CrearClienteDigitalMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.hibernate.Hibernate;
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
    ClienteCdtDigitalValidator clienteCdtDigitalValidator;

    @Transactional
    @Override
    public CrearClienteCDTDigitalOutput crearClienteCDTDigital(ClienteCdtDigitalEntity clienteCDTDigitalEntity) {
        LOG.info("Inicia creación de datos crearClienteCDTDigitalSvcImpl");
        try {
            ClienteCDTDigitalType clienteCDTDigitalType = crearClienteMapper.clienteEntityToType(clienteCDTDigitalEntity);
            clienteCdtDigitalValidator.verificarDatosClienteCdtDigital(clienteCDTDigitalType);

            crearClienteCdtDigitalDAO.persist(clienteCDTDigitalEntity);
            //Hibernate.initialize(clienteCDTDigitalEntity.getClienteBase());
            LOG.info("Termina creación de datos crearClienteCDTDigitalSvcImpl");
            NovedadCDTDigitalType novedad = new NovedadCDTDigitalType();
            novedad.setId(null);
            novedad.setNumeroDocumento(clienteCDTDigitalEntity.getClienteBase().getNumeroDocumento().toString());

            CrearClienteCDTDigitalOutput response = new CrearClienteCDTDigitalOutput();
            response.setNumeroCliente(clienteCDTDigitalEntity.getClienteBase().getNumeroCliente());
            response.setNovedad(novedad);
            return response;
        } catch (ApplicationException e) {

            LOG.error( e + " en crearClienteCDTDigitalSvcImpl");
            throw new ApplicationException( e.getMessage() + " crearClienteCDTDigitalSvcImpl");
        }
    }
}
