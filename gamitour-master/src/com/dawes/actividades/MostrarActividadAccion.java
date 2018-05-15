package com.dawes.actividades;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Actividad;
import com.dawes.modelo.Cliente;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class MostrarActividadAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String nombreActividad = request.getParameter("nombreActividad");
		
		Actividad actividad = (Actividad)su.getDetalleActividad(nombreActividad);
		
		
		Integer id = actividad.getIdactividad();
		request.setAttribute("id", id);
		
		String nombre = actividad.getNombre();
		request.setAttribute("nombre", nombre);
		
		Date fechaInicio = actividad.getFechainicio();
		DateFormat fecha1 = new SimpleDateFormat("yyyy/MM/dd");
		String fechaIString = fecha1.format(fechaInicio);
		request.setAttribute("fechai", fechaIString);
		
		Date fechaFinal = actividad.getFechafin();
		DateFormat fecha2 = new SimpleDateFormat("yyyy/MM/dd");
		String fechaFString = fecha2.format(fechaFinal);
		request.setAttribute("fechaf", fechaFString);
		
		
		String ubicacion = actividad.getUbicacion();
		request.setAttribute("ubicacion", ubicacion);
		
		Integer participantes = actividad.getNumparticipantes();
		String participantesString = String.valueOf(participantes); 
		request.setAttribute("participantes", participantesString);
		
		Float precio = actividad.getPrecio();
		String precioString = String.valueOf(precio);
		request.setAttribute("precio", precioString);
		
		
		Integer puntos = actividad.getPuntos();
		String puntosString = String.valueOf(puntos);
		request.setAttribute("puntos", puntosString);
		
		Set<Cliente> clientes = actividad.getClientes();
		request.setAttribute("clientes", clientes);
		
		
		//return "actividades/ConfirmarBuscarActividad.jsp";
		return "contenido/actividades/ConfirmarBuscarActividad.jsp";
	}

}
