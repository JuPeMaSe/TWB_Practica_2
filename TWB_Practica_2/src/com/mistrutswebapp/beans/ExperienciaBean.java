package com.mistrutswebapp.beans;

import java.io.Serializable;

public class ExperienciaBean implements Serializable{
	
	private String exp_ID;//Campo Int en la base de datos
	private String empresa;
	private String cargo;
	private String a_Inicio;//Campo Int en la base de datos
	private String a_Fin;//Campo Int en la base de datos
	
	
	public ExperienciaBean(){
		
	}
	
	/*Los campos Int, creo recordar que vi en el libro como controlarlos
	 * Lo miraré y modificaré este bean.
	 */
	public String getExp_ID() {
		return exp_ID;
	}
	public void setExp_ID(String exp_ID) {
		this.exp_ID = exp_ID;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getA_Inicio() {
		return a_Inicio;
	}
	public void setA_Inicio(String a_Inicio) {
		this.a_Inicio = a_Inicio;
	}
	public String getA_Fin() {
		return a_Fin;
	}
	public void setA_Fin(String a_Fin) {
		this.a_Fin = a_Fin;
	}
	
	

}
