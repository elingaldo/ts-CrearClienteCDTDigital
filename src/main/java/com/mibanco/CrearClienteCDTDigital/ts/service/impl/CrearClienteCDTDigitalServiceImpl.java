package com.mibanco.CrearClienteCDTDigital.ts.service.impl;

import com.mibanco.CrearClienteCDTDigital.ts.command.IntegracionClienteCDTDigital;
import com.mibanco.CrearClienteCDTDigital.ts.gen.type.ClienteCDTDigitalType;
import com.mibanco.CrearClienteCDTDigital.ts.gen.type.CrearClienteCDTDigitalOutput;
import com.mibanco.CrearClienteCDTDigital.ts.gen.type.NovedadCDTDigitalType;
import com.mibanco.CrearClienteCDTDigital.ts.service.contract.CrearClienteCDTDigitalService;
import com.mibanco.CrearClienteCDTDigital.ts.utils.ApplicationException;
import com.mibanco.CrearClienteCDTDigital.ts.utils.ClienteCdtDigitalValidator;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@ApplicationScoped
public class CrearClienteCDTDigitalServiceImpl implements CrearClienteCDTDigitalService {

    private static final Logger LOG = LoggerFactory.getLogger(CrearClienteCDTDigitalServiceImpl.class);

    @Inject
    IntegracionClienteCDTDigital integracionClienteCDTDigital;

    @Inject
    ClienteCdtDigitalValidator clienteCdtDigitalValidator;

    @Transactional
    @Override
    public CrearClienteCDTDigitalOutput crearClienteCDTDigital(ClienteCDTDigitalType clienteCDTDigitalType) {
        LOG.info("Inicia creación de datos crearClienteCDTDigitalSvcImpl");
        try {

            clienteCdtDigitalValidator.verificarDatosClienteCdtDigital(clienteCDTDigitalType);

            integracionClienteCDTDigital.crearClienteCDTDigital(clienteCDTDigitalType);

            LOG.info("Termina creación de datos crearClienteCDTDigitalSvcImpl");
            NovedadCDTDigitalType novedad = new NovedadCDTDigitalType();
            novedad.setId(null);
            novedad.setNumeroDocumento(clienteCDTDigitalType.getClienteBase().getNumeroDocumento().toString());

            CrearClienteCDTDigitalOutput response = new CrearClienteCDTDigitalOutput();
            response.setNumeroCliente(clienteCDTDigitalType.getClienteBase().getNumeroCliente());
            response.setNovedad(novedad);
            return response;
        } catch (ApplicationException e) {

            LOG.error( e + " en crearClienteCDTDigitalSvcImpl");
            throw new ApplicationException( e.getMessage() + " crearClienteCDTDigitalSvcImpl");
        }
    }
}
