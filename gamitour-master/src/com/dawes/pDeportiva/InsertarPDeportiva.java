package com.dawes.pDeportiva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Multimedia;
import com.dawes.modelo.Parada;
import com.dawes.modelo.Pruebadeportiva;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class InsertarPDeportiva extends Accion {
	

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String numeroParada = request.getParameter("numParada");
		
		Integer numParada = Integer.parseInt(numeroParada);
	
		Parada parada = (Parada)su.getDetalleParada(numParada);
		
		String nombre = request.getParameter("nombre");
		
		String fechaInicioString = request.getParameter("fechaInicio");
		
		Date fechaInicioDate = null;
		
		SimpleDateFormat formateoFechaInicio = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			fechaInicioDate = formateoFechaInicio.parse(fechaInicioString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String fechaFinString = request.getParameter("fechaFin");
		Date fechaFinDate = null;
		SimpleDateFormat formateoFechaFin = new SimpleDateFormat("yyyy-MM-dd");
		try {
			fechaFinDate = formateoFechaFin.parse(fechaFinString);
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		String explicacion = request.getParameter("explicacion");
		
		String puntosString = request.getParameter("puntos");
		
		Integer puntos = Integer.parseInt(puntosString);
		
		Set<Multimedia> multimedias = new HashSet<Multimedia>(0);
		
		String pdf = request.getParameter("pdf");
		
		String video = request.getParameter("video");
		
		Pruebadeportiva pDeportiva = new Pruebadeportiva(parada, nombre, fechaInicioDate, fechaFinDate, explicacion, puntos, multimedias, pdf, video);
		
		Set<Pruebadeportiva> pruebasdeportivas = parada.getPruebadeportivas();
		pruebasdeportivas.add(pDeportiva);
		parada.setPruebadeportivas(pruebasdeportivas);
		su.update(parada);
		
		
		su.insertar(pDeportiva);
		
		return "index.html";
	}
}
	