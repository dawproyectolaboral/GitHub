package com.dawes.usuarios;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class ModificarUsuariosPasoAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		Cliente cliente = (Cliente) su.getDetalleCliente(request.getParameter("nick"));
		
		request.setAttribute("nombre", cliente.getNombre());
		request.setAttribute("apellidos", cliente.getApellidos());
		request.setAttribute("email", cliente.getEmail());
		request.setAttribute("nick", cliente.getNick());
		request.setAttribute("password", cliente.getPassword());
		request.setAttribute("fechanacimiento", cliente.getFechanacimiento());
		request.setAttribute("telefono", cliente.getTelefono());
		request.setAttribute("direccion", cliente.getDireccion());
		request.setAttribute("codigoPostal", cliente.getCodigopostal());
		
	
		
		return "contenido/usuarios/ModificarUsuarios.jsp";
	}

}
