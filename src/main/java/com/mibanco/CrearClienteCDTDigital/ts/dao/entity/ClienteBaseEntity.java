package com.mibanco.CrearClienteCDTDigital.ts.dao.entity;

import com.mibanco.CrearClienteCDTDigital.ts.gen.type.TipoDocumentoEnum;
import com.mibanco.CrearClienteCDTDigital.ts.gen.type.TipoPersonaEnum;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "cliente_base")
public class ClienteBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer numeroCliente;
    private TipoPersonaEnum tipoPersona;
    private TipoDocumentoEnum tipoDocumento;
    private Integer numeroDocumento;
    private Date fechaExpedicionDocumento;
    private String primerNombre;
    private Integer numeroCelular;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String correoElectronico;

    @OneToMany(mappedBy = "clienteBase", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @ElementCollection
    private List<ClienteCdtDigitalEntity> clienteCDTDigitalEntityList;


    /*@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "clienteBase")
    private ClienteCdtDigitalEntity clienteCDTDigitalEntityList;*/


}
