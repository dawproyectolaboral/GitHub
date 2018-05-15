package com.dawes.multimedia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Multimedia;
import com.dawes.modelo.Pruebadeportiva;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class ModificarMultimediasAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		

		Multimedia multimedia=(Multimedia)su.getDetalleMultimedia(request.getParameter("titulo"));
		
		Date fecha = null;
		
		try {
			
			String Fecha = request.getParameter("fechaNueva");
			
			SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
			
			String strFecha = Fecha;
			
			fecha = formatoDelTexto.parse(strFecha);
			
			multimedia.setFecha(fecha);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		multimedia.setComentario(request.getParameter("comentarioNuevo"));
		
		multimedia.setImagen(request.getParameter("imagenNueva"));
		
		multimedia.setVideo(request.getParameter("videoNuevo"));
		
		String pCambio  = request.getParameter("puntosacumuladosNuevo");
		
		Integer puntos = Integer.parseInt(pCambio);
		
		multimedia.setPuntosacumulados(puntos);
		
		multimedia.setTitulo(request.getParameter("tituloNuevo"));
		
		
		su.update(multimedia);
	

		return "index.html";
		
	
	}

}
