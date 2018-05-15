package com.dawes.pDeportiva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Parada;
import com.dawes.modelo.Pruebacultural;
import com.dawes.modelo.Pruebadeportiva;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class ModificarPDeportivaAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO service = new ServiceGenericDAOImp();
		
		Pruebadeportiva pdeportiva = (Pruebadeportiva)service.getDetallePruebaDeportiva(request.getParameter("nombre"));
		
		pdeportiva.setNombre(request.getParameter("nombreNuevo"));
		
		Date fecha = null;
		try {
			String fechaInicio = request.getParameter("fechainicioNueva");
			SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
			String strFecha = fechaInicio;
			fecha = formatoDelTexto.parse(strFecha);
			pdeportiva.setFechainicio(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Date fechaFin = null;
		try {
			String fechaFinal = request.getParameter("fechafinNueva");
			SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
			String strFecha = fechaFinal;
			fechaFin = formatoDelTexto.parse(strFecha);
			pdeportiva.setFechafin(fechaFin);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pdeportiva.setExplicacion(request.getParameter("explicacionNueva"));
		
		String recepcion = request.getParameter("puntosNuevos");
		int puntosNuevos = Integer.parseInt(recepcion);
		pdeportiva.setPuntos(puntosNuevos);
		
		String pdfNuevo = request.getParameter("pdfNuevo");
		pdeportiva.setPdf(pdfNuevo);
		
		String videoNuevo = request.getParameter("videoNuevo");
		pdeportiva.setVideo(videoNuevo);
		

		service.update(pdeportiva);

		return "index.html";
	}
}