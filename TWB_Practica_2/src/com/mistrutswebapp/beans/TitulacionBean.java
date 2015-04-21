package com.mistrutswebapp.beans;

import java.io.Serializable;

public class TitulacionBean implements Serializable{
	
	private String titulacion_ID;
	private String nombre_Tit;
	
	public TitulacionBean(){
		
	}
	
	public String getTitulacion_ID() {
		return titulacion_ID;
	}
	public void setTitulacion_ID(String titulacion_ID) {
		this.titulacion_ID = titulacion_ID;
	}
	public String getNombre_Tit() {
		return nombre_Tit;
	}
	public void setNombre_Tit(String nombre_Tit) {
		this.nombre_Tit = nombre_Tit;
	}
	
	/*En principio no habría que implementar control de errores aquí
	 * puesto que la titulación puede estar vacía. ¿Me equivoco?
	 */

}
