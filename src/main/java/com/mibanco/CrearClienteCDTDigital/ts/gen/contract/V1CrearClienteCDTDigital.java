package com.mibanco.CrearClienteCDTDigital.ts.gen.contract;

import com.mibanco.CrearClienteCDTDigital.ts.gen.type.ClienteCDTDigitalType;
import com.mibanco.CrearClienteCDTDigital.ts.gen.type.CrearClienteCDTDigitalOutput;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;



import java.io.InputStream;
import java.util.Map;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

@Path("/v1/ts/clienteCDT")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-29T11:08:25.362111700-05:00[America/Bogota]")
public interface V1CrearClienteCDTDigital {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    List<CrearClienteCDTDigitalOutput> crearClienteCDTDigital(@Valid ClienteCDTDigitalType clienteCDTDigitalType);
}
