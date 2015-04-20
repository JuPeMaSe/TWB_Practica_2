package com.mistrutswebapp.beans;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.validator.ValidatorForm;
import com.mistrutswebapp.model.Perfil;

public class UsuarioBean extends ValidatorForm implements Serializable{
	private String user_ID;
	private String password;
	private String nombre;
	private String apellidos;
	private Date fe_Nac; //hay que revisar tipo
	private String tfno;
	private String email;
	private String userType; //Está limitado a 3 caracteres en la BD
	private Collection<Perfil> perfiles;
	
	public UsuarioBean(){
		super();
	}

	/**
	 * @return the user_ID
	 */
	public String getUser_ID() {
		return user_ID;
	}

	/**
	 * @param user_ID the user_ID to set
	 */
	public void setUser_ID(String user_ID) {
		this.user_ID = user_ID;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the fe_Nac
	 */
	public Date getFe_Nac() {
		return fe_Nac;
	}

	/**
	 * @param fe_Nac the fe_Nac to set
	 */
	public void setFe_Nac(Date fe_Nac) {
		this.fe_Nac = fe_Nac;
	}

	/**
	 * @return the tfno
	 */
	public String getTfno() {
		return tfno;
	}

	/**
	 * @param tfno the tfno to set
	 */
	public void setTfno(String tfno) {
		this.tfno = tfno;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @return the perfiles
	 */
	public Collection<Perfil> getPerfiles() {
		return perfiles;
	}

	/**
	 * @param perfiles the perfiles to set
	 */
	public void setPerfiles(Collection<Perfil> perfiles) {
		this.perfiles = perfiles;
	}
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request){
		ActionErrors errors = new ActionErrors();
		if(nombre == null || nombre.equals("")){
			errors.add("nombre", new ActionMessage("error.nombre"));
		}
		if(apellidos == null || apellidos.equals("")){
			errors.add("apellidos", new ActionMessage("error.apellidos"));
		}
		if(fe_Nac == null || fe_Nac.equals("")){
			errors.add("fe_Nac", new ActionMessage("error.fe_Nac"));
		}
		if(tfno == null || tfno.equals("")){
			errors.add("tfno", new ActionMessage("error.tfno"));
		}
		if(email == null || email.equals("")){
			errors.add("email", new ActionMessage("error.email"));
		}
		
		return errors;
	 }
}
