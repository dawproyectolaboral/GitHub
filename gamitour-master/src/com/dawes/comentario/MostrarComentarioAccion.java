package com.dawes.comentario;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Comentario;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class MostrarComentarioAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String convertir = request.getParameter("idcomentario");
		
		Integer id = Integer.parseInt(convertir);
		
		Comentario comentario = (Comentario)su.getDetalleComentario(id);
	
		Integer convertirid = comentario.getIdcomentario();
		String idcomentario = String.valueOf(convertirid);
		request.setAttribute("id", idcomentario);
		
		String texto = comentario.getTexto();
		request.setAttribute("texto",texto);
		
		String cliente = comentario.getCliente().getNick();
		request.setAttribute("cliente", cliente);
		
		String multimedia = comentario.getMultimedia().getTitulo();
		request.setAttribute("multimedia", multimedia);
		
		return "contenido/comentarios/ConfirmarBuscarComentario.jsp";
	}

}
