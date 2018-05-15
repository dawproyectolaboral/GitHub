package com.dawes.actividades;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Actividad;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class ModificarActividadesPasoAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		//metodo para poder recoger con post y no por get
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String nombreActividad = request.getParameter("nombreActividad");
		
		Actividad actividad = (Actividad) su.getDetalleActividad(nombreActividad);
		
		request.setAttribute("idactividad", actividad.getIdactividad());
		request.setAttribute("nombre",actividad.getNombre());
		request.setAttribute("fechaInicio",actividad.getFechainicio());
		request.setAttribute("fechaFin",actividad.getFechafin());
		request.setAttribute("ubicacion",actividad.getUbicacion());
		request.setAttribute("numParticipantes",actividad.getNumparticipantes());
		request.setAttribute("precio",actividad.getPrecio());
		request.setAttribute("imagen",actividad.getImagen());
		request.setAttribute("puntos",actividad.getPuntos());
		

		
		return "contenido/actividades/ModificarActividades.jsp";
	}

}
