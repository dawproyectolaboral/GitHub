package com.dawes.comentario;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Comentario;
import com.dawes.modelo.Multimedia;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class InsertarComentariosConSelectAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		ServiceGenericDAO su = new ServiceGenericDAOImp();

		request.setAttribute("listClie", su.getMostrarClientes());
		request.setAttribute("listMulti", su.getMostrarMultimedias());
		
		return "/contenido/comentarios/FormInsertarComentarioConSelect.jsp";
	
	}

}
