package com.dawes.rol;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Rol;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class InsertarRolAccion extends Accion{
	
	ServiceGenericDAO su = new ServiceGenericDAOImp();
	
	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String nombre = request.getParameter("nombreRol");
		Set<Cliente> listado = new HashSet<Cliente>(0);
		
		Rol rol = new Rol(nombre,listado);
		
		su.insertar(rol);
		
		return "index.html";
	}

}
