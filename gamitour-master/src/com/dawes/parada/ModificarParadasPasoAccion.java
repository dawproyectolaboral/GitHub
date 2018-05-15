package com.dawes.parada;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Parada;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class ModificarParadasPasoAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String numeroParada = request.getParameter("numeroParada");
		Integer numero = Integer.valueOf(numeroParada);
		
		Parada parada = (Parada) su.getDetalleParada(numero);
		
		request.setAttribute("numeroParada", parada.getNumeroParada() );
		request.setAttribute("nombre", parada.getNombre() );
		request.setAttribute("ubicacion", parada.getUbicacion() );
		request.setAttribute("historia", parada.getHistoria() );
		request.setAttribute("anecdotario", parada.getAnecdotario());
		request.setAttribute("gastronomia", parada.getGastronomia());
		request.setAttribute("imagen", parada.getImagen() );

		
		return "contenido/paradas/ModificarParadas.jsp";
	}
	
}
