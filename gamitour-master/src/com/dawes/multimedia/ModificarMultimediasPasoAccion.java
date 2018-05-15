package com.dawes.multimedia;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Multimedia;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class ModificarMultimediasPasoAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		Multimedia multimedia = (Multimedia) su.getDetalleMultimedia(request.getParameter("titulo"));
		
		request.setAttribute("cliente", multimedia.getCliente());
		request.setAttribute("pd", multimedia.getPruebadeportiva());
		request.setAttribute("fecha", multimedia.getFecha());
		request.setAttribute("comentario",multimedia.getComentario());
		request.setAttribute("imagen", multimedia.getImagen());
		request.setAttribute("video", multimedia.getVideo());
		request.setAttribute("puntos", multimedia.getPuntosacumulados());
		request.setAttribute("titulo", multimedia.getTitulo());
		

		
		return "contenido/multimedias/ModificarMultimedias.jsp";
	}

}
