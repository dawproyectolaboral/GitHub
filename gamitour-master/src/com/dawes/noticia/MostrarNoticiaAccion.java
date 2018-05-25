package com.dawes.noticia;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Noticia;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class MostrarNoticiaAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String nombreNoticia = request.getParameter("nombrenoticia");
		
		Noticia noticia = (Noticia)su.getDetalleNoticia(nombreNoticia);
		
		Integer id = noticia.getIdnoticia();
		request.setAttribute("id", id);
		
		String nombrenoticia = noticia.getNombre();
		request.setAttribute("nombrenoticia", nombrenoticia);
		
		String textonoticia = noticia.getTexto();
		request.setAttribute("texto", textonoticia);
		
		Date fechadealta = noticia.getFechaalta();
		DateFormat fecha1 = new SimpleDateFormat("MM/dd/yyyy");
		String fechaFString = fecha1.format(fechadealta);
		request.setAttribute("fechaf", fechaFString);
		
		Date fechadecaducidad = noticia.getFechacaducidad();
		DateFormat fecha2 = new SimpleDateFormat("MM/dd/yyyy");
		String fechaF2String = fecha2.format(fechadecaducidad);
		request.setAttribute("fechac", fechaF2String);
		
		String imagen = noticia.getImagen();
		request.setAttribute("imagen", imagen);
		
		return "contenido/noticias/ConfirmarBuscarNoticia.jsp";
	}

}
