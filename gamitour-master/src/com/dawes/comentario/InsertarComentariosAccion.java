package com.dawes.comentario;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Comentario;
import com.dawes.modelo.Multimedia;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class InsertarComentariosAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		ServiceGenericDAO su = new ServiceGenericDAOImp();
		 
		Cliente cliente = (Cliente)su.getDetalleCliente(request.getParameter("nick"));	
		
		Multimedia multimedia = (Multimedia)su.getDetalleMultimedia(request.getParameter("titulo"));

		String texto=request.getParameter("texto");

		Comentario comentario = new Comentario(cliente,multimedia,texto);
		
		Set<Comentario> comentarios = cliente.getComentarios();
		comentarios.add(comentario);
		cliente.setComentarios(comentarios);
		su.update(cliente);
		
		Set<Comentario> comentarios2 = multimedia.getComentarios();
		comentarios2.add(comentario);
		multimedia.setComentarios(comentarios2);
		su.update(multimedia);
		
		
		
		su.insertar(comentario);
		
		
		return "index.html";
	
	}

}
