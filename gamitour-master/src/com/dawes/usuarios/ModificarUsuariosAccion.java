package com.dawes.usuarios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;

import com.dawes.service.ServiceGenericDAO;

import com.dawes.serviceImp.ServiceGenericDAOImp;

import com.dawes.util.Accion;

public class ModificarUsuariosAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		

		Cliente c=(Cliente)su.getDetalleCliente(request.getParameter("nick"));
		
		c.setNombre(request.getParameter("nombreNuevo"));
		c.setApellidos(request.getParameter("apellidosNuevo"));
		c.setEmail(request.getParameter("emailNuevo"));
		c.setPassword(request.getParameter("passwordNuevo"));
		
		Date fecha = null;
		try {
			String fechaNacimiento = request.getParameter("fechaNacimientoNuevo");
			SimpleDateFormat formatoDelTexto = new SimpleDateFormat("MM/dd/yyyy");
			String strFecha = fechaNacimiento;
			fecha = formatoDelTexto.parse(strFecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.setTelefono(request.getParameter("telefonoNuevo"));
		c.setDireccion(request.getParameter("direccionNuevo"));
		c.setCodigopostal(request.getParameter("cpNuevo"));
		su.update(c);
		//request.setAttribute("listaUsuarios", su.getUsuarios());

		return "index.html";
			}

}
