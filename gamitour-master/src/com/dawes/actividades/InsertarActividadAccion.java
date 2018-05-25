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
			SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
			String fecha1 = request.getParameter("fechaInicio");
			System.out.println("El valor del calendario es :"+ fecha1);
			fechaInicio = formatoDelTexto.parse(fecha1);
			System.out.println(fechaInicio);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fecha fin
			Date fechaFin = null;
			try {
				SimpleDateFormat formatoDelTexto2 = new SimpleDateFormat("yyyy-MM-dd");
				String fecha2 = request.getParameter("fechaFinal");
				fechaFin = formatoDelTexto2.parse(fecha2);
				System.out.println(fechaFin);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String ubica = request.getParameter("ubicacion");
			String ubicacion = ubica.substring(1,ubica.length()-1);
		
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
