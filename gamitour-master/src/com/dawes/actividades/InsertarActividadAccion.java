package com.dawes.actividades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Actividad;
import com.dawes.modelo.Cliente;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class InsertarActividadAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String nombre = request.getParameter("nombreActividad"); 
		//fecha inicio
		Date fechaInicio = null;
		try {
			String fecha1 = request.getParameter("fechaInicio");
			SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
			fechaInicio = formatoDelTexto.parse(fecha1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fecha fin
			Date fechaFin = null;
			try {
				String fecha2 = request.getParameter("fechaFinal");
				SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
				fechaFin = formatoDelTexto.parse(fecha2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		String ubicacion =request.getParameter("ubicacion"); 
		
		String numeroParticipantes = request.getParameter("participantes");
		Integer numeroParticipantesInt = Integer.parseInt(numeroParticipantes);
		
		String precio = request.getParameter("precio");
		Float precioFloat = Float.parseFloat(precio);
		
		String puntos = request.getParameter("puntos");
		Integer puntosInt = Integer.parseInt(puntos);
		
		String imagen = "sin imagen";
		
		Set<Cliente> listado = new HashSet<Cliente>(0);
		
		Actividad actividad = new Actividad(nombre,fechaInicio,fechaFin,ubicacion,numeroParticipantesInt,precioFloat,imagen,puntosInt,listado);
		
		
		
		
		
		su.insertar(actividad);
		
		return "index.html";
	}

}
