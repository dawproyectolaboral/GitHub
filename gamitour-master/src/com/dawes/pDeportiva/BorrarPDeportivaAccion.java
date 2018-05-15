package com.dawes.pDeportiva;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Multimedia;
import com.dawes.modelo.Parada;
import com.dawes.modelo.Pruebadeportiva;
import com.dawes.modelo.Voto;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class BorrarPDeportivaAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String nombrePDeportiva = request.getParameter("nombrePDeportivaBorrar");
		
		su.borrar((Pruebadeportiva)su.getDetallePruebaDeportiva(nombrePDeportiva));
		

		return "index.html";
		
		
	}

}
