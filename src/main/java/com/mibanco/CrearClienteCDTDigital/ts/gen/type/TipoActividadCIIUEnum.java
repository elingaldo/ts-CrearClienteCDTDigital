package com.mibanco.CrearClienteCDTDigital.ts.gen.type;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TipoActividadCIIUEnum
 */
public enum TipoActividadCIIUEnum {
  
  _0010_ASALARIADOS("0010 ASALARIADOS"),
  
  _0081_SIN_ACTIVIDAD_ECONOMICA("0081 SIN ACTIVIDAD ECONOMICA"),
  
  _0082_PERSONAS_NATURALES_SUBSIDIADAS_POR_TERCEROS("0082 PERSONAS NATURALES SUBSIDIADAS POR TERCEROS"),
  
  _0090_RENTISTAS_DE_CAPITAL_SOLO_PARA_PERSONAS_NATUR("0090 RENTISTAS DE CAPITAL SOLO PARA PERSONAS NATUR"),
  
  _0111_CULTIVO_DE_CEREALES_EXCEPTO_ARROZ_LEGUMBRE("0111 CULTIVO DE CEREALES (EXCEPTO ARROZ), LEGUMBRE"),
  
  _0112_CULTIVO_DE_ARROZ("0112 CULTIVO DE ARROZ"),
  
  _0113_CULTIVO_DE_HORTALIZAS_RAICES_Y_TUBERCULOS("0113 CULTIVO DE HORTALIZAS, RAICES Y TUBERCULOS"),
  
  _0114_CULTIVO_DE_TABACO("0114 CULTIVO DE TABACO"),
  
  _0115_CULTIVO_DE_PLANTAS_TEXTILES("0115 CULTIVO DE PLANTAS TEXTILES"),
  
  _0119_OTROS_CULTIVOS_TRANSITORIOS_N_C_P_("0119 OTROS CULTIVOS TRANSITORIOS N.C.P."),
  
  _0121_CULTIVO_DE_FRUTAS_TROPICALES_Y_SUBTROPICALES("0121 CULTIVO DE FRUTAS TROPICALES Y SUBTROPICALES");

  private String value;

  TipoActividadCIIUEnum(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static TipoActividadCIIUEnum fromString(String s) {
      for (TipoActividadCIIUEnum b : TipoActividadCIIUEnum.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TipoActividadCIIUEnum fromValue(String value) {
    for (TipoActividadCIIUEnum b : TipoActividadCIIUEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


