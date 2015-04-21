package com.mistrutswebapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.mistrutswebapp.beans.LoginBean;
import com.mistrutswebapp.beans.UsuarioBean;

/**
 * <p>Descripcion general de lo que hace esta clase</p>
 * @author Autor
 * @version Version
 */
public class AltaAction extends Action {
	
	 private static Log log = LogFactory.getLog(PageHomeAction.class);
	  
	  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
	  {
	    if (log.isInfoEnabled())
	    { 
	      log.info("In AltaAction");	
	    }

	    UsuarioBean usuarioBean = (UsuarioBean)form;
		 HttpSession session= request.getSession();

		if (usuarioBean.getUser_ID() == null)
		{
			log.info("In AltaAction: usuario no registrado");
			return mapping.findForward("aborted");
		}
		else
		{
			log.info("In AltaAction: usuario registrado: "+usuarioBean.getUser_ID());
			return mapping.findForward("succes");
		}
		  
	  }

}
