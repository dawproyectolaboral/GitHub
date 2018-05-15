package com.dawes.pCultural;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Parada;
import com.dawes.modelo.Pruebacultural;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class InsertarPCultural extends Accion {
	

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String numeroParada = request.getParameter("numParada");
		Integer numParada = Integer.parseInt(numeroParada);
		Parada parada = (Parada) su.getDetalleParada(numParada);
		
		
		String nombre = request.getParameter("nombre");
		
		String pregunta = request.getParameter("pregunta");
		String respuesta = request.getParameter("respuesta");
		
		String puntosString = request.getParameter("puntos");
		Integer puntos = Integer.parseInt(puntosString);
		
		Pruebacultural pCultural = new Pruebacultural(parada, nombre, pregunta, respuesta, puntos);
				
		Set<Pruebacultural> pcparada = parada.getPruebaculturals();
		pcparada.add(pCultural);
		parada.setPruebaculturals(pcparada);
		su.update(parada);
		
		su.insertar(pCultural);
		
		return "index.html";
	}
}
	