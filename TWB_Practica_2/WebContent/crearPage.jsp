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
	<link href="threeregion.css" rel="stylesheet" type="text/css" />
	<title>Crear perfil</title>
</head>
<body>
 	<jsp:directive.include file="header.jsp" /> 
 	<jsp:useBean id="loginBean" class= "com.mistrutswebapp.beans.LoginBean" scope="session"></jsp:useBean> 
 	<div id="content">
   		<p align="right">Usuario: 
			<jsp:getProperty property="user_ID" name="loginBean"/>
		</p>  
  	
		<h1>Página crear perfil</h1>
		<p>Aquí habrá que mostrar el formulario para rellenarlo.</p>
	<!--  <h1>Formulario de registro</h1>
<html:form action="/processlogin"> 
	<table>
				<tr>
					<td><label for="nombre">Nombre:</label></td>
					<td><html:text property="userName"/></td>
					 <td><html:errors property="userName" /></td>
				</tr>
				  <tr>
					<td><label for="apellidos">Apellidos</label></td>
					<td><html:text property="apellidos"/></td>
					<td><html:errors property="apellidos"/></td>
				</tr>
				<tr>
					<td><label for="password">Contraseña:</label></td>
					<td><html:password property="password"/></td>
					<td><html:errors property="password" /></td>
				</tr>-->
				<!--Repetimos la contraseña para validar?-->
				<!--  <tr>
					<td><label for="password2">Repita la Contraseña:</label></td>
					<td><input type="password" name="password2" value="" /></td>
				</tr>
				<tr>
					<td><label for="fe_nac">Fecha de Nacimiento:</label></td>
					<td><input type="text" name="fe_nac" value="" /></td>
				</tr>
				<tr>
					<td><label for="tfno">Teléfono</label></td>
					<td><html:text property="tfno"/></td>
					<td><html:errors property="tfno" /></td>
				</tr>
				<tr>
					<td><label for="email">Correo Electrónico:</label></td>
					<td><html:text property="email"/></td>
					<td><html:errors property="email" /></td>
				</tr>
				<tr>
					<td><html:submit>Submit</html:submit></td>
				</tr>
			</table>


 </html:form>-->
	



		<html:link action="home"><bean:message key="tohome.link" /></html:link>
	</div>
	<jsp:directive.include file="footer.jsp" />
</body>
</html:html>
</jsp:root>
