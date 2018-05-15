package com.dawes.parada;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Multimedia;
import com.dawes.modelo.Parada;
import com.dawes.modelo.Voto;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class BorrarParadaAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String numeroParada = request.getParameter("numParadaBorrar");
		System.out.println(numeroParada);
		Integer nParada = Integer.parseInt(numeroParada);
		
		su.borrar((Parada)su.getDetalleParada(nParada));
		

		return "index.html";
		
		
	}

}
