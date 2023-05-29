package com.mibanco.CrearClienteCDTDigital.ts.grpc;

import com.mibanco.CrearClienteCDTDigital.ts.gen.type.ClienteCDTDigitalType;
import com.mibanco.CrearClienteCDTDigital.ts.gen.type.CrearClienteCDTDigitalOutput;
import com.mibanco.CrearClienteCDTDigital.ts.service.impl.CrearClienteCDTDigitalServiceImpl;
import com.mibanco.CrearClienteCDTDigital.ts.utils.ApplicationException;
import com.mibanco.CrearClienteCDTDigital.ts.utils.ClienteCdtDigitalMapperGrpc;
import io.quarkus.grpc.GrpcService;
import io.smallrye.common.annotation.Blocking;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.mibanco.CrearClienteCDTDigital.ts.constants.Constans.ERROR_SERVICIO;

@GrpcService
public class CrearClienteCDTDigitalGrpcController extends ClienteCDTServiceGrpcGrpc.ClienteCDTServiceGrpcImplBase {

    private static final Logger LOG = LoggerFactory.getLogger(CrearClienteCDTDigitalGrpcController.class);

    @Inject
    CrearClienteCDTDigitalServiceImpl crearClienteCdtDigitalService;

    @Inject
    ClienteCdtDigitalMapperGrpc clienteCdtDigitalMapperGrpc;

    @Override
    @Blocking
    public void crearClienteCDT(ClienteCdtDigitalGrpc request, StreamObserver<Creado> responseObserver) {
        LOG.info("Inicia crear ClienteCdtDigital grpc");
        ClienteCDTDigitalType clienteCdtDigitalType = clienteCdtDigitalMapperGrpc.clienteGrpcToType(request);

        try {
            CrearClienteCDTDigitalOutput crearClienteCDTDigitalOutput = crearClienteCdtDigitalService.crearClienteCDTDigital(clienteCdtDigitalType);
            Creado response = Creado.newBuilder().setClienteCdtDigital(clienteCdtDigitalMapperGrpc.clienteCDTDigitalToGrpc(clienteCdtDigitalType)).build();
            responseObserver.onNext(response);

            LOG.info("Termina crear ClienteCdtDigital grpc");
            responseObserver.onCompleted();

        } catch (ApplicationException e) {
            LOG.info("Error crear ClienteCdtDigital grpc");
            throw new ApplicationException(ERROR_SERVICIO + e.getMessage() + "en crear ClienteCdtDigital grpc");
        }
    }
}
