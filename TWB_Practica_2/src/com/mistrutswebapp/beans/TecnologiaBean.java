package com.mistrutswebapp.beans;

import java.io.Serializable;

public class TecnologiaBean implements Serializable {
	
	private String tecnologia_ID;
	private String nombre_Tec;
	
	public TecnologiaBean(){
		
	}
	
	public String getTecnologia_ID() {
		return tecnologia_ID;
	}
	public void setTecnologia_ID(String tecnologia_ID) {
		this.tecnologia_ID = tecnologia_ID;
	}
	public String getNombre_Tec() {
		return nombre_Tec;
	}
	public void setNombre_Tec(String nombre_Tec) {
		this.nombre_Tec = nombre_Tec;
	}
	
	

}
