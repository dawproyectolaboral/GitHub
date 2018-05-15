package com.dawes.multimedia;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dawes.modelo.Actividad;
import com.dawes.modelo.Cliente;
import com.dawes.modelo.Comentario;
import com.dawes.modelo.Multimedia;
import com.dawes.modelo.Pruebadeportiva;
import com.dawes.modelo.Voto;
import com.dawes.service.ServiceGenericDAO;
import com.dawes.serviceImp.ServiceGenericDAOImp;
import com.dawes.util.Accion;

public class InsertarMultimediasConSelectAccion extends Accion{

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {

		ServiceGenericDAO su = new ServiceGenericDAOImp();
		
		request.setAttribute("listPD",su.getMostrarPruebasDeportiva());
		request.setAttribute("listado", su.getMostrarClientes());
	
		
		
		return "/contenido/multimedias/FormInsertarMultimedia.jsp";
	}

	
	}

