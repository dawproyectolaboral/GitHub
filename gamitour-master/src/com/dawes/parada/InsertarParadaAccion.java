package com.dawes.parada;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Itinerario;
import com.dawes.modelo.Parada;
import com.dawes.modelo.Pruebacultural;
import com.dawes.modelo.Pruebadeportiva;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class InsertarParadaAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ServiceGenericDAO su = new ServiceGenericDAOImp();
	
	
		Itinerario itinerario =(Itinerario)su.getDetalleItinerario(request.getParameter("nomItinerario"));
		
		String nombre = request.getParameter("nomParada");
		
		List<Parada> paradas = su.getMostrarParadas();
		Integer numeroParadaInt = null;
		
		int ultimaParada = paradas.size();
		numeroParadaInt = ultimaParada+1;
		
		
		//String numeroParada = request.getParameter("numParada");
		//Integer numeroParadaInt = Integer.parseInt(numeroParada);
		
		
		String ubicacion = request.getParameter("ubicParada");
		String historia = request.getParameter("histParada");
		String anecdotario = request.getParameter("anecParada");
		String gastronomia = request.getParameter("gastroParada");
		String imagen = request.getParameter("imgParada");
		
		Set<Pruebacultural> pruebaculturals = new HashSet<Pruebacultural>(0);
		Set<Pruebadeportiva> pruebadeportivas = new HashSet<Pruebadeportiva>(0);
		
		Parada parada = new Parada(itinerario, nombre, numeroParadaInt, ubicacion, historia, anecdotario, gastronomia, imagen, pruebaculturals, pruebadeportivas);

		Set<Parada> itineparadas = itinerario.getParadas();
		itineparadas.add(parada);
		itinerario.setParadas(itineparadas);
		su.update(itinerario);
		
		su.insertar(parada);
				
		return "index.html";
	}

}
