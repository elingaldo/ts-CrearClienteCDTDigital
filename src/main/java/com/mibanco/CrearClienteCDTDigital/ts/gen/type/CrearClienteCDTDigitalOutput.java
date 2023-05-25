package com.mibanco.CrearClienteCDTDigital.ts.gen.type;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.mibanco.CrearClienteCDTDigital.ts.gen.type.NovedadCDTDigitalType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("crearClienteCDTDigitalOutput")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-25T11:57:41.407300200-05:00[America/Bogota]")
public class CrearClienteCDTDigitalOutput   {
  private @Valid Integer numeroCliente;
  private @Valid NovedadCDTDigitalType novedad;

  /**
   **/
  public CrearClienteCDTDigitalOutput numeroCliente(Integer numeroCliente) {
    this.numeroCliente = numeroCliente;
    return this;
  }

  
  @JsonProperty("numeroCliente")
  public Integer getNumeroCliente() {
    return numeroCliente;
  }

  @JsonProperty("numeroCliente")
  public void setNumeroCliente(Integer numeroCliente) {
    this.numeroCliente = numeroCliente;
  }

  /**
   **/
  public CrearClienteCDTDigitalOutput novedad(NovedadCDTDigitalType novedad) {
    this.novedad = novedad;
    return this;
  }

  
  @JsonProperty("novedad")
  public NovedadCDTDigitalType getNovedad() {
    return novedad;
  }

  @JsonProperty("novedad")
  public void setNovedad(NovedadCDTDigitalType novedad) {
    this.novedad = novedad;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrearClienteCDTDigitalOutput crearClienteCDTDigitalOutput = (CrearClienteCDTDigitalOutput) o;
    return Objects.equals(this.numeroCliente, crearClienteCDTDigitalOutput.numeroCliente) &&
        Objects.equals(this.novedad, crearClienteCDTDigitalOutput.novedad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroCliente, novedad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrearClienteCDTDigitalOutput {\n");
    
    sb.append("    numeroCliente: ").append(toIndentedString(numeroCliente)).append("\n");
    sb.append("    novedad: ").append(toIndentedString(novedad)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

