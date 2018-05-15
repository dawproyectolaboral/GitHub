package com.dawes.pCultural;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Parada;
import com.dawes.modelo.Pruebacultural;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class ModificarPCulturalAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ServiceGenericDAO service = new ServiceGenericDAOImp();
		Pruebacultural pcultural = (Pruebacultural)service.getDetallePruebaCultural(request.getParameter("nombre"));
		
		pcultural.setNombre(request.getParameter("nombreNuevo"));
		pcultural.setPregunta(request.getParameter("preguntaNueva"));
		pcultural.setRespuesta(request.getParameter("respuestaNueva"));
		
		String recepcion = request.getParameter("puntosNuevos");
		int puntosNuevos = Integer.parseInt(recepcion);
		pcultural.setPuntos(puntosNuevos);

		service.update(pcultural);

		return "index.html";
	}
}