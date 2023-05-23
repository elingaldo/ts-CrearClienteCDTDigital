package com.mibanco.CrearClienteCDTDigital.ts.gen.contract;

import com.mibanco.CrearClienteCDTDigital.ts.gen.type.ClienteCDTDigitalType;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;



import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("/v1/ts/clienteCDT/{requestType}")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-23T12:21:28.724247800-05:00[America/Bogota]")
public interface V1CrearClienteCDTDigital {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<ClienteCDTDigitalType> crearClienteCdtDigital(@Valid ClienteCDTDigitalType clienteCDTDigitalType);
}
