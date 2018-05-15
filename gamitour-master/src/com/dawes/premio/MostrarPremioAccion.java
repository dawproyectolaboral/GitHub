package com.dawes.premio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dawes.modelo.Premio;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class MostrarPremioAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		String nombrePremio = request.getParameter("nombrepremio");
		
		Premio premio = (Premio)su.getDetallePremio(nombrePremio);
		
		Integer id = premio.getIdpremio();
		request.setAttribute("id", id);
		
		/*Cliente clientes = premio.getCliente();*/
		
		String nombre = premio.getNombre();
		request.setAttribute("nombrepremio", nombre);
		
		String descripcion = premio.getDescripcion();
		request.setAttribute("descripcion", descripcion);
		
		String imagen = premio.getImagen();
		request.setAttribute("imagen", imagen);

		Date fechaa = premio.getFechaactivacion();
		DateFormat fecha1 = new SimpleDateFormat("yyyy/MM/dd");
		String fechaactivacion = fecha1.format(fechaa);
		request.setAttribute("fechadeactivacion", fechaactivacion);
		
		Date fechadeconsumo = premio.getFechaconsumo();
		DateFormat fecha2 = new SimpleDateFormat("yyyy/MM/dd");
		String fechaF2String = fecha2.format(fechadeconsumo);
		request.setAttribute("fechaconsumo", fechaF2String);
		
		Integer puntos = premio.getPuntos();
		request.setAttribute("puntos", puntos);
		
		return "contenido/premios/ConfirmarBuscarPremio.jsp";
	}

}
