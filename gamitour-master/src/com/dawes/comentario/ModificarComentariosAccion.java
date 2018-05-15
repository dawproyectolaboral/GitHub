package com.dawes.comentario;

import java.util.Iterator;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Actividad;
import com.dawes.modelo.Cliente;
import com.dawes.modelo.Comentario;
import com.dawes.modelo.Multimedia;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class ModificarComentariosAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String idcomentarios = request.getParameter("idcomentario");
		int id = Integer.parseInt(idcomentarios);	
		Comentario comentario=(Comentario)su.getDetalleComentario(id);
		
		Cliente cli = (Cliente) su.getDetalleCliente(request.getParameter("nickClienteNuevo"));
		
		Multimedia mult = (Multimedia) su.getDetalleMultimedia(request.getParameter("tituloMultimediaNuevo"));
		
		comentario.setCliente(cli);
		
		comentario.setMultimedia(mult);
		
		comentario.setTexto(request.getParameter("textoNuevo"));
		

		Set<Comentario> comentariosClie = cli.getComentarios();
		Iterator it = comentariosClie.iterator();
		while(it.hasNext()){
			Comentario com = (Comentario) it.next();
			if(com.getIdcomentario() == id){
				com.setTexto(request.getParameter("textoNuevo"));
			}
		}
		
		cli.setComentarios(comentariosClie);
		
		su.update(cli);
		
		
		Set<Comentario> comentariosMulti = mult.getComentarios();
		Iterator it2 = comentariosMulti.iterator();
		while(it.hasNext()){
			Comentario com = (Comentario) it2.next();
			if(com.getIdcomentario() == id){
				com.setTexto(request.getParameter("textoNuevo"));
			}
		}
		
		mult.setComentarios(comentariosMulti);
		
		su.update(mult);
		
		su.update(comentario);
	

		return "index.html";
	}

}
