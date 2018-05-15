package com.dawes.pCultural;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Parada;
import com.dawes.modelo.Pruebacultural;
import com.dawes.modelo.Pruebacultural;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class MostrarPCulturalAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		
		String nombrePCultural = request.getParameter("nombre");
		Pruebacultural pCultural = (Pruebacultural) su.getDetallePruebaCultural(nombrePCultural);
		
		Integer convertir = pCultural.getIdpruebacultural();
		String idPCultural = String.valueOf(convertir);
		request.setAttribute("idpruebacultural", idPCultural);
		
		String nomPCultural = pCultural.getNombre();
		request.setAttribute("nombre", nomPCultural);
		
		
		String pregunta = pCultural.getPregunta();
		request.setAttribute("pregunta", pregunta);
		
		String respuesta = pCultural.getRespuesta();
		request.setAttribute("respuesta", respuesta);
		
		
		Integer puntosInt = pCultural.getPuntos();
		String puntos = String.valueOf(puntosInt);
		request.setAttribute("puntos", puntos);
			
	
		return "contenido/pCulturales/ConfirmarBuscarPCultural.jsp";
		
	}

}