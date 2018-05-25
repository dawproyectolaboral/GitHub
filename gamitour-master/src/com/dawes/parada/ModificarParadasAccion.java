package com.dawes.parada;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Itinerario;
import com.dawes.modelo.Parada;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class ModificarParadasAccion extends Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		ServiceGenericDAO service = new ServiceGenericDAOImp();
		
		String recepcion = request.getParameter("numeroParada");
		int numeroParada = Integer.parseInt(recepcion);
		Parada parada = (Parada)service.getDetalleParada(numeroParada);
		
		parada.setNombre(request.getParameter("nombreNuevo"));
		String ubicaVieja = request.getParameter("ubicacionVieja");
		String ubica = request.getParameter("ubicacionNueva");
		
		if(ubica.charAt(0)=='('){
			ubica = ubica.substring(1,ubica.length()-1);
			parada.setUbicacion(ubica);
		}else{
			parada.setUbicacion(ubicaVieja);
		}
		
		
		parada.setHistoria(request.getParameter("historiaNueva"));
		parada.setAnecdotario(request.getParameter("anecdotarioNuevo"));
		parada.setGastronomia(request.getParameter("gastronomiaNueva"));
		parada.setImagen(request.getParameter("imagenNueva"));
		
		service.update(parada);
		
		return "index.html";
	}
}//Fin class
