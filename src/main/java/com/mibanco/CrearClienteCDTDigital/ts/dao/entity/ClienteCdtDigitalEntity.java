package com.mibanco.CrearClienteCDTDigital.ts.dao.entity;

import com.mibanco.CrearClienteCDTDigital.ts.gen.type.*;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "cliente_cdt_digital")
public class ClienteCdtDigitalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoTelefonoPrincipal;
    @Column(length = 12)
    private Integer telefonoPrincipal;
    private String tipoCorreoElectronico;
    private GeneroEnum genero;
    private Integer fechaNacimientoDia;
    private Integer fechaNacimientoMes;
    private Integer fechaNacimientoAno;
    private String lugarNacimientoPais;
    private DepartamentoEnum lugarNacimientoDpto;
    private CiudadEnum lugarNacimientoCiudad;
    private String nacionalidad;
    private Integer nivelConsulta;
    private Integer fechaExpedicionDocumentoDia;
    private Integer fechaExpedicionDocumentoMes;
    private Integer fechaExpedicionDocumentoAno;
    private String expedicionDocumentoPais;
    private DepartamentoEnum expedicionDocumentoDpto;
    private CiudadEnum expedicionDocumentoCiudad;
    private String paisResidencia;
    private String subActividadEconomica;
    private String ocupacion;
    private TipoActividadCIIUEnum actividadEconomicaCIIU;
    private SectorEconomicoEnum sectorEconomico;
    private Boolean registroBiometria;
    private Integer causalNoBiometria;
    private String direccionPersonal;
    private String direccionPersonalPais;
    private DepartamentoEnum direccionPersonalDpto;
    private CiudadEnum direccionPersonalCiudad;
    private String barrioDireccionPersonal;
    private String usoDireccionPersonal;
    private String tipoDireccionPersonal;
    private String categoriaDireccionPersonal;
    private String envioCorrespondencia;
    private Float ingresosMensuales;
    private Float patrimonio;
    private String declaracionOrigenFondos;
    private Boolean reconocimientoPublicoExtranjero;
    private Boolean reconocimientoPublicoNacional;
    private String segmento;
    private String nicho;
    private String canalContactoPreferido;
    private Integer asesorComercial;
    private String tipoVinculacion;
    private String porqueMedioSeEnteroDeNosotros;
    private Integer agenciaVinculacion;
    private Integer fechaDiligenciamientoFormularioDia;
    private Integer fechaDiligenciamientoFormularioMes;
    private Integer fechaDiligenciamientoFormularioAno;
    private Integer fechaVinculacionDia;
    private Integer fechaVinculacionMes;
    private Integer fechaVinculacionAno;
    private String lugarDiligenciamientoFormularioPais;
    private DepartamentoEnum lugarDiligenciamientoFormularioDpto;
    private CiudadEnum lugarDiligenciamientoFormularioCiudad;
    private Boolean residenteFiscalEnOtroPais;
    private Integer identificacionFiscal1;
    private Boolean direccionExtranjero;
    private Integer tin1;
    private String residenciaFiscalPais;
    private String clasificacionFatca;
    private Date fechaClasificacionFatca;
    private String clasificacionCRS;
    private Date fechaClasificacionCRS;
    private Boolean autorizacionEnvioCelularCorreo;
    private String canalEnvioCelularYCorreo;
    private String productoSolicitado;
    private String codigoNovedadListas;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "clienteBaseId")
    private ClienteBaseEntity clienteBase;


}
