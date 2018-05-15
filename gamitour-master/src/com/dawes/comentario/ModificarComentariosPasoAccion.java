package com.dawes.comentario;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Comentario;
import com.dawes.modelo.Multimedia;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class ModificarComentariosPasoAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String id = request.getParameter("idcomentario");
		
		Integer idcomentario = Integer.parseInt(id);
		
		Comentario comentario = (Comentario) su.getDetalleComentario(idcomentario);
	
		request.setAttribute("clieViejo", comentario.getCliente());
		request.setAttribute("idcomentario", comentario.getIdcomentario());
		request.setAttribute("texto", comentario.getTexto());
		request.setAttribute("listClie", su.getMostrarClientes());
		request.setAttribute("listMulti", su.getMostrarMultimedias());
		
		
		return "contenido/comentarios/ModificarComentarios.jsp";
	}

}
