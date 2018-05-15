package com.dawes.multimedia;

import java.util.Date;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Comentario;
import com.dawes.modelo.Multimedia;
import com.dawes.modelo.Voto;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class MostrarMultimediaAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String busqueda = request.getParameter("titulo");
		Multimedia multimedia = (Multimedia)su.getDetalleMultimedia(busqueda);
		
		Integer convertir = multimedia.getIdmultimedia();
		String idmultimedia = String.valueOf(convertir);
		request.setAttribute("idmultimedia", idmultimedia);
		
		String cliente = multimedia.getCliente().getNick();
		request.setAttribute("cliente", cliente);
		
		String pruebad = multimedia.getPruebadeportiva().getNombre();
		request.setAttribute("pruebad", pruebad);
		
		Date convertir1 = multimedia.getFecha();
		String fecha = String.valueOf(convertir1);
		request.setAttribute("fecha", fecha);
		
		String comentario = multimedia.getComentario();
		request.setAttribute("comentario", comentario);
		
		String imagen = multimedia.getImagen();
		request.setAttribute("imagen", imagen);
		
		String video = multimedia.getVideo();
		request.setAttribute("video", video);
		
		Integer convertir2 = multimedia.getPuntosacumulados();
		String puntos = String.valueOf(convertir2);
		request.setAttribute("puntos", puntos);
		
		String titulo = multimedia.getTitulo();
		request.setAttribute("titulo", titulo);
		
		Set<Comentario> comentarios = multimedia.getComentarios();
		request.setAttribute("comentarios", comentarios);
		
		Set<Voto> votos = multimedia.getVotos();
		request.setAttribute("votos", votos);
		
		
		
		
		return "contenido/multimedias/ConfirmarBuscarMultimedia.jsp";
	}

}
