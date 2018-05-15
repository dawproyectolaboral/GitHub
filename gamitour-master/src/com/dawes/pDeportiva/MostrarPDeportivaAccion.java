package com.dawes.pDeportiva;

import java.text.DateFormat;
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

public class MostrarPDeportivaAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		
		String nombrePDeportiva = request.getParameter("nombre");
		Pruebadeportiva pDeportiva = (Pruebadeportiva) su.getDetallePruebaDeportiva(nombrePDeportiva);
		
		Integer convertir = pDeportiva.getIdpruebadeportiva();
		String idPDeportiva = String.valueOf(convertir);
		request.setAttribute("idpruebadeportiva", idPDeportiva);
		
		String nomPDeportiva = pDeportiva.getNombre();
		request.setAttribute("nombre", nomPDeportiva);
		
		Date fechaInicioDate = pDeportiva.getFechainicio();
		DateFormat formatoFechaInicio = new SimpleDateFormat("yyyy/MM/dd");
		String fechaInicioString = formatoFechaInicio.format(fechaInicioDate);
		request.setAttribute("fechainicio", fechaInicioString);
		
		Date fechaFinDate = pDeportiva.getFechafin();
		DateFormat formatoFechaFin = new SimpleDateFormat("yyyy/MM/dd");
		String fechaFinString = formatoFechaFin.format(fechaFinDate);
		request.setAttribute("fechafin", fechaFinString);
		
		String explicacion = pDeportiva.getExplicacion();
		request.setAttribute("explicacion", explicacion);
		
		Integer puntosInt = pDeportiva.getPuntos();
		String puntos = String.valueOf(puntosInt);
		request.setAttribute("puntos", puntos);
		
		
			
	
		return "contenido/pDeportivas/ConfirmarBuscarPDeportiva.jsp";
		
	}

}