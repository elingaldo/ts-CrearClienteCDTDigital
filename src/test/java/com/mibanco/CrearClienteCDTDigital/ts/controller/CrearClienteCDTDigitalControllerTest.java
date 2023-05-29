package com.mibanco.CrearClienteCDTDigital.ts.controller;


import com.mibanco.CrearClienteCDTDigital.ts.gen.type.ClienteCDTDigitalType;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.fasterxml.jackson.databind.ObjectMapper;
@QuarkusTest
public class CrearClienteCDTDigitalControllerTest {

    @Inject
    ObjectMapper objectMapper;

    @Mock
    private ObjectMapper mockObjectMapper;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCrearCliente() throws IOException {
        // Configurar el mock del ObjectMapper -X
        when(mockObjectMapper.readValue(any(byte[].class), any(Class.class))).thenReturn(new ClienteCDTDigitalType());

        // Preparación de datos
        String jsonString = new String(Files.readAllBytes(Paths.get("src/main/resources/ts-CrearClienteCDTDigital-api.json")), StandardCharsets.UTF_8);
        ClienteCDTDigitalType clienteType = objectMapper.readValue(jsonString, ClienteCDTDigitalType.class);

        // Envío de solicitud
        given()
                .contentType(ContentType.JSON)
                .body(clienteType)
                .when()
                .post("/v1/ts/clienteCDT")
                .then()
                .statusCode(200);
    }
}
