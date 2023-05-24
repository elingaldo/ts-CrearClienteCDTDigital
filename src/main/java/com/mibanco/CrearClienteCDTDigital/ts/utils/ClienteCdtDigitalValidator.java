 package com.mibanco.CrearClienteCDTDigital.ts.utils;


import com.mibanco.CrearClienteCDTDigital.ts.gen.type.ClienteCDTDigitalType;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import jakarta.validation.Validator;
import jakarta.ws.rs.core.Response;


import static com.mibanco.CrearClienteCDTDigital.ts.constants.Constans.ERROR_VALIDACION;

@ApplicationScoped
public class ClienteCdtDigitalValidator {

    @Inject
    Validator validator;

    public Response verificarDatosClienteCdtDigital(ClienteCDTDigitalType clienteCDTDigitalType)
            throws ApplicationException {

        if (clienteCDTDigitalType.getTelefonoPrincipal() == null) {
            throw new ApplicationException(ERROR_VALIDACION  + " Teléfono principal no puede estar vacio");
        }
        return Response.ok().build();
    }

}
