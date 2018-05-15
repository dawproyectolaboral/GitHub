package com.dawes.premio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Cliente;
import com.dawes.modelo.Premio;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class InsertarPremioAccion extends Accion{

	
	ServiceGenericDAO su = new ServiceGenericDAOImp();
	
	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		/*nombre,descripcion,imagen,fechaactivacion,fechaconsumo,puntos,idcliente*/
		
		String nombrecliente = request.getParameter("ganador");
		Cliente cliente = (Cliente)su.getDetalleCliente(nombrecliente);
		String nombre = request.getParameter("nombrepremio");
		String descripcion = request.getParameter("descripcion");
		String imagen = request.getParameter("imagen");
		
		
		Date Fechaactivacion = null;
		
		String fechadeactivacion = request.getParameter("fechadeactivacion");
		SimpleDateFormat formatoDelTexto1 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Fechaactivacion = formatoDelTexto1.parse(fechadeactivacion);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date fechaconsumo = null;
		String fechadeconsumo = request.getParameter("fechadeconsumo");
		SimpleDateFormat formatoDelTexto2 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			fechaconsumo = formatoDelTexto1.parse(fechadeconsumo);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String puntos = request.getParameter("puntos");
		Integer puntosInt = Integer.parseInt(puntos);
		
		Premio premio = new Premio(cliente, nombre, descripcion, imagen, Fechaactivacion,fechaconsumo, puntosInt);
		
		Set<Premio> premiosclie = cliente.getPremios();
		cliente.setPuntosacumulados(premio.getPuntos());
		premiosclie.add(premio);
		cliente.setPremios(premiosclie);
		su.update(cliente);
		
		su.insertar(premio);
			
		return "index.html";
	}

}
