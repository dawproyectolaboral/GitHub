package com.dawes.parada;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Parada;
import com.dawes.modelo.Pruebacultural;
import com.dawes.modelo.Pruebadeportiva;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class MostrarParadaAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		
		String numeroParada = request.getParameter("numParada");
		Integer nParada = Integer.parseInt(numeroParada);
		Parada parada = (Parada)su.getDetalleParada(nParada);
		System.out.println(parada);
		
		Integer convertir = parada.getIdparada();
		String idParada = String.valueOf(convertir);
		request.setAttribute("idParada", idParada);
		
		String nomParada = parada.getNombre();
		request.setAttribute("nomParada", nomParada);
		
		Integer numeroParadaInt = parada.getNumeroParada();
		String numeroParada1 = String.valueOf(numeroParadaInt);
		request.setAttribute("nParada", numeroParada1);
		
		String ubicParada = parada.getUbicacion();
		request.setAttribute("ubicParada", ubicParada);
		
		String histParada = parada.getHistoria();
		request.setAttribute("histParada", histParada);
		
		String anecParada = parada.getAnecdotario();
		request.setAttribute("anecParada", anecParada);
		
		String gastParada = parada.getGastronomia();
		request.setAttribute("gastParada", gastParada);
		
		String imgParada = parada.getImagen();
		request.setAttribute("imgParada", imgParada);
		
		
		String itinerario = parada.getItinerario().getNombre();
		request.setAttribute("itinerario", itinerario);
		
		Set<Pruebacultural> pCulturales = parada.getPruebaculturals();
		request.setAttribute("pCulturales", pCulturales);
		
		Set<Pruebadeportiva> pDeportivas = parada.getPruebadeportivas();
		request.setAttribute("pDeportivas", pDeportivas);
		
	
		return "contenido/paradas/ConfirmarBuscarParada.jsp";
		
	}

}