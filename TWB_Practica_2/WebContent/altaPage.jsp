<?xml version="1.0" encoding="UTF-8"?>
<!-- File: home.jsp -->
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page"	
   xmlns:html="http://struts.apache.org/tags-html" 	
    xmlns:bean="http://struts.apache.org/tags-bean"	
   version="2.0">
<jsp:directive.page contentType="text/html"/>   
<jsp:output omit-xml-declaration="false"
 doctype-root-element="html"
 doctype-public="-//W3C//DTD XHTML 1.1//EN" 
 doctype-system="http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd" />
<html:html xhtml="true">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<link href="threeregion.css" rel="stylesheet" type="text/css" />
	<title>Alta de usuario</title>
</head>
<body>
	<jsp:directive.include file="header.jsp" />
	 	<jsp:useBean id="loginBean" class= "com.mistrutswebapp.beans.LoginBean" scope="session"></jsp:useBean> 
	<!-- <div id="content"> --> 
	  	<p align="right">Usuario: 
			<jsp:getProperty property="user_ID" name="loginBean"/>
		</p>
	 	<h1>Página de Alta</h1>
		<p>Aquí hay que desarrollar el formulario de alta de usuario.OkJuan</p>
		
		<html:form action="/processAlta"> 
	<table>
				<tr>
					<td>Nombre:</td>
					<td><html:text property="user_ID"/></td>
					 <td><html:errors property="user_ID" /></td>
				</tr>
				<tr>
					<td>Contraseña:</td>
					<td><html:password property="password"/></td>
					<td><html:errors property="password" /></td>
				</tr>
<!-- 				Repetimos la contraseña para validar? -->
<!-- 				<tr> -->
<!-- 					<td><label for="password2">Repita la Contraseña:</label></td> -->
<!-- 					<td><input type="password" name="password2" value="" /></td> -->
<!--  				</tr> -->
				 <tr>
					<td>Apellidos</td>
					<td><html:text property="nombre"/></td>
					<td><html:errors property="nombre"/></td>
				</tr>
				  <tr>
					<td>Apellidos</td>
					<td><html:text property="apellidos"/></td>
					<td><html:errors property="apellidos"/></td>
				</tr>
				
				<tr>
					<td>Fecha de Nacimiento:</td>
					<td><input type="text" name="fe_Nac" value="" /></td>
					<td><html:errors property="fe_Nac"/></td>
				</tr>
				<tr>
					<td>Teléfono</td>
					<td><html:text property="tfno"/></td>
					<td><html:errors property="tfno" /></td>
				</tr>
				<tr>
					<td>Correo Electrónico:</td>
					<td><html:text property="email"/></td>
					<td><html:errors property="email" /></td>
				</tr>
				 <tr>
					<td>Apellidos</td>
					<td><html:text property="userType"/>usu</td>
					<td><html:errors property="userType"/></td>
				</tr>
				<tr>
					<td><html:submit>Submit</html:submit></td>
				</tr>
			</table>


 	</html:form>
	
		
		
		 <html:link action="home"><bean:message key="tohome.link" /></html:link>
	<!-- </div> -->
	<jsp:directive.include file="footer.jsp" />
</body>
</html:html>
</jsp:root>
