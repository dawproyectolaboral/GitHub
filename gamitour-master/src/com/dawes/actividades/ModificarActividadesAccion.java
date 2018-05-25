package com.dawes.actividades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dawes.modelo.Actividad;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class ModificarActividadesAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		Actividad actividad =(Actividad)su.getDetalleActividad(request.getParameter("nombre"));	
	
		
		Date fecha = null;
		try {
			String fechaInicio = request.getParameter("fechaNueva");
			
			SimpleDateFormat formatoDelTexto = new SimpleDateFormat("MM/dd/yyyy");
			
			String strFecha = fechaInicio;
			
			fecha = formatoDelTexto.parse(strFecha);
			
			actividad.setFechainicio(fecha);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Date fechaFin = null;
		try {
			String fechaFinal = request.getParameter("fechaFinNueva");
			
			SimpleDateFormat formatoDelTexto = new SimpleDateFormat("MM/dd/yyyy");
			
			String strFecha = fechaFinal;
			
			fechaFin = formatoDelTexto.parse(strFecha);
			
			actividad.setFechafin(fechaFin);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ubicaVieja = request.getParameter("ubicacionVieja");
		String ubica = request.getParameter("ubicacionNueva");
		if(ubica.charAt(0)=='('){
			ubica = ubica.substring(1,ubica.length()-1);
			actividad.setUbicacion(ubica);
		}else{
			actividad.setUbicacion(ubicaVieja);
		}
		
		String nCambio = request.getParameter("numparNuevo");
		
		Integer numero = Integer.parseInt(nCambio);
		
		actividad.setNumparticipantes(numero);
		
		String pCambio = request.getParameter("precioNuevo");
		
		Float precio = Float.parseFloat(pCambio);
		
		actividad.setPrecio(precio);
		
		actividad.setImagen(request.getParameter("imagenNueva"));
		
		String npuntos = request.getParameter("puntosNuevo");
		
		Integer cnumero = Integer.parseInt(npuntos);
		
		actividad.setPuntos(cnumero);
		
		su.update(actividad);

		return "index.html";
		
	}

}
